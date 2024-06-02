val kotlin_version: String by project
val junit_jupiter_version: String by project

plugins {
    kotlin("jvm") version "1.9.23"
}

group = "dev.janku.learn.kotlincodewards"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // JUnit Jupiter
    testImplementation("org.junit.jupiter:junit-jupiter:$junit_jupiter_version")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junit_jupiter_version")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
