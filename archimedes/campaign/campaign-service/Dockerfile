# Campaign Service Dockerfile
# openjdk:11 is 630MB, openjdk:11-slim is 403MB, openjdk:11-jre-slim is 217MB (all uncompressed)
FROM openjdk:11-jre-slim

COPY ./target/*.jar app.jar

CMD java -jar app.jar 