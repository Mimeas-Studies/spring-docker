FROM openjdk:17-jdk as builder
WORKDIR /build

COPY .mvn .mvn
COPY mvnw mvnw
COPY src src
COPY pom.xml pom.xml

RUN ./mvnw package

FROM openjdk:17-alpine
COPY --from=builder /build/target/*.jar app.jar
CMD java -jar app.jar
