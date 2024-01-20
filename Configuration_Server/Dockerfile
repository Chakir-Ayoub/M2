FROM openjdk:17-alpine
VOLUME /tmp
ADD target/configserver*.jar /app.jar
CMD [ "java","-jar","app.jar","--spring.profiles.active=prod" ]
EXPOSE 8071