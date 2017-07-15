FROM openjdk:8
VOLUME /tmp
ADD contentscreamwebservice-0.0.1.war contentscream.war
RUN sh -c 'touch /contentscream.war'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /contentscream.war" ]