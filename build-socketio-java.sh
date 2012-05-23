#!/bin/bash

GIT=`which git`
MVN=`which mvn`
WAVE_SRC=$PWD
REPO=$WAVE_SRC/repo/
TITLE="Socket IO Java"

# checkout SocketIO Java source
echo -n "Checking out $TITLE source to $WAVE_SRC/socket-io-java.. "
$GIT clone -q https://github.com/vjrj/Socket.IO-Java.git socketio-java
echo "Done"

# build and install into Wave repo
echo "Building $TITLE.. "
cd socketio-java
$MVN -q -DskipTests=true clean package

echo "Installing JARs into $REPO.. "
$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/target/socketio-core-0.1-SNAPSHOT.jar \
 -DgroupId=com.glines.socketio \
 -DartifactId=socketio-core \
 -Dversion=0.1-SNAPSHOT \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/target/socketio-extension-0.1-SNAPSHOT.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-extension \
 -Dversion=0.1-SNAPSHOT \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/gwt/target/socketio-gwt-0.1-SNAPSHOT.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-gwt \
 -Dversion=0.1-SNAPSHOT \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/jetty/target/socketio-jetty-0.1-SNAPSHOT.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-jetty \
 -Dversion=0.1-SNAPSHOT \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/target/socketio-0.1-SNAPSHOT.jar \
 -DgroupId=com.glines.socketio \
 -DartifactId=socketio \
 -Dversion=0.1-SNAPSHOT \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

echo "Done"

# clean
echo -n "Cleaning up $TITLE sources.. "
cd $WAVE_SRC
rm -rf socketio-java

# finish
echo "Done"
