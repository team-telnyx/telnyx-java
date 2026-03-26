// Custom module for WebSocket streaming support - persists across codegen runs.

plugins {
    id("telnyx.kotlin")
    id("telnyx.publish")
}

dependencies {
    api(project(":telnyx-core"))
    api(project(":telnyx-client-okhttp"))

    implementation("com.squareup.okhttp3:okhttp:4.12.0")

    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testImplementation("org.mockito:mockito-core:5.14.2")
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")
}
