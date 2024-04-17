FROM tomcat
VOLUME /tmp
COPY target/artifacts/lab_mvc_war/*.war /usr/local/tomcat/webapps/app.war
# ENTRYPOINT ["java","-jar","/app.war"]
CMD ["catalina.sh", "run"]