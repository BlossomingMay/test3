# Pull base image  
FROM registry.saas.hand-china.com/tools/javabase:0.5.0

MAINTAINER yzj "yeah_59@126.com"

ENV url = jdbc:mysql://cdb-2i06sqln.gz.tencentcdb.com:10098/sakila
ENV username = root
ENV password = yzj578692102
ENV title = test
ENV description = dockertest
ENV language_id = 1

ADD javatest3demo.jar app.jar
# Define default command.
ENTRYPOINT ["java","-jar","/app.jar"]

#设置时区
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone