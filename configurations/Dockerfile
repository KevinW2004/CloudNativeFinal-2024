# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim AS base

# Set the working directory in the container
WORKDIR /app

# Copy the current code into the container at /app
COPY target/*.jar app.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable
ENV JAVA_OPTS=""

# Run the jar file
CMD ["java","$JAVA_OPTS","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]