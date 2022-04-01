FROM openjdk:17-jdk-slim-bullseye

# OpenJDK runs Debian, so no apk
# update is needed
RUN apt update 
RUN apt install -y git

COPY ./target/*.jar app.jar

CMD java -jar app.jar 