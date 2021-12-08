FROM openjdk:11
ADD target/lessons-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar lessons-0.0.1-SNAPSHOT.jar