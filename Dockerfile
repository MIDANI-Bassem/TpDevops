FROM openjdk:17
COPY build/libs/*.jar app-devops.jar
EXPOSE 8020
CMD ["java", "-jar", "app-devops.jar", "--sever.port=8020"]