FROM openjdk:8
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/Shanghai">/etc/timezone
ADD target/testjenkins-1.0.0.jar /usr/local
#port
ENTRYPOINT  ["java","-jar","/usr/local/testjenkins-1.0.0.jar"]