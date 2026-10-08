plugins {
  `java-library`
  `maven-publish`
  signing
}

dependencies {
  api("org.jspecify:jspecify:1.0.0")
  api("com.squareup.okhttp3:okhttp:4.12.0")
  api("com.fasterxml.jackson.core:jackson-databind:2.18.2")
}

apply(from = rootProject.file("gradle/publish-module.gradle.kts"))
