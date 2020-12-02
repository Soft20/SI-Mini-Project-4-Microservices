FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/car-rating-0.0.1-SNAPSHOT.jar carrating.jar
EXPOSE 3001
#ENTRYPOINT exec java $JAVA_OPTS -jar carrating.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar carrating.jar