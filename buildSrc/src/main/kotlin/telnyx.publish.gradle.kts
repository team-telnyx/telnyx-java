plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Telnyx API")
                description.set("Telnyx provides global communications and connectivity APIs for developers —\nincluding SIP trunking, programmable voice, SMS, MMS, WhatsApp Business\nMessaging, Call Control, Fax, Wireless (IoT & eSIM), Phone Numbers (DID\nprovisioning & porting), Emergency Services, and Network APIs for private\ninterconnects and edge connectivity. Build, scale, and manage voice, messaging,\nand data networks with Telnyx's carrier-grade global infrastructure and\nAPI-first platform.")
                url.set("https://www.github.com/stainless-sdks/telnyx-java")

                licenses {
                    license {
                        name.set("MIT")
                    }
                }

                developers {
                    developer {
                        name.set("Telnyx")
                        email.set("support@telnyx.com")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/stainless-sdks/telnyx-java.git")
                    developerConnection.set("scm:git:git://github.com/stainless-sdks/telnyx-java.git")
                    url.set("https://github.com/stainless-sdks/telnyx-java")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
