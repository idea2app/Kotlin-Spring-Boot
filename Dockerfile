FROM openjdk:11.0-jre-slim

# 构建之前需要先确保本地有编译好的jar包，执行下面这个命令即可
#./gradlew build

ENV JAR_FILE_NAME Kotlin-Spring-Boot-0.0.1-SNAPSHOT.jar
COPY build/libs/$JAR_FILE_NAME app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
