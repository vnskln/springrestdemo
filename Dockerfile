FROM maven:3.3-jdk-8 as builder
WORKDIR '/usr/src/mymaven'
COPY . .
RUN mvn -f /usr/src/mymaven/pom.xml clean install

FROM tomcat:9.0.26-jdk11-openjdk-slim
EXPOSE 8080 80
COPY --from=builder /usr/src/mymaven/target/spring-rest-demo.war /usr/local/tomcat/webapps


#FROM tomcat:9.0
#COPY ./target/spring-rest-demo.war /usr/local/tomcat/webapps


