FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/application-0.0.1.jar app.jar
# Define environment variables for PostgreSQL connection
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/shopping
ENV SPRING_DATASOURCE_USERNAME=shopping
ENV SPRING_DATASOURCE_PASSWORD=varun
ENTRYPOINT ["java","-jar","/app.jar"]