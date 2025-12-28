#!/bin/sh

set -e # Exit early if any commands fail
(
  cd "$(dirname "$0")" # Ensure compile steps are run within the repository directory
  mvn package
)

java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App
