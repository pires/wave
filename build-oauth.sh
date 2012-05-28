#!/bin/bash

SVN=`which svn`
MVN=`which mvn`
WAVE_SRC=$PWD
REPO=$WAVE_SRC/repo/
TITLE="OAuth"
SRC=oauth-lib
VERSION=20100601

# checkout OAuth source
echo -n "Checking out $TITLE source to $WAVE_SRC/$SRC.. "
$SVN -q checkout http://oauth.googlecode.com/svn/code/ $SRC
echo "Done"

# build and install into Wave repo
echo "Building OAuth.. "
cd $SRC/java
$MVN -q -DskipTests=true clean package

echo "Installing JARs into $REPO.. "
$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/commons/target/oauth-$VERSION.jar \
 -DgroupId=net.oauth \
 -DartifactId=commons \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/provider/target/oauth-provider-$VERSION.jar \
 -DgroupId=net.oauth \
 -DartifactId=provider \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/httpclient3/target/oauth-httpclient3-$VERSION.jar \
 -DgroupId=net.oauth \
 -DartifactId=httpclient3 \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/httpclient4/target/oauth-httpclient3-$VERSION.jar \
 -DgroupId=net.oauth \
 -DartifactId=httpclient4 \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/consumer/target/oauth-consumer-$VERSION.jar \
 -DgroupId=net.oauth \
 -DartifactId=consumer \
 -Dversion=$VERSION \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

echo "Done"

# clean
echo -n "Cleaning up OAuth sources.. "
cd $WAVE_SRC
rm -rf $SRC

# finish
echo "Done"
