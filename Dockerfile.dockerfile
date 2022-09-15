FROM adoptopenjdk/openjdk11
VOLUME /locadora
ARG JAR_FILE=target/locadora-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} locadora-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/locadora-0.0.1-SNAPSHOT.jar"]