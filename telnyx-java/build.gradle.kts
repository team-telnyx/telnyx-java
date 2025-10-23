plugins {
    id("telnyx.kotlin")
    id("telnyx.publish")
}

dependencies {
    api(project(":telnyx-java-client-okhttp"))
}
