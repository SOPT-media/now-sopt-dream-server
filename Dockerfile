FROM amd64/amazoncorretto:21
WORKDIR /app
COPY ./build/libs/offloadserver-0.0.1-SNAPSHOT.jar /app/offroad.jar
CMD ["java", "-Duser.timezone=Asia/Seoul", "-jar", "-Dspring.profiles.active=dev", "offroad.jar"]