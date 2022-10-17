FROM openjdk:17-alpine3.12
ADD target/group2-employee-0.0.1-SNAPSHOT.jar  group2-employee-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "group2-employee-0.0.1-SNAPSHOT.jar"]