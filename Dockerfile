FROM amd64/amazoncorretto:21
WORKDIR /app
COPY ./build/libs/dreamserver-0.0.1-SNAPSHOT.jar /app/dream.jar
CMD ["java", "-Duser.timezone=Asia/Seoul", "-jar", "-Dspring.profiles.active=dev", "dream.jar"]