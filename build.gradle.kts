import org.gradle.api.tasks.compile.JavaCompile
import org.gradle.api.tasks.testing.Test
import org.gradle.api.tasks.Exec
import org.gradle.api.plugins.JavaPluginExtension
import org.gradle.jvm.toolchain.JavaLanguageVersion
import net.ltgt.gradle.errorprone.errorprone

plugins {
  id("com.diffplug.spotless") version "8.10.3" apply false
  id("net.ltgt.errorprone") version "5.1.1" apply false
  id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

group = "dev.frontal"
version = providers.gradleProperty("sdkVersion").get()

allprojects {
  group = rootProject.group
  version = rootProject.version
}

subprojects {
  apply(plugin = "java-library")
  apply(plugin = "com.diffplug.spotless")
  apply(plugin = "net.ltgt.errorprone")

  dependencies {
    "errorprone"("com.google.errorprone:error_prone_core:2.42.0")
    "errorprone"("com.uber.nullaway:nullaway:0.14.2")
    "testImplementation"("org.junit.jupiter:junit-jupiter:6.1.3")
    "testRuntimeOnly"("org.junit.platform:junit-platform-launcher")
  }

  extensions.configure<JavaPluginExtension> {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
    withSourcesJar()
    withJavadocJar()
  }

  tasks.withType<JavaCompile>().configureEach {
    options.release.set(17)
    options.encoding = "UTF-8"
    options.errorprone {
      error("NullAway")
      option("NullAway:AnnotatedPackages", "dev.frontal.sdk")
      option("NullAway:OnlyNullMarked", "true")
    }
  }

  tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    testLogging {
      events("failed", "skipped")
    }
  }

  extensions.configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    java {
      palantirJavaFormat("2.96.0")
      formatAnnotations()
      target("src/**/*.java")
    }
  }
}

tasks.register("lint") {
  group = "verification"
  description = "Runs Error Prone and NullAway through Java compilation."
  dependsOn(subprojects.map { "${it.path}:compileJava" })
}

tasks.register("examplesTest") {
  group = "verification"
  description = "Compiles and runs the repository's executable Java examples."
  dependsOn(":examples:test")
}

tasks.register("docsTest") {
  group = "verification"
  description = "Compiles and runs Java examples extracted from the README."
  dependsOn(":sdk:test")
}

tasks.register("checkContracts") {
  group = "verification"
  description = "Checks the OpenAPI snapshots, route inventory, and endpoint constants."
  dependsOn(":sdk:contractTest", "checkContractSnapshots")
}

tasks.register<Exec>("checkContractSnapshots") {
  group = "verification"
  description = "Validates the committed OpenAPI snapshots and generated endpoint catalog."
  workingDir = rootProject.projectDir
  commandLine("python3", "scripts/check_contracts.py")
}

nexusPublishing {
  repositories {
    sonatype {
      nexusUrl.set(uri("https://ossrh-staging-api.central.sonatype.com/service/local/"))
      snapshotRepositoryUrl.set(uri("https://central.sonatype.com/repository/maven-snapshots/"))
      username.set(providers.environmentVariable("SONATYPE_USERNAME"))
      password.set(providers.environmentVariable("SONATYPE_PASSWORD"))
    }
  }
}
