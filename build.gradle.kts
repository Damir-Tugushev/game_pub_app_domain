import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.6.0"
}

group = "io.github.damir-tugushev.game_pub_app"
version = "0.1.0"

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib-jdk8", version = "1.6.0"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

publishing {
    publications {
        create<MavenPublication>("jitpack") {
            groupId = "com.github.Damir-Tugushev"
            artifactId = "game_pub_app_domain"

            from(components["kotlin"])
        }
    }
}
