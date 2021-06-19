FROM maven:3.8.1-adoptopenjdk-11 as build
WORKDIR /app
COPY . .
RUN mvn install

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# cd /app
WORKDIR /app

#COPY ${JAR_FILE} spring-boot-web.jar
COPY --from=build /app/target/spring-boot-web.jar /app/app.jar

EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar app.jar"]

## docker run -p 8080:8080 -t spring-boot-web:1.0