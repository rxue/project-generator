# EJB 3.2 Project Generation with JMS Configuration

## NOTE! 

* Due to the defect in the embedded Active MQ inside Wildfly server, an IP address, `ipAddress` is needed to make the sending of message work.
* Due to the defect in the embedded Active MQ inside Wildfly server, JMS security is disabled in the `standalone-full.xml`

Configuration of the added message queue can be found from the generated `SampleMessageDrivenBean` class

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
