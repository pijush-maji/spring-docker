FROM eclipse-temurin:17

LABEL maintainer="abc@gamil.com"

WORKDIR /app

COPY target/springboot-docker-0.0.1-SNAPSHOT.jar /app/springboot-docker-demo.jar

ENTRYPOINT ["java","-jar","springboot-docker-demo.jar"]