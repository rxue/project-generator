FROM jboss/wildfly
COPY target/${artifactId}-${version}.jar /opt/jboss/wildfly/standalone/deployments/
COPY docker-config/standalone-full.xml /opt/jboss/wildfly/standalone/configuration/
RUN /opt/jboss/wildfly/bin/add-user.sh -a -u test -p test --silent
ENTRYPOINT ["/opt/jboss/wildfly/bin/standalone.sh", "-c", "standalone-full.xml", "-Djboss.http.port=8081", "-b", "${ipAddress}", "-bmanagement", "0.0.0.0"]
