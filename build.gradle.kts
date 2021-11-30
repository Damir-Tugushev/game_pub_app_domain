import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.6.0"
}

group = "io.github.damir_tugushev.game_pub_app"
version = "0.1.0"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

kotlin {
    explicitApi()
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

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib-jdk8", version = "1.6.0"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
