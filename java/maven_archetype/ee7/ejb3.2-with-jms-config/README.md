# EJB 3.2 Project Generator
## Command
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=ejb3.2-with-jms-config        \
  -DgroupId=<my.group.id>                             \
  -DartifactId=<my-artifectid>                        \
  -DipAddress=<ip-address>
```
### Example in Non-interactive Mode
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=ejb3.2-with-jms-config        \
  -DgroupId=rx                                        \
  -DartifactId=simple-ejb3.2                          \
  -DipAddress=172.20.0.2                              \
  -DinteractiveMode=false
```
