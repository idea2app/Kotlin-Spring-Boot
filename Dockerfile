FROM openjdk:11.0-jre-slim

# Please confirm that you have built the jar package locally via `./gradlew build`

ENV JAR_FILE_NAME Kotlin-Spring-Boot-0.0.1-SNAPSHOT.jar
COPY build/libs/$JAR_FILE_NAME app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
