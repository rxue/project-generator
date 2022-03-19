# Generate

## [Creating Your Own Full Featured Java-EE 7 Application](https://docs.wildfly.org/13/Getting_Started_Developing_Applications_Guide.html#creating-your-own-application)
> To use the archetype to generate a new project, you should run:
```
mvn archetype:generate \
    -DarchetypeArtifactId=jboss-javaee7-webapp-archetype \
    -DarchetypeGroupId=org.jboss.spec.archetypes \
    -DarchetypeVersion=7.1.1.CR2 \
```

Similarly searching for wildfly javaee7 webapp archetype from Maven repository search engine, search.maven.org, there are relevant archetypes available. For instance, the following generating command can be used:
```
mvn archetype:generate \
    -DarchetypeArtifactId=wildfly-javaee7-webapp-archetype \
    -DarchetypeGroupId=org.wildfly.archetype \
    -DarchetypeVersion=8.2.0.Final \
```
### Create an empty web application with `wildfly-javaee7-webapp-blank-archetype`

```
mvn archetype:generate \
  -DarchetypeArtifactId=wildfly-javaee7-webapp-blank-archetype \
  -DarchetypeGroupId=org.wildfly.archetype \
  -DarchetypeVersion=8.2.0.Final \
```
