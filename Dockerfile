FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
ARG DB_HOST
ARG DB_PORT
ARG DB_NAME
ARG DB_USERNAME
ARG DB_PASSWORD

ENV DB_HOST=$DB_HOST
ENV DB_PORT=$DB_PORT
ENV DB_NAME=$DB_NAME
ENV DB_USERNAME=$DB_USERNAME
ENV DB_PASSWORD=$DB_PASSWORD
COPY pom.xml .
COPY src ./src
RUN mvn clean install
COPY /target/movies-0.0.1-SNAPSHOT.jar ./movies.jar
EXPOSE 8080
CMD ["java", "-jar", "movies.jar"]
