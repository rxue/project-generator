# EJB 3.2 Project Generator

Default port number is `8080`

## Command
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=jax-rs-2.0-with-ejb3.2        \
  -DgroupId=<my.group.id>                             \
  -DartifactId=<my-artifectid>                        \
  -DportNumber=<port-number>
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
