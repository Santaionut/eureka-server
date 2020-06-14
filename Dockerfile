FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG JAR_FILE=target/zuul-server-*.jar
ADD ${JAR_FILE} zuul-service.jar
ENTRYPOINT ["java","-jar","/zuul-service.jar"]