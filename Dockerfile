
FROM openjdk:17

ADD target/test_project-1-0.0.1-SNAPSHOT.jar test_project-1-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","test_project-1-0.0.1-SNAPSHOT.jar" ]