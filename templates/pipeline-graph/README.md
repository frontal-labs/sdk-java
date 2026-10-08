# Pipeline graph template

Starter layout for a pipeline, ontology, and lineage workflow.

This Java 17 Maven project is a starter scaffold. Add the Frontal SDK dependency to its `pom.xml`, then use the shared `Frontal` client and generated `Endpoints` constants from application code.

## Run

```bash
mvn package
java -cp target/classes dev.frontal.examples.pipelinegraph.Main
```

Keep application code under `src/main/java` and tests under `src/test/java`.
