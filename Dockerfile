FROM openjdk:17
EXPOSE 8081
ADD target/ci-cd-demo-app.jar ci-cd-demo-app.jar
ENTRYPOINT ["java","jar","ci-cd-demo-app.jar"]