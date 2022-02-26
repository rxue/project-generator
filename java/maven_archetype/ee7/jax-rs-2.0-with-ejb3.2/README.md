# JAX-RS 2.0 Project Generation with EJB 3.2 Support

## NOTE!

* Default port number: 8080
* Endpoint URL of the sample resource: `http://localhost:<port number>/<web context>/rest/sample`, where the `<web context>` is the artifect ID

## Command
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=jax-rs-2.0-with-ejb3.2        \
  -DgroupId=<my group id>                             \
  -DartifactId=<artifect id>                        \
  -DportNumber=<port number>
```
### Example in Non-interactive Mode
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=jax-rs-2.0-with-ejb3.2        \
  -DgroupId=rx                                        \
  -DartifactId=simple-jax-rs-2.0                      \
  -DportNumber=8081                                   \
  -DinteractiveMode=false
```
The endpoint URL of the sample resource will be: `http://localhost:8082/simple-jax-rs-2.0/rest/sample`. 

Note that the [*context root*](https://access.redhat.com/documentation/en-us/jboss_enterprise_application_platform/5/html/administration_and_configuration_guide/context_root) is `simple-jax-rs-2.0`. By default, the context root is the name of the generated war, so if the name of the war contains. e.g. `1.0-SNAPSHOT`, the context root should be `simple-jax-rs-2.0-1.0.SNAPSHOT`. But this project template used the [`jboss-web.xml`](https://github.com/rxue/project-generator/blob/main/java/maven_archetype/ee7/jax-rs-2.0-with-ejb3.2/src/main/resources/archetype-resources/src/main/webapp/WEB-INF/jboss-web.xml) to configure the *context root* as the `archetypeArtifactId`, in this example it is `simple-jax-rs-2.0`, so the *context root* is `simple-jax-rs-2.0`.
