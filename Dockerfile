# Fetch the Java
FROM openjdk:17-bullseye
LABEL authors="Anushri"
# Expose port 8080
EXPOSE 8080
# set a docker volume if you want
VOLUME /backend_volume
# Add the jar file
ADD /target/*.jar docker-demo-0.0.1-SNAPSHOT.jar
# Start the application
ENTRYPOINT ["java", "-jar", "/docker-demo-0.0.1-SNAPSHOT.jar"]
