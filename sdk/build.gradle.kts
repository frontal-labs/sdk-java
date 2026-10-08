plugins {
  `java-library`
  `maven-publish`
  signing
}

dependencies {
  api(project(":core"))
  api(project(":services"))
  testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
}

tasks.register<Test>("contractTest") {
  description = "Checks endpoint constants against the committed service route inventory."
  group = "verification"
  testClassesDirs = sourceSets.test.get().output.classesDirs
  classpath = sourceSets.test.get().runtimeClasspath
  filter {
    includeTestsMatching("dev.frontal.sdk.ContractCoverageTest")
  }
}

apply(from = rootProject.file("gradle/publish-module.gradle.kts"))
