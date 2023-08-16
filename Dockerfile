FROM openjdk:11-jdk

WORKDIR /app

COPY build/libs/*.jar app.jar