package site.ycsb.db;

import site.ycsb.*;
import site.ycsb.Status;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

import org.zeromq.SocketType;
import org.zeromq.ZMQ;

import capsuleDBProtos.KvsPayload;
import capsuleDBProtos.CapsuleDBRequest.DBRequest;
import capsuleDBProtos.KvsPayload.Kvs_payload;

import org.zeromq.ZContext;

public class CapsuleDBClient extends DB {
    private ZContext context;
    private ZMQ.Socket socket;
    private String DELIMETER = ";";

    @Override
    public void init() throws DBException {
        this.context = new ZContext();
        // Socket to talk to server
        System.out.println("Connecting to CapsuleDB server");

        this.socket = context.createSocket(SocketType.DEALER);
        socket.connect("tcp://localhost:5555");

        System.out.println("Socket established");
    }

    // Read a single record
    @Override
    public Status read(String table, String key, Set<String> fields, Map<String, ByteIterator> result) {
        DBRequest.Builder request = DBRequest.newBuilder();

        request.setRequestedkey(key);
        byte[] serializedRequest = request.build().toByteArray();

        // Send request to CapsuleDB
        socket.send(serializedRequest, 0, serializedRequest.length, 0);

        // Receive the payload
        byte[] reply = socket.recv(0);

        // Deserialize Payload
        DBRequest retrievedRequest;
        try {
            retrievedRequest = DBRequest.parseFrom(reply);
        } catch (Exception parseException) {
            System.out.println("Deserialization failed");
            return Status.ERROR;
        }

        // Split value on delimiter
        String[] parts = retrievedRequest.getPayload().getValue().split(";");

        // Iterate through fields / retreived values and add to result
        for (int i = 0; i < parts.length; i += 2) {
            result.put(parts[i], new StringByteIterator(parts[i + 1]));
        }

        return Status.OK;
    }

    // Perform a range scan
    @Override
    public Status scan(String table, String startkey, int recordcount, Set<String> fields,
            Vector<HashMap<String, ByteIterator>> result) {
        // CapsuleDB does not currently support scans as there is no ID
        return Status.OK;
    }

    // Update a single record
    @Override
    public Status update(String table, String key, Map<String, ByteIterator> values) {
        insert(table, key, values);
        return Status.OK;
    }

    // Insert a single record
    @Override
    public Status insert(String table, String key, Map<String, ByteIterator> values) {
        // Create Request
        DBRequest.Builder request = DBRequest.newBuilder();
        KvsPayload.Kvs_payload.Builder payload = KvsPayload.Kvs_payload.newBuilder();
        payload.setKey(key);
        // Combine values and assign
        Map<String, String> stringifiedMap = StringByteIterator.getStringMap(values);
        String valuesCombined = "";
        for (String valuesKey : stringifiedMap.keySet()) {
            valuesCombined += valuesKey + ";" + stringifiedMap.get(valuesKey) + ";";
        }
        valuesCombined = valuesCombined.substring(0, valuesCombined.length() - 1);

        payload.setValue(valuesCombined);
        payload.setTxnTimestamp(Instant.now().getEpochSecond());
        request.setPayload(payload);
        // Serialize request
        byte[] serializedRequest = request.build().toByteArray();

        // Send via ZMQ
        socket.send(serializedRequest, 0, serializedRequest.length, 0);

        return Status.OK;
    }

    // Delete a single record
    @Override
    public Status delete(String table, String key) {
        // CapsuleDB does not currently support deletes to due DataCapsule format
        return Status.OK;
    }
}
