plugins {
    id("telnyx.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":telnyx-core"))
    implementation(project(":telnyx-client-okhttp"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :telnyx-example:run` to run `Main`
    // Use `./gradlew :telnyx-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.telnyx.sdk.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
