FROM jboss/wildfly
COPY target/${artifactId}-${version}.war /opt/jboss/wildfly/standalone/deployments/
ENTRYPOINT ["/opt/jboss/wildfly/bin/standalone.sh", "-c", "standalone.xml", "-Djboss.http.port=${portNumber}", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
