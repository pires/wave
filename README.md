Mavenized Apache Wave
====================

This project aims at providing Apache Wave code reorganized to follow a  Maven project structure (one project sanely split into modules).
This way, one expects the project to be easier to understand and faster to build and test.

## Prerequisites ##
- JDK 6
- Maven 3.0.3 or newer
- Protocol Buffers compiler installed (_protoc_)

### Install Protocol Buffers compiler ###

On Ubuntu 12.04/Linux Mint 13 execute:
```
sudo apt-get install protobuf-compiler
```

On Mac OS X (with _brew_) execute:
```
brew install protobuf
```

And then edit _build-proto.properties_ to match your installation.

## Build ##

Basically, if you want a WIAB JAR file ready to run, you just have to run the following command:
_mvn clean package_

This will at some point:
- Compile _protobuf_ source files (*.proto) into Java code;
- Compile a _string-template_ parser;
- Run that parser against template files (*.st) in order to generate more Java code;
- Compile GXP templates;
- Compile GWT modules;
- Create the runnable JAR.

Meanwhile, some tests will be executed, while others won't mostly due to the fact they take too long to run, sometimes even hours. *Be aware!!*
In order to execute them, we provide the following Maven parameters:
_-Plarge-tests_
_-Pgwt-tests_
_-Pmongodb-tests_

For instance,
```
mvn clean package -Pmongodb-tests
```
will run the regular tests plus the _Mongo DB_ related ones.

## Running WIAB ##

In order to run the Wave In A Box bundle, be sure to configure your server instance:
```
vi wiab-distribution/target/wiab-distribution-0.3-SNAPSHOT/server.config
```

And then, start the server:
```
cd wiab-distribution/target/wiab-distribution-0.3-SNAPSHOT/
./run-server.sh
```

Now just point your browser to the host and port you've configured in your _server.config_.

## Troubleshooting ##

Look in the project issues.