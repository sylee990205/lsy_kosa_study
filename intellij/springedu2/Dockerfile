FROM openjdk:11-jdk
ARG JAR_FILE=build/libs/springedu3.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]