# Spring 3.0 GraalVM getting started guide


## __Pre-requisite__ 

1. __You need Java 17 for this example to work. Confirm its installation as shown below__
    
        java -version
        openjdk version "17.0.2" 2022-01-18
        OpenJDK Runtime Environment (build 17.0.2+8-86)
        OpenJDK 64-Bit Server VM (build 17.0.2+8-86, mixed mode, sharing)

1. __Docker Daemon is running on your machine. You can check as shown below__

    ```
     docker images
     REPOSITORY                                                       TAG                                                                          IMAGE ID       CREATED         SIZE   
    ```
    __If docker is not running then you will get the following error when building the app__ 
     ```
    Execution default-cli of goal org.springframework.boot:spring-boot-maven-plugin:3.0.0:build-image failed: Connection to the Docker daemon at 'localhost' failed with error "[2] No such file or directory"; ensure the Docker daemon is running and accessible 
    ```
## __Optional but recommended for developer productivity.__ 

1. If you need to have multiple versions of java on the same machine then __[sdkman.io](https://sdkman.io/)__. This tool will allow you to install lot of tools without needing admin permissions on your machine. 

1. You can Generate zip version of this project by pasting the below url into the browser 

    https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.0.0&packaging=jar&jvmVersion=17&groupId=com.doit&artifactId=spring_3_graalvm_get_started&name=spring_3_graalvm_get_started&description=Demo%20project%20for%20Spring%20Boot%203.0%20with%20GraalVM%20support&packageName=com.doit.app&dependencies=native,web

## Application development lifecycle 

1. To Build app run command : ```./mvnw clean install```
1. To Run app run command : ```./mvnw clean spring-boot:run```
1. To Build image run command : ```./mvnw clean spring-boot:build-image```
1. To Run image run command : ```docker run -p 8080:8080 docker.io/library/spring_3_graalvm_get_started:0.0.1-SNAPSHOT```