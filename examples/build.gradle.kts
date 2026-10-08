plugins {
  `java-library`
}

dependencies {
  testImplementation(project(":sdk"))
  testImplementation("com.squareup.okhttp3:mockwebserver:4.12.0")
  testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
}
