#!/bin/bash

SVN=`which svn`
MVN=`which mvn`
WAVE_SRC=$PWD
REPO=$WAVE_SRC/repo/

# checkout OAuth source
echo -n "Checking out OAuth source to $WAVE_SRC/oauth-lib.. "
$SVN -q checkout http://oauth.googlecode.com/svn/code/ oauth-lib
echo "Done"

# build and install into Wave repo
echo "Building OAuth.. "
cd oauth-lib/java
$MVN -q -DskipTests=true clean package

echo "Installing JARs into $REPO.. "
$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/commons/target/oauth-20100601.jar \
 -DgroupId=net.oauth \
 -DartifactId=commons \
 -Dversion=20100601 \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/provider/target/oauth-provider-20100601.jar \
 -DgroupId=net.oauth \
 -DartifactId=provider \
 -Dversion=20100601 \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/httpclient3/target/oauth-httpclient3-20100601.jar \
 -DgroupId=net.oauth \
 -DartifactId=httpclient3 \
 -Dversion=20100601 \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/httpclient4/target/oauth-httpclient3-20100601.jar \
 -DgroupId=net.oauth \
 -DartifactId=httpclient4 \
 -Dversion=20100601 \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

$MVN -q -DskipTests=true install:install-file \
 -Dfile=core/consumer/target/oauth-consumer-20100601.jar \
 -DgroupId=net.oauth \
 -DartifactId=consumer \
 -Dversion=20100601 \
 -Dpackaging=jar \
 -DlocalRepositoryPath=$REPO

echo "Done"

# clean
echo -n "Cleaning up OAuth sources.. "
cd $WAVE_SRC
rm -rf oauth-lib

# finish
echo "Done"
