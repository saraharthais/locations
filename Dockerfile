FROM adoptopenjdk/openjdk11:alpine-jre
COPY ./target/location-2.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch location-2.jar'
ENTRYPOINT [ "java", "-jar", "location-2.jar" ]