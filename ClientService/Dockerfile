FROM maven:3.9.6-openjdk-17 AS Builder
WORKDIR ./src ./src
COPY ./pom.xml .
RUN mvn clean package


FROM openjdk:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]