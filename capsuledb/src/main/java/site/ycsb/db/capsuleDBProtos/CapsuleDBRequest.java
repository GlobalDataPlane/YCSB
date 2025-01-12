// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: capsuleDBRequest.proto

package capsuleDBProtos;

public final class CapsuleDBRequest {
  private CapsuleDBRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DBRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:capsuleDBProtos.DBRequest)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 requestingEnclaveID = 1;</code>
     * @return Whether the requestingEnclaveID field is set.
     */
    boolean hasRequestingEnclaveID();
    /**
     * <code>optional int32 requestingEnclaveID = 1;</code>
     * @return The requestingEnclaveID.
     */
    int getRequestingEnclaveID();

    /**
     * <code>optional string requestedkey = 2;</code>
     * @return Whether the requestedkey field is set.
     */
    boolean hasRequestedkey();
    /**
     * <code>optional string requestedkey = 2;</code>
     * @return The requestedkey.
     */
    java.lang.String getRequestedkey();
    /**
     * <code>optional string requestedkey = 2;</code>
     * @return The bytes for requestedkey.
     */
    com.google.protobuf.ByteString
        getRequestedkeyBytes();

    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     * @return Whether the payload field is set.
     */
    boolean hasPayload();
    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     * @return The payload.
     */
    capsuleDBProtos.KvsPayload.Kvs_payload getPayload();
    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     */
    capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder getPayloadOrBuilder();
  }
  /**
   * Protobuf type {@code capsuleDBProtos.DBRequest}
   */
  public static final class DBRequest extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:capsuleDBProtos.DBRequest)
      DBRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DBRequest.newBuilder() to construct.
    private DBRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DBRequest() {
      requestedkey_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DBRequest();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DBRequest(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              bitField0_ |= 0x00000001;
              requestingEnclaveID_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              requestedkey_ = bs;
              break;
            }
            case 26: {
              capsuleDBProtos.KvsPayload.Kvs_payload.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = payload_.toBuilder();
              }
              payload_ = input.readMessage(capsuleDBProtos.KvsPayload.Kvs_payload.PARSER, extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(payload_);
                payload_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return capsuleDBProtos.CapsuleDBRequest.internal_static_capsuleDBProtos_DBRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return capsuleDBProtos.CapsuleDBRequest.internal_static_capsuleDBProtos_DBRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              capsuleDBProtos.CapsuleDBRequest.DBRequest.class, capsuleDBProtos.CapsuleDBRequest.DBRequest.Builder.class);
    }

    private int bitField0_;
    public static final int REQUESTINGENCLAVEID_FIELD_NUMBER = 1;
    private int requestingEnclaveID_;
    /**
     * <code>optional int32 requestingEnclaveID = 1;</code>
     * @return Whether the requestingEnclaveID field is set.
     */
    @java.lang.Override
    public boolean hasRequestingEnclaveID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 requestingEnclaveID = 1;</code>
     * @return The requestingEnclaveID.
     */
    @java.lang.Override
    public int getRequestingEnclaveID() {
      return requestingEnclaveID_;
    }

    public static final int REQUESTEDKEY_FIELD_NUMBER = 2;
    private volatile java.lang.Object requestedkey_;
    /**
     * <code>optional string requestedkey = 2;</code>
     * @return Whether the requestedkey field is set.
     */
    @java.lang.Override
    public boolean hasRequestedkey() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string requestedkey = 2;</code>
     * @return The requestedkey.
     */
    @java.lang.Override
    public java.lang.String getRequestedkey() {
      java.lang.Object ref = requestedkey_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          requestedkey_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string requestedkey = 2;</code>
     * @return The bytes for requestedkey.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRequestedkeyBytes() {
      java.lang.Object ref = requestedkey_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requestedkey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PAYLOAD_FIELD_NUMBER = 3;
    private capsuleDBProtos.KvsPayload.Kvs_payload payload_;
    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     * @return Whether the payload field is set.
     */
    @java.lang.Override
    public boolean hasPayload() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     * @return The payload.
     */
    @java.lang.Override
    public capsuleDBProtos.KvsPayload.Kvs_payload getPayload() {
      return payload_ == null ? capsuleDBProtos.KvsPayload.Kvs_payload.getDefaultInstance() : payload_;
    }
    /**
     * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
     */
    @java.lang.Override
    public capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder getPayloadOrBuilder() {
      return payload_ == null ? capsuleDBProtos.KvsPayload.Kvs_payload.getDefaultInstance() : payload_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt32(1, requestingEnclaveID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requestedkey_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(3, getPayload());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, requestingEnclaveID_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requestedkey_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getPayload());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof capsuleDBProtos.CapsuleDBRequest.DBRequest)) {
        return super.equals(obj);
      }
      capsuleDBProtos.CapsuleDBRequest.DBRequest other = (capsuleDBProtos.CapsuleDBRequest.DBRequest) obj;

      if (hasRequestingEnclaveID() != other.hasRequestingEnclaveID()) return false;
      if (hasRequestingEnclaveID()) {
        if (getRequestingEnclaveID()
            != other.getRequestingEnclaveID()) return false;
      }
      if (hasRequestedkey() != other.hasRequestedkey()) return false;
      if (hasRequestedkey()) {
        if (!getRequestedkey()
            .equals(other.getRequestedkey())) return false;
      }
      if (hasPayload() != other.hasPayload()) return false;
      if (hasPayload()) {
        if (!getPayload()
            .equals(other.getPayload())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasRequestingEnclaveID()) {
        hash = (37 * hash) + REQUESTINGENCLAVEID_FIELD_NUMBER;
        hash = (53 * hash) + getRequestingEnclaveID();
      }
      if (hasRequestedkey()) {
        hash = (37 * hash) + REQUESTEDKEY_FIELD_NUMBER;
        hash = (53 * hash) + getRequestedkey().hashCode();
      }
      if (hasPayload()) {
        hash = (37 * hash) + PAYLOAD_FIELD_NUMBER;
        hash = (53 * hash) + getPayload().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static capsuleDBProtos.CapsuleDBRequest.DBRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(capsuleDBProtos.CapsuleDBRequest.DBRequest prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code capsuleDBProtos.DBRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:capsuleDBProtos.DBRequest)
        capsuleDBProtos.CapsuleDBRequest.DBRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return capsuleDBProtos.CapsuleDBRequest.internal_static_capsuleDBProtos_DBRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return capsuleDBProtos.CapsuleDBRequest.internal_static_capsuleDBProtos_DBRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                capsuleDBProtos.CapsuleDBRequest.DBRequest.class, capsuleDBProtos.CapsuleDBRequest.DBRequest.Builder.class);
      }

      // Construct using capsuleDBProtos.CapsuleDBRequest.DBRequest.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPayloadFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        requestingEnclaveID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        requestedkey_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        if (payloadBuilder_ == null) {
          payload_ = null;
        } else {
          payloadBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return capsuleDBProtos.CapsuleDBRequest.internal_static_capsuleDBProtos_DBRequest_descriptor;
      }

      @java.lang.Override
      public capsuleDBProtos.CapsuleDBRequest.DBRequest getDefaultInstanceForType() {
        return capsuleDBProtos.CapsuleDBRequest.DBRequest.getDefaultInstance();
      }

      @java.lang.Override
      public capsuleDBProtos.CapsuleDBRequest.DBRequest build() {
        capsuleDBProtos.CapsuleDBRequest.DBRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public capsuleDBProtos.CapsuleDBRequest.DBRequest buildPartial() {
        capsuleDBProtos.CapsuleDBRequest.DBRequest result = new capsuleDBProtos.CapsuleDBRequest.DBRequest(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.requestingEnclaveID_ = requestingEnclaveID_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.requestedkey_ = requestedkey_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (payloadBuilder_ == null) {
            result.payload_ = payload_;
          } else {
            result.payload_ = payloadBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof capsuleDBProtos.CapsuleDBRequest.DBRequest) {
          return mergeFrom((capsuleDBProtos.CapsuleDBRequest.DBRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(capsuleDBProtos.CapsuleDBRequest.DBRequest other) {
        if (other == capsuleDBProtos.CapsuleDBRequest.DBRequest.getDefaultInstance()) return this;
        if (other.hasRequestingEnclaveID()) {
          setRequestingEnclaveID(other.getRequestingEnclaveID());
        }
        if (other.hasRequestedkey()) {
          bitField0_ |= 0x00000002;
          requestedkey_ = other.requestedkey_;
          onChanged();
        }
        if (other.hasPayload()) {
          mergePayload(other.getPayload());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        capsuleDBProtos.CapsuleDBRequest.DBRequest parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (capsuleDBProtos.CapsuleDBRequest.DBRequest) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int requestingEnclaveID_ ;
      /**
       * <code>optional int32 requestingEnclaveID = 1;</code>
       * @return Whether the requestingEnclaveID field is set.
       */
      @java.lang.Override
      public boolean hasRequestingEnclaveID() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int32 requestingEnclaveID = 1;</code>
       * @return The requestingEnclaveID.
       */
      @java.lang.Override
      public int getRequestingEnclaveID() {
        return requestingEnclaveID_;
      }
      /**
       * <code>optional int32 requestingEnclaveID = 1;</code>
       * @param value The requestingEnclaveID to set.
       * @return This builder for chaining.
       */
      public Builder setRequestingEnclaveID(int value) {
        bitField0_ |= 0x00000001;
        requestingEnclaveID_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 requestingEnclaveID = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestingEnclaveID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        requestingEnclaveID_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object requestedkey_ = "";
      /**
       * <code>optional string requestedkey = 2;</code>
       * @return Whether the requestedkey field is set.
       */
      public boolean hasRequestedkey() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string requestedkey = 2;</code>
       * @return The requestedkey.
       */
      public java.lang.String getRequestedkey() {
        java.lang.Object ref = requestedkey_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            requestedkey_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string requestedkey = 2;</code>
       * @return The bytes for requestedkey.
       */
      public com.google.protobuf.ByteString
          getRequestedkeyBytes() {
        java.lang.Object ref = requestedkey_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          requestedkey_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string requestedkey = 2;</code>
       * @param value The requestedkey to set.
       * @return This builder for chaining.
       */
      public Builder setRequestedkey(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        requestedkey_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string requestedkey = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRequestedkey() {
        bitField0_ = (bitField0_ & ~0x00000002);
        requestedkey_ = getDefaultInstance().getRequestedkey();
        onChanged();
        return this;
      }
      /**
       * <code>optional string requestedkey = 2;</code>
       * @param value The bytes for requestedkey to set.
       * @return This builder for chaining.
       */
      public Builder setRequestedkeyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        requestedkey_ = value;
        onChanged();
        return this;
      }

      private capsuleDBProtos.KvsPayload.Kvs_payload payload_;
      private com.google.protobuf.SingleFieldBuilderV3<
          capsuleDBProtos.KvsPayload.Kvs_payload, capsuleDBProtos.KvsPayload.Kvs_payload.Builder, capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder> payloadBuilder_;
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       * @return Whether the payload field is set.
       */
      public boolean hasPayload() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       * @return The payload.
       */
      public capsuleDBProtos.KvsPayload.Kvs_payload getPayload() {
        if (payloadBuilder_ == null) {
          return payload_ == null ? capsuleDBProtos.KvsPayload.Kvs_payload.getDefaultInstance() : payload_;
        } else {
          return payloadBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public Builder setPayload(capsuleDBProtos.KvsPayload.Kvs_payload value) {
        if (payloadBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          payload_ = value;
          onChanged();
        } else {
          payloadBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public Builder setPayload(
          capsuleDBProtos.KvsPayload.Kvs_payload.Builder builderForValue) {
        if (payloadBuilder_ == null) {
          payload_ = builderForValue.build();
          onChanged();
        } else {
          payloadBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public Builder mergePayload(capsuleDBProtos.KvsPayload.Kvs_payload value) {
        if (payloadBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              payload_ != null &&
              payload_ != capsuleDBProtos.KvsPayload.Kvs_payload.getDefaultInstance()) {
            payload_ =
              capsuleDBProtos.KvsPayload.Kvs_payload.newBuilder(payload_).mergeFrom(value).buildPartial();
          } else {
            payload_ = value;
          }
          onChanged();
        } else {
          payloadBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public Builder clearPayload() {
        if (payloadBuilder_ == null) {
          payload_ = null;
          onChanged();
        } else {
          payloadBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public capsuleDBProtos.KvsPayload.Kvs_payload.Builder getPayloadBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getPayloadFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      public capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder getPayloadOrBuilder() {
        if (payloadBuilder_ != null) {
          return payloadBuilder_.getMessageOrBuilder();
        } else {
          return payload_ == null ?
              capsuleDBProtos.KvsPayload.Kvs_payload.getDefaultInstance() : payload_;
        }
      }
      /**
       * <code>optional .capsuleDBProtos.Kvs_payload payload = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          capsuleDBProtos.KvsPayload.Kvs_payload, capsuleDBProtos.KvsPayload.Kvs_payload.Builder, capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder> 
          getPayloadFieldBuilder() {
        if (payloadBuilder_ == null) {
          payloadBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              capsuleDBProtos.KvsPayload.Kvs_payload, capsuleDBProtos.KvsPayload.Kvs_payload.Builder, capsuleDBProtos.KvsPayload.Kvs_payloadOrBuilder>(
                  getPayload(),
                  getParentForChildren(),
                  isClean());
          payload_ = null;
        }
        return payloadBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:capsuleDBProtos.DBRequest)
    }

    // @@protoc_insertion_point(class_scope:capsuleDBProtos.DBRequest)
    private static final capsuleDBProtos.CapsuleDBRequest.DBRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new capsuleDBProtos.CapsuleDBRequest.DBRequest();
    }

    public static capsuleDBProtos.CapsuleDBRequest.DBRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<DBRequest>
        PARSER = new com.google.protobuf.AbstractParser<DBRequest>() {
      @java.lang.Override
      public DBRequest parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DBRequest(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DBRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DBRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public capsuleDBProtos.CapsuleDBRequest.DBRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_capsuleDBProtos_DBRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_capsuleDBProtos_DBRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026capsuleDBRequest.proto\022\017capsuleDBProto" +
      "s\032\021kvs_payload.proto\"m\n\tDBRequest\022\033\n\023req" +
      "uestingEnclaveID\030\001 \001(\005\022\024\n\014requestedkey\030\002" +
      " \001(\t\022-\n\007payload\030\003 \001(\0132\034.capsuleDBProtos." +
      "Kvs_payload"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          capsuleDBProtos.KvsPayload.getDescriptor(),
        });
    internal_static_capsuleDBProtos_DBRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_capsuleDBProtos_DBRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_capsuleDBProtos_DBRequest_descriptor,
        new java.lang.String[] { "RequestingEnclaveID", "Requestedkey", "Payload", });
    capsuleDBProtos.KvsPayload.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
