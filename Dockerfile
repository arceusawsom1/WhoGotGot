FROM eclipse-temurin
WORKDIR /app
 
#COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN apk add --no-cache maven
RUN ./mvnw dependency:go-offline
 
COPY src ./src
EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]
