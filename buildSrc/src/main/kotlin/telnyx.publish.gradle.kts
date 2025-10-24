import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost

plugins {
    id("com.vanniktech.maven.publish")
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

extra["signingInMemoryKey"] = System.getenv("GPG_SIGNING_KEY")
extra["signingInMemoryKeyId"] = System.getenv("GPG_SIGNING_KEY_ID")
extra["signingInMemoryKeyPassword"] = System.getenv("GPG_SIGNING_PASSWORD")

configure<MavenPublishBaseExtension> {
    signAllPublications()
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)

    coordinates(project.group.toString(), project.name, project.version.toString())

    pom {
        name.set("Telnyx API")
        description.set("Telnyx provides global communications and connectivity APIs for developers —\nincluding SIP trunking, programmable voice, SMS, MMS, WhatsApp Business\nMessaging, Call Control, Fax, Wireless (IoT & eSIM), Phone Numbers (DID\nprovisioning & porting), Emergency Services, and Network APIs for private\ninterconnects and edge connectivity. Build, scale, and manage voice, messaging,\nand data networks with Telnyx's carrier-grade global infrastructure and\nAPI-first platform.")
        url.set("https://www.github.com/team-telnyx/telnyx-java")

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
            connection.set("scm:git:git://github.com/team-telnyx/telnyx-java.git")
            developerConnection.set("scm:git:git://github.com/team-telnyx/telnyx-java.git")
            url.set("https://github.com/team-telnyx/telnyx-java")
        }
    }
}
