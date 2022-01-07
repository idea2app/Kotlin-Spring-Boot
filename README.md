# Kotlin-Spring-Boot

[Spring Boot][1] project scaffold written in [Kotlin][2], which is based on the [Official Guide][3].

## Development environment

### Windows

```powershell
choco install kotlinc gradle -y
```

### Mac OS X

```bash
brew install kotlin gradle
```

## Local running

```shell
./gradlew bootRun
```

## Building

```shell
./gradlew build
docker build .
```

## Reference

1. [Start Kotlin without IDE](https://tech-query.me/development/start-kotlin-without-ide/)

[1]: https://spring.io/
[2]: https://kotlinlang.org/
[3]: https://spring.io/guides/tutorials/spring-boot-kotlin/
