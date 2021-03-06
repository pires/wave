Mavenized Apache Wave
====================

This project aims at providing Apache Wave code reorganized to follow a  Maven project structure (one project sanely split into modules).
This way, one expects the project to be easier to understand and faster to build and test.

## Prerequisites ##
- JDK 6
- Maven 3.0.3 or newer
- Protocol Buffers **2.4.1** compiler installed (_protoc_)

### Install Protocol Buffers compiler ###

On Ubuntu 12.04/Linux Mint 13 execute:
```
sudo apt-get install protobuf-compiler
```

On Mac OS X (with _brew_) execute:
```
cd /usr/local
git l -- Library/Formula/protobuf.rb
git co -b proto241 544209f
brew install protobuf
git co master
git br -d proto241
```

On Windows :
```
Download the protobuf from https://code.google.com/p/protobuf/ and extract the protoc.exe
```

And then edit _build-proto.properties_ to match your installation.

### Java memory options for Maven ###

To allow more memory for the compilation process please do the following
On Linux/Mac :
```
export MAVEN_OPTS="-Xmx1024m -XX:MaxPermSize=128m"
```

On Windows :

```
set MAVEN_OPTS="-Xmx1024m -XX:MaxPermSize=128m"
```

## Build ##

Basically, if you want a WIAB JAR file ready to run, you just have to run the following command:
_mvn clean package_

This will eventually:
- Compile _protobuf_ source files (*.proto) into Java code;
- Compile a _string-template_ parser;
- Run that parser against template files (*.st) in order to generate more Java code;
- Compile GXP templates;
- Compile GWT modules;
- Create the runnable server JAR.

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
