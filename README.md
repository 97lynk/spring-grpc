# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.7.5/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.7.5/reference/htmlsingle/#web)
* [Examples](https://github.com/yidongnan/grpc-spring-boot-starter/tree/master/examples)

### Guides

Cd to `/common` and run command:
```
mvn clean install
```

Cd to `/client` and run command:
```
mvn spring-boot:run
```

Cd to `/server` and run command:
```
mvn spring-boot:run
```

Request to `http://localhost:8082/greeting?firstName=Jon&lastName=Tuan`