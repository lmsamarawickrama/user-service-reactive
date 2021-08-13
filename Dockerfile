FROM openjdk:8-jdk-alpine
MAINTAINER saliam.com
COPY target/smartbids-user-reactive-0.0.1-SNAPSHOT.jar smartbids-user-reactive-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/smartbids-user-reactive-0.0.1-SNAPSHOT.jar"]