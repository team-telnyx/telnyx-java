// Custom module for webhook verification - persists across codegen runs.
//
// This module provides ED25519 webhook signature verification that is safe
// from Stainless codegen overwrites. Import and use WebhookVerification
// directly if you need standalone verification, or use the helper methods
// that integrate with the generated WebhookService.

plugins {
    id("telnyx.kotlin")
    id("telnyx.publish")
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.assertj:assertj-core:3.27.7")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
}
