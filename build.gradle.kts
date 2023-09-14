plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "org.konte"
version = "1.0-SNAPSHOT"
description = "A basic Gradle project!"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks {
    test {
        useJUnitPlatform()
    }

    task("helloGradle") {
        doLast {
            println("Hello, Gradle!")
            println("Description: ${project.description}")
            println("Group: ${project.group}")
        }
    }
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}