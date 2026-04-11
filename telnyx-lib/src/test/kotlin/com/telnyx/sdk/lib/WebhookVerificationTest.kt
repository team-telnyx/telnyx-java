// Custom code for webhook verification - persists across codegen runs.

package com.telnyx.sdk.lib

import java.security.KeyFactory
import java.security.Signature
import java.security.spec.PKCS8EncodedKeySpec
import java.util.Base64
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.junit.jupiter.api.Test

class WebhookVerificationTest {

    // Test ED25519 keypair (generated for testing only — never use in production)
    private val testPrivateKeyB64 = "i1xxSkIuQOY9H8laaRslIoYGTJ1NwBAFdjsQwiwJH04="
    private val testPublicKeyB64 = "jrMBoswHlhhVx2W2Www72WU/xn4UMpjreslD0m2u0qs="

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
    fun `verify throws when timestamp is in the future`() {
        // Timestamp 10 minutes in the future
        val futureTimestamp = (System.currentTimeMillis() / 1000 + 600).toString()
        val headers =
            mapOf(
                "telnyx-signature-ed25519" to "dGVzdHNpZ25hdHVyZQ==",
                "telnyx-timestamp" to futureTimestamp,
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
    fun `verify throws when public key is not valid base64`() {
        val currentTimestamp = (System.currentTimeMillis() / 1000).toString()
        val headers =
            mapOf(
                "telnyx-signature-ed25519" to
                    "QUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUFBQUE=",
                "telnyx-timestamp" to currentTimestamp,
            )
        val invalidKey = "not-valid-base64!!!"

        assertThatThrownBy { WebhookVerification.verify("{}", headers, invalidKey) }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Invalid public key encoding")
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
    fun `verify throws when signature does not match payload`() {
        val currentTimestamp = (System.currentTimeMillis() / 1000).toString()
        // 64 bytes of zeros — valid size but wrong signature
        val wrongSignatureB64 = Base64.getEncoder().encodeToString(ByteArray(64))
        val headers =
            mapOf(
                "telnyx-signature-ed25519" to wrongSignatureB64,
                "telnyx-timestamp" to currentTimestamp,
            )

        assertThatThrownBy { WebhookVerification.verify("{}", headers, testPublicKeyB64) }
            .isInstanceOf(WebhookVerificationException::class.java)
            .hasMessageContaining("Signature verification failed")
    }

    @Test
    fun `verify succeeds with valid signature`() {
        val currentTimestamp = (System.currentTimeMillis() / 1000).toString()
        val payload = """{"event_type":"test","id":"abc123"}"""

        // Sign the payload using the test private key
        val signatureB64 = signEd25519(testPrivateKeyB64, "$currentTimestamp|$payload")

        val headers =
            mapOf(
                "telnyx-signature-ed25519" to signatureB64,
                "telnyx-timestamp" to currentTimestamp,
            )

        // Should not throw — valid signature
        WebhookVerification.verify(payload, headers, testPublicKeyB64)
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

    /**
     * Sign a message using an Ed25519 private key (raw 32 bytes, base64-encoded).
     *
     * Wraps the raw key in PKCS#8 format so Java's KeyFactory can parse it.
     */
    private fun signEd25519(privateKeyB64: String, message: String): String {
        val rawPrivateKey = Base64.getDecoder().decode(privateKeyB64)

        // Wrap raw 32-byte Ed25519 private key in PKCS#8 format
        // ASN.1: SEQUENCE { SEQUENCE { OID Ed25519 }, OCTET STRING { OCTET STRING { rawKey } } }
        val pkcs8Header =
            byteArrayOf(
                0x30,
                0x2e, // SEQUENCE (46 bytes)
                0x02,
                0x01,
                0x00, // INTEGER 0 (version)
                0x30,
                0x05, // SEQUENCE (5 bytes)
                0x06,
                0x03,
                0x2b,
                0x65,
                0x70, // OID 1.3.101.112 (Ed25519)
                0x04,
                0x22, // OCTET STRING (34 bytes)
                0x04,
                0x20, // OCTET STRING (32 bytes = raw key)
            )
        val pkcs8Key = pkcs8Header + rawPrivateKey

        val keySpec = PKCS8EncodedKeySpec(pkcs8Key)
        val keyFactory = KeyFactory.getInstance("Ed25519")
        val privateKey = keyFactory.generatePrivate(keySpec)

        val signer = Signature.getInstance("Ed25519")
        signer.initSign(privateKey)
        signer.update(message.toByteArray(Charsets.UTF_8))

        return Base64.getEncoder().encodeToString(signer.sign())
    }
}
