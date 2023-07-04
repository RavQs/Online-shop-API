FROM openjdk:11
COPY target/Online-shop-API-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]