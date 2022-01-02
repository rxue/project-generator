# JAX-RS 2.0 Project Generation with EJB 3.2 Support

## NOTE!

* Default port number: 8080
* Endpoint URL of the sample resource: `http://localhost:<port number>/<web context>/rest/sample`, where the `<web context>` is the concatenation of artifect ID and version connected with the score

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
The endpoint URL of the sample resource will be: http://localhost:8082/simple-jax-rs-2.0/rest/sample
