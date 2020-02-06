FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/eureka-server-*.jar
ADD ${JAR_FILE} eureka-server.jar
ENTRYPOINT ["java","-jar","/eureka-server.jar"]