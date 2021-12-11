# Java SE 8 Project Generator
## Command
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=se8                           \
  -DgroupId=<my.group.id>                             \
  -DartifactId=<my-artifectid>
```
### Example
```
mvn archetype:generate                                \
  -DarchetypeGroupId=org.apache.maven.archetypes      \
  -DarchetypeArtifactId=se8                           \
  -DgroupId=rx                                        \
  -DartifactId=simple-java-se-8                       \
  -DinteractiveMode=false
```
