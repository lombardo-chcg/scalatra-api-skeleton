#!/bin/bash

imageName=${1:-scalatra-api}
tag=${2:-latest}

echo -e "\nCompiling project...\n"

sbt assembly

echo -e "\nBuilding Docker Image...\n"

docker build -t $imageName:$tag .