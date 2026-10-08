plugins {
  `java-library`
  `maven-publish`
  signing
}

dependencies {
  api("org.jspecify:jspecify:1.0.1")
  api("com.squareup.okhttp3:okhttp:5.5.0")
  api("com.fasterxml.jackson.core:jackson-databind:2.22.3")
}

apply(from = rootProject.file("gradle/publish-module.gradle.kts"))
