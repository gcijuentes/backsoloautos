FROM openjdk:21-ea-17-slim

WORKDIR /app

COPY ./build/backsoloautos-0.0.2-SNAPSHOT.jar .

EXPOSE 8001

ENTRYPOINT ["java", "-jar","backsoloautos-0.0.2-SNAPSHOT.jar"]