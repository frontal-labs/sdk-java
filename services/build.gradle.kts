plugins {
  `java-library`
  `maven-publish`
  signing
}

dependencies {
  api(project(":core"))
}

apply(from = rootProject.file("gradle/publish-module.gradle.kts"))
