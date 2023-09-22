FROM registry.redhat.io/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

USER root

RUN install -d /usr/local/src/rerc
COPY . /usr/local/src/rerc
WORKDIR /usr/local/src/rerc
RUN mvn clean install -DskipTests
RUN cp /usr/local/src/rerc/target/*.jar /usr/local/src/rerc/app.jar
CMD java $JAVA_OPTS -cp .:* org.southerncoalition.enus.vertx.AppVertx
