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
                description.set("SIP trunking, SMS, MMS, Call Control and Telephony Data Services.")
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
