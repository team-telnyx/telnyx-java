import com.vanniktech.maven.publish.JavadocJar
import com.vanniktech.maven.publish.KotlinJvm
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
    configure(
        KotlinJvm(
            javadocJar = JavadocJar.Dokka("dokkaJavadoc"),
            sourcesJar = true,
        )
    )

    pom {
        name.set("Telnyx API")
        description.set("SIP trunking, SMS, MMS, Call Control and Telephony Data Services.")
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

tasks.withType<Zip>().configureEach {
    isZip64 = true
}
