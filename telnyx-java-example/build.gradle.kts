plugins {
    id("telnyx.java")
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":telnyx"))
}

tasks.withType<JavaCompile>().configureEach {
    // Allow using more modern APIs, like `List.of` and `Map.of`, in examples.
    options.release.set(9)
}

application {
    // Use `./gradlew :telnyx-java-example:run` to run `Main`
    // Use `./gradlew :telnyx-java-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.telnyx.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}Example"
        else
            "Main"
    }"
}
