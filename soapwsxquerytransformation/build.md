#### Spring-Boot Build Steps
======================================================

## Build springboot JAR
mvn clean package

## Build Docker image with Spring-Boot JAR
docker build -t soaptransformation .

## Launch Container with directory mappings
docker run -p 8080:8080 -v /c/data:/u01/data soaptransformation:latest 

