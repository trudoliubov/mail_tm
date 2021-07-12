import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val restAssuredVersion = "2.9.0"
val testNGVersion = "6.14.3"
val jacksonVersion = "2.9.5"
plugins {
    kotlin("jvm") version "1.5.10"
}

group = "com.github.mail-tm"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

apply (plugin = "maven-publish")

dependencies {
    testImplementation(kotlin("test"))
    implementation("com.jayway.restassured", "rest-assured", restAssuredVersion)
    implementation("org.testng", "testng", testNGVersion)
    implementation("com.fasterxml.jackson.core", "jackson-databind", jacksonVersion)
}

tasks.test {
    useTestNG()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}