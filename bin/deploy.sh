#!/bin/bash

PROJECT_ROOT="$(cd "$(dirname "$0")" && cd .. && pwd)"
echo "$PROJECT_ROOT"

mvn clean package

cp "$PROJECT_ROOT"/target/spring-1.0-SNAPSHOT.war "$CATALINE_HOME"/webapps