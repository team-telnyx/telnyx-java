// Custom code for webhook verification - persists across codegen runs.

package com.telnyx.sdk.lib

import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class WebhookVerificationTest {

    @Test
    fun `verify throws when signature header is missing`() {
        val headers = mapOf("telnyx-timestamp" to "1234567890")

        assertThatThrownBy { WebhookVerification.verify("{}", headers, "dGVzdGtleQ==") }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Missing required header: telnyx-signature-ed25519")
    }

    @Test
    fun `verify throws when timestamp header is missing`() {
        val headers = mapOf("telnyx-signature-ed25519" to "dGVzdHNpZ25hdHVyZQ==")

        assertThatThrownBy { WebhookVerification.verify("{}", headers, "dGVzdGtleQ==") }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Missing required header: telnyx-timestamp")
    }

    @Test
    fun `verify throws when timestamp is invalid`() {
        val headers =
            mapOf(
                "telnyx-signature-ed25519" to "dGVzdHNpZ25hdHVyZQ==",
                "telnyx-timestamp" to "not-a-number",
            )

        assertThatThrownBy { WebhookVerification.verify("{}", headers, "dGVzdGtleQ==") }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Invalid timestamp format")
    }

    @Test
    fun `verify throws when timestamp is too old`() {
        // Timestamp from 10 minutes ago
        val oldTimestamp = (System.currentTimeMillis() / 1000 - 600).toString()
        val headers =
            mapOf(
                "telnyx-signature-ed25519" to "dGVzdHNpZ25hdHVyZQ==",
                "telnyx-timestamp" to oldTimestamp,
            )

        assertThatThrownBy { WebhookVerification.verify("{}", headers, "dGVzdGtleQ==") }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("outside the allowed tolerance window")
    }

    @Test
    fun `verify throws when public key is invalid size`() {
        val currentTimestamp = (System.currentTimeMillis() / 1000).toString()
        val headers =
            mapOf(
                // Valid base64 but wrong size (not 64 bytes)
                "telnyx-signature-ed25519" to
                    "QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE=",
                "telnyx-timestamp" to currentTimestamp,
            )
        // Invalid key size (not 32 bytes)
        val invalidKey = "dGVzdA==" // "test" = 4 bytes

        assertThatThrownBy { WebhookVerification.verify("{}", headers, invalidKey) }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Invalid public key size")
    }

    @Test
    fun `verify throws when signature is invalid size`() {
        val currentTimestamp = (System.currentTimeMillis() / 1000).toString()
        val headers =
            mapOf(
                // Invalid signature size (not 64 bytes)
                "telnyx-signature-ed25519" to "dGVzdA==",
                "telnyx-timestamp" to currentTimestamp,
            )
        // Valid 32-byte key
        val validKey = "QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE="

        assertThatThrownBy { WebhookVerification.verify("{}", headers, validKey) }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Invalid signature size")
    }

    @Test
    fun `header lookup is case-insensitive`() {
        val headers =
            mapOf(
                "TELNYX-SIGNATURE-ED25519" to "dGVzdHNpZ25hdHVyZQ==",
                "Telnyx-Timestamp" to "not-a-number",
            )

        // Should find headers despite different case, then fail on invalid timestamp
        assertThatThrownBy { WebhookVerification.verify("{}", headers, "dGVzdGtleQ==") }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Invalid timestamp format")
    }

    @Test
    fun `constants have expected values`() {
        assertThat(WebhookVerification.SIGNATURE_HEADER).isEqualTo("telnyx-signature-ed25519")
        assertThat(WebhookVerification.TIMESTAMP_HEADER).isEqualTo("telnyx-timestamp")
        assertThat(WebhookVerification.TIMESTAMP_TOLERANCE_SECONDS).isEqualTo(300L)
        assertThat(WebhookVerification.ED25519_PUBLIC_KEY_SIZE).isEqualTo(32)
        assertThat(WebhookVerification.ED25519_SIGNATURE_SIZE).isEqualTo(64)
    }
}
