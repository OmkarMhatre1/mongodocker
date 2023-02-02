FROM openjdk:17

ADD target/mongodocker.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]