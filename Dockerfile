# Use OpenJDK 11 as base image
FROM openjdk:17-alpine

# Copy the packaged Spring Boot application JAR file into the container at /app
COPY build/libs/dockerDev-0.0.1-SNAPSHOT.jar /dockerDev.jar

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "/dockerDev.jar"]