<!--
Copyright (c) 2010 Yahoo! Inc., 2012 - 2022 YCSB contributors.
All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License"); you
may not use this file except in compliance with the License. You
may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied. See the License for the specific language governing
permissions and limitations under the License. See accompanying
LICENSE file.
-->

# YCSB

[![Build Status](https://travis-ci.org/brianfrankcooper/YCSB.png?branch=master)](https://travis-ci.org/brianfrankcooper/YCSB)

## This Fork

This repo holds all YCSB bindings for GDP projects.  Currently, only bindings for CapsuleDB have been added.  However, they provide an example for future YCSB development.  This file assumes you have familiarity with each of the systems you are benchmarking.  For information about running workloads, adding new databases, different options, and other details about YCSB, see the original repo and docs [here](https://github.com/brianfrankcooper/YCSB) written by Brian Frank Cooper and the YCSB team.  Please note, the CapsuleDB binding does not currently pass the style checker.

## Requirements

YCSB and the GDP bindings require the following.

1. Maven
2. Docker

# CapsuleDB Bindings

Follow these steps to benchmark CapsuleDB.

1. Start the Docker container.  In one terminal, run the following commands:

```bash
MY_PROJECT=/path/to/capsuledb_repo
YCSB=/path/to/this_repo

docker run -it --rm \
    -v bazel-cache:/root/.cache/bazel \
    -v "${MY_PROJECT}":/opt/my-project \
    -v "${YCSB}":/opt/YCSB \
    -w /opt/my-project \
    keplerc/paranoid-asylo:latest 
```

You should now be in an interactive session within the container.  Next, install maven with the command `apt install maven`.  In a separate terminal, execute `docker ps` to find the name of the container.  In your second terminal, run `docker exec -it <container_name> bash` to gain a second terminal within the container.  Change directories to this repo and you are ready to run.

2. Build the package.  In the YCSB terminal, run the following.  YCSB requires the use of Maven 3; if you use Maven 2, you may see [errors such as these](https://github.com/brianfrankcooper/YCSB/issues/406).

To build the full distribution, with all database bindings:

```bash
mvn clean package
```

To build just the CapsuleDB binding:

```bash
mvn -pl site.ycsb:capsuledb-binding -am clean package
```

3. You are ready to run the benchmark.  In your CapsuleDB terminal, execute `bazel run //src/network:capsuleDB_server` to start CapsuleDB.  In your YCSB terminal, you are now ready to run workloads.  You can run anything as described on the [Running a Workload](https://github.com/brianfrankcooper/YCSB/wiki/Running-a-Workload) page, but we provide an example below.  Workload sizes can be adjusted in [large.dat](large.dat) and results can be viewed in [transactions.dat](transactions.dat).  

Begin by loading the workload:

```bash
./bin/ycsb load capsuledb -P workloads/workloada
```

Then execute the workload:

```bash
./bin/ycsb run capsuledb -P workloads/workloada -P large.dat -s > transactions.dat
```

# Future Development

To aid future development, I modified the following files:

- The `capsuledb/` folder.  Other bindings added must follow the same project structure, specifically they must be in the `site.ycsb.db` package and have a mostly matching `pom.xml` in standard maven format.  I would keep the same file format and naming convention as well (a *Client class in the `src/main/java/site/ycsb/db/ folder`).  
- In the root level `pom.xml`, add your new database under the version tags and the module tags.  
- In `bin/bindings.properties`, add your database in the same format as the other entries.  
- In `bin/ycsb`, add your database in same style at the other entries.  
- Finally, in `distribution/pom.xml`, add your binding as a new artifact.  

While I do advise you to conform to the style check, some generated code will fail in a pretty spectacular way (looking at you protobufs).  Since the default settings for YCSB will prevent the build from completing if the code does not pass the style check, you can add the following to your database's `pom.xml` to skip the style check:

```XML
  <properties>
    <checkstyle.skip>true</checkstyle.skip>
  </properties>
```

If you need to modify the protobuf implementation for CapsuleDB, you must rebuild the generated files.  You can do so using the following command run from the location of the `.proto` file:

```bash
protoc --java_out=. addressbook.proto
```

# Contributers

The following people have contributed to the GDP YCSB bindings.

- William Mullen
