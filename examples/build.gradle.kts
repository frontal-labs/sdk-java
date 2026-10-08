plugins {
  `java-library`
}

dependencies {
  testImplementation(project(":sdk"))
  testImplementation("com.squareup.okhttp3:mockwebserver:5.5.0")
  testImplementation("org.junit.jupiter:junit-jupiter:6.1.3")
}
