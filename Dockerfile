FROM openjdk:11
#VOLUME /tmp

# COPY target/*.jar app.jar
COPY /target/iara-0.0.1-SNAPSHOT.jar ./iara.jar

ENTRYPOINT ["java", "-jar", "./iara.jar"]
