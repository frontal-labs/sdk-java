# Publishing to Maven Central

Publish signed artifacts to Maven Central through the Central Portal. Before release, verify coordinates, sources and Javadoc artifacts, signing, POM metadata, and the protected version tag. Configure credentials and signing material as repository secrets; never store them in the POM.

The repository currently has no registry publishing credentials or release action. Complete the implementation and release metadata first. Keep credentials in protected repository secrets and use the registry's recommended signing or trusted-publishing mechanism where available.
