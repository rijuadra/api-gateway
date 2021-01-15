FROM openjdk:11
ADD target/api-gateway-0.0.1-SNAPSHOT.jar api-gateway-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","api-gateway-0.0.1-SNAPSHOT.jar"]
