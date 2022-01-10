FROM openjdk:11.0.6-jdk
LABEL usuario="davis"
WORKDIR /workspace
COPY /target/app*.jar app.jar
EXPOSE 8090
ENTRYPOINT exec java -jar /workspace/app.jar