FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD admin
ENV MYSQL_DATABASE url
ADD myScript.sql /docker-entrypoint-initdb.d
EXPOSE 3306