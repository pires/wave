#!/bin/bash

# This script will start the Wave in a Box server.
#

# Make sure the config file exists.
if [ ! -e server.config ]; then
  echo "You need to copy server.config.example to server.config and edit it. Or run: 'ant -f server-config.xml' to generate the file automatically."
  exit 1
fi

. process-script-args.sh

exec java $DEBUG_FLAGS \
  -Dorg.eclipse.jetty.LEVEL=DEBUG \
  -Djava.security.auth.login.config=jaas.config \
  -Dwave.server.config=server.config \
  -jar box/target/box-0.3-SNAPSHOT.jar
