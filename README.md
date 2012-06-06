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

### TODO ###

For now, we're just focusing on building every little piece of Wave. And for that, you've got to execute the following command:

_mvn clean package_

## Test ##

### Run WIAB ###

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
