import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.plugins.signing.SigningExtension

extensions.configure<PublishingExtension> {
  publications {
    create<MavenPublication>("mavenJava") {
      from(components["java"])
      artifactId = when (project.name) {
        "core" -> "frontal-sdk-core"
        "services" -> "frontal-sdk-services"
        else -> "frontal-sdk"
      }
      pom {
        name.set("Frontal Java SDK")
        description.set("Hand-written Java SDK for the Frontal API")
        url.set("https://github.com/frontal-labs/sdk-java")
        licenses {
          license {
            name.set("Apache License, Version 2.0")
            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
          }
        }
        scm {
          url.set("https://github.com/frontal-labs/sdk-java")
          connection.set("scm:git:git://github.com/frontal-labs/sdk-java.git")
          developerConnection.set("scm:git:ssh://github.com/frontal-labs/sdk-java.git")
        }
      }
    }
  }
}

val signingKey = providers.environmentVariable("SIGNING_KEY").orNull
val signingPassword = providers.environmentVariable("SIGNING_PASSWORD").orNull
val isCentralPublishing = gradle.startParameter.taskNames.any {
  it.contains("publishToSonatype") || it.contains("closeAndReleaseSonatypeStagingRepository")
}
if (isCentralPublishing) {
  require(!signingKey.isNullOrBlank() && !signingPassword.isNullOrBlank()) {
    "SIGNING_KEY and SIGNING_PASSWORD are required to publish signed artifacts to Maven Central"
  }
}
if (!signingKey.isNullOrBlank() && signingPassword != null) {
  val publication =
      extensions.getByType(PublishingExtension::class.java).publications["mavenJava"]
  extensions.configure<SigningExtension> {
    useInMemoryPgpKeys(signingKey, signingPassword)
    sign(publication)
  }
}
