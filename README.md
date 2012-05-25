Mavenized Apache Wave
====================

This project aims at providing Apache Wave code reorganized to follow a  Maven project structure (one project sanely split into modules).
This way, one expects the project to be easier to understand and faster to build and test.

## Prerequisites ##
- JDK 6
- Maven 3.0.3 or newer

## Build ##

### TODO ###

For now, we're just focusing on building every little piece of Wave. And for that, you've got to execute the following command:

_mvn clean package_

Be sure to have _protoc_ installed. On Mac OS X with _brew_ just run the following command:

_brew install protoc_

And then edit build-proto.properties to match your installation.

## Test ##

### TODO ###

## Troubleshooting ##

1. Can't build _proto-stringtemplates_ project.
See issue #1.
