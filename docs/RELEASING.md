# Java release checklist

Publish signed artifacts to Maven Central through the Central Portal. Before release, verify coordinates, sources and Javadoc artifacts, signing, POM metadata, and the protected version tag. Configure credentials and signing material as repository secrets; never store them in the POM.

Before publishing, run the Java CI checks, update the changelog and package metadata, review `contracts/reports/migration-matrix.md`, and verify the artifact contents.
