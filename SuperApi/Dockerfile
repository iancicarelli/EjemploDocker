FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY target/SuperApi.jar /app/


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "SuperApi.jar"]