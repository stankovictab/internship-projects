# Eureka Server Dockerfile
# There isn't an openjdk:11-alpine afaik
# This one is 630MB
FROM openjdk:11

# File name is eureka-server-0.0.1-SNAPSHOT.jar
COPY ./target/*.jar app.jar

CMD java -jar app.jar 