# Config Server Dockerfile
# openjdk:11 is 630MB, openjdk:11-slim is 403MB, openjdk:11-jre-slim is 217MB (all uncompressed)
FROM openjdk:11-jre-slim

# OpenJDK runs Debian, so no apk
# update is needed
RUN apt update 
RUN apt install -y git

COPY ./target/*.jar app.jar

CMD java -jar app.jar 