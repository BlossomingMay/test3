# Pull base image  
FROM registry.saas.hand-china.com/tools/mysql:5.6
  
MAINTAINER yzj "yeah_59@126.com"
  
VOLUME D:/mysqltest:/var/lib/mysql

# 添加 
ADD sakila-schema.sql /var/lib/mysql
ADD sakila--data.sql /var/lib/mysql

# Define default command. 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

#设置时区
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone