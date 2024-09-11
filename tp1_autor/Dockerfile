FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/tp1_autor-0.0.1-SNAPSHOT.jar /app/tp1_autor.jar

EXPOSE 8083

ENTRYPOINT ["java", "-jar", "taskService.jar"]