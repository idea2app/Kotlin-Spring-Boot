# Kotlin-Spring-Boot

[Spring Boot][1] project scaffold written in [Kotlin][2], which is based on the [Official Guide][3].

[![Release Docker image](https://github.com/idea2app/Kotlin-Spring-Boot/actions/workflows/release.yml/badge.svg)][4]

## Development environment

### Windows

```powershell
choco install kotlinc gradle -y
```

### Mac OS X

```bash
brew install kotlin gradle
```

## Local developing

### Running

```shell
./gradlew bootRun
```

### Building

```shell
./gradlew build
docker build .
```

## Release to GitHub registry

```shell
git tag vX.Y.Z HEAD
git push origin --tags
```

## Reference

1. [Start Kotlin without IDE](https://tech-query.me/development/start-kotlin-without-ide/)

[1]: https://spring.io/
[2]: https://kotlinlang.org/
[3]: https://spring.io/guides/tutorials/spring-boot-kotlin/
[4]: https://github.com/idea2app/Kotlin-Spring-Boot/actions/workflows/release.yml
