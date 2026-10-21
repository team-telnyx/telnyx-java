plugins {
    `kotlin-dsl`
    kotlin("jvm") version "2.2.0"
    id("com.vanniktech.maven.publish") version "0.28.0"
}

kotlin {
    // Build logic uses the same JDK as the SDK, independently of the Gradle launcher JVM.
    jvmToolchain(21)
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.2.0")
    implementation("com.vanniktech:gradle-maven-publish-plugin:0.28.0")
    implementation("dev.sigstore:sigstore-gradle-sign-plugin:2.2.0")
}
