#!/bin/bash

command -v git >/dev/null 2>&1 || { echo "I require Git client but it's not installed. Aborting." >&2; exit 1; }
command -v mvn >/dev/null 2>&1 || { echo "I require Maven client but it's not installed. Aborting." >&2; exit 1; }

GIT=`which git`
MVN=`which mvn`
WAVE_SRC=$PWD
REPO=$WAVE_SRC/repo/
TITLE="Socket IO Java"
SRC=socketio-java
VERSION=0.1-SNAPSHOT

# checkout SocketIO Java source
echo -n "Checking out $TITLE source to $WAVE_SRC/$SRC.. "
$GIT clone -q https://github.com/vjrj/Socket.IO-Java.git $SRC
echo "Done"

# build and install into Wave repo
echo "Building $TITLE.. "
cd $SRC
$MVN -q -DskipTests=true clean package

echo "Installing JARs into $REPO.. "
$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/target/socketio-core-$VERSION.jar \
 -DgroupId=com.glines.socketio \
 -DartifactId=socketio-core \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/target/socketio-extension-$VERSION.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-extension \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/gwt/target/socketio-gwt-$VERSION.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-gwt \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=extension/jetty/target/socketio-jetty-$VERSION.jar \
 -DgroupId=com.glines.socketio.extension \
 -DartifactId=socketio-jetty \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/target/socketio-$VERSION.jar \
 -DgroupId=com.glines.socketio \
 -DartifactId=socketio \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

echo "Done"

# clean
echo -n "Cleaning up $TITLE sources.. "
cd $WAVE_SRC
rm -rf $SRC

# finish
echo "Done"
