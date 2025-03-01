# Use JDK 21 image
FROM openjdk:21-jdk-slim

# Set working directory
WORKDIR /app

# Copy the Maven wrapper files and pom.xml
COPY .mvn/ .mvn/
COPY mvnw .
COPY pom.xml .

# Resolve project dependencies
RUN ./mvnw dependency:resolve

# Copy the whole project
COPY src/ src/

# Package the application
RUN ./mvnw clean package -DskipTests

# Expose port 8080
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/my-shop-0.0.1-SNAPSHOT.jar"]
