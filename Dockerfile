FROM adoptopenjdk/openjdk11-openj9:alpine
VOLUME /tmp
COPY target/framework-spring-docker.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]