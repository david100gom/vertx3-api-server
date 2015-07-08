FROM java:8

MAINTAINER takecy

RUN apt-get update && apt-get install -y nginx

WORKDIR /data

EXPOSE 80 8080

VOLUME . /usr/local/vertx

CMD ["bash"]
ENTRYPOINT /usr/sbin/nginx -g 'daemon off;' -c /etc/nginx/nginx.conf
