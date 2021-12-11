# EJB 3.2 Project Generator
## Command
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=ejb3.2                        \
  -DgroupId=<my.group.id>                             \
  -DartifactId=<my-artifectid>
```
### Example
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=ejb3.2                        \
  -DgroupId=rx                                        \
  -DartifactId=simple-ejb3.2                          \
  -DinteractiveMode=false
```
