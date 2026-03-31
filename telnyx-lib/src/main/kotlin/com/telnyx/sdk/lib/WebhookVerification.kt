// Custom ED25519 webhook verification - persists across codegen runs.

package com.telnyx.sdk.lib

import java.security.KeyFactory
import java.security.Signature
import java.security.spec.X509EncodedKeySpec
import java.util.Base64
import kotlin.math.abs

/**
 * Exception thrown when webhook signature verification fails.
 *
 * This error is raised when:
 * - No public key is configured
 * - Required headers are missing (telnyx-signature-ed25519, telnyx-timestamp)
 * - Timestamp is too old or too new (outside 5-minute tolerance)
 * - Signature verification fails
 * - Public key or signature format is invalid
 */
class WebhookVerificationException
@JvmOverloads
constructor(message: String, cause: Throwable? = null) : Exception(message, cause)

/**
 * ED25519 webhook signature verification for Telnyx webhooks.
 *
 * Telnyx webhooks are signed using ED25519 with the following format:
 * - Header "Telnyx-Signature-Ed25519": Base64-encoded ED25519 signature (64 bytes)
 * - Header "Telnyx-Timestamp": Unix timestamp in seconds
 * - Signed payload: "{timestamp}|{payload}"
 *
 * Usage:
 * ```kotlin
 * import com.telnyx.sdk.lib.WebhookVerification
 *
 * try {
 *     WebhookVerification.verify(payload, headers, publicKey)
 * } catch (e: WebhookVerificationException) {
 *     // Handle verification failure
 * }
 * ```
 */
object WebhookVerification {

    /** HTTP header containing the ED25519 signature (base64-encoded, 64 bytes). */
    const val SIGNATURE_HEADER = "telnyx-signature-ed25519"

    /** HTTP header containing the Unix timestamp in seconds. */
    const val TIMESTAMP_HEADER = "telnyx-timestamp"

    /** Maximum allowed time difference for webhook timestamps (5 minutes). */
    const val TIMESTAMP_TOLERANCE_SECONDS = 300L

    /** Expected size of ED25519 public key in bytes. */
    const val ED25519_PUBLIC_KEY_SIZE = 32

    /** Expected size of ED25519 signature in bytes. */
    const val ED25519_SIGNATURE_SIZE = 64

    /**
     * Verify the ED25519 signature of a Telnyx webhook.
     *
     * @param payload The raw webhook body as a string
     * @param headers Map of HTTP headers (case-insensitive lookup is performed)
     * @param publicKeyB64 Base64-encoded ED25519 public key from Telnyx Mission Control
     * @throws WebhookVerificationException If verification fails for any reason
     */
    @JvmStatic
    fun verify(payload: String, headers: Map<String, String>, publicKeyB64: String) {
        val signature = getHeader(headers, SIGNATURE_HEADER)
        val timestamp = getHeader(headers, TIMESTAMP_HEADER)

        if (signature.isNullOrEmpty()) {
            throw WebhookVerificationException("Missing required header: $SIGNATURE_HEADER")
        }
        if (timestamp.isNullOrEmpty()) {
            throw WebhookVerificationException("Missing required header: $TIMESTAMP_HEADER")
        }

        // Validate timestamp to prevent replay attacks
        try {
            val webhookTime = timestamp.toLong()
            val currentTime = System.currentTimeMillis() / 1000
            if (abs(currentTime - webhookTime) > TIMESTAMP_TOLERANCE_SECONDS) {
                throw WebhookVerificationException(
                    "Webhook timestamp is outside the allowed tolerance window " +
                        "(${abs(currentTime - webhookTime)}s difference, max ${TIMESTAMP_TOLERANCE_SECONDS}s)"
                )
            }
        } catch (e: NumberFormatException) {
            throw WebhookVerificationException("Invalid timestamp format: $timestamp", e)
        }

        // Decode and validate public key
        val publicKeyBytes =
            try {
                Base64.getDecoder().decode(publicKeyB64)
            } catch (e: Exception) {
                throw WebhookVerificationException("Invalid public key encoding", e)
            }

        if (publicKeyBytes.size != ED25519_PUBLIC_KEY_SIZE) {
            throw WebhookVerificationException(
                "Invalid public key size: expected $ED25519_PUBLIC_KEY_SIZE bytes, " +
                    "got ${publicKeyBytes.size}"
            )
        }

        // Decode and validate signature
        val signatureBytes =
            try {
                Base64.getDecoder().decode(signature)
            } catch (e: Exception) {
                throw WebhookVerificationException("Invalid signature encoding", e)
            }

        if (signatureBytes.size != ED25519_SIGNATURE_SIZE) {
            throw WebhookVerificationException(
                "Invalid signature size: expected $ED25519_SIGNATURE_SIZE bytes, " +
                    "got ${signatureBytes.size}"
            )
        }

        // Build the signed payload: "{timestamp}|{payload}"
        val signedPayload = "$timestamp|$payload".toByteArray(Charsets.UTF_8)

        // Verify the ED25519 signature
        try {
            val x509KeyBytes = wrapEd25519PublicKey(publicKeyBytes)
            val keySpec = X509EncodedKeySpec(x509KeyBytes)
            val keyFactory = KeyFactory.getInstance("Ed25519")
            val publicKey = keyFactory.generatePublic(keySpec)

            val sig = Signature.getInstance("Ed25519")
            sig.initVerify(publicKey)
            sig.update(signedPayload)

            if (!sig.verify(signatureBytes)) {
                throw WebhookVerificationException(
                    "Signature verification failed: signature does not match payload"
                )
            }
        } catch (e: WebhookVerificationException) {
            throw e
        } catch (e: Exception) {
            throw WebhookVerificationException(
                "Signature verification failed due to cryptographic error",
                e,
            )
        }
    }

    /**
     * Verify webhook signature using Telnyx SDK Headers type.
     *
     * @param payload The raw webhook body as a string
     * @param headers SDK Headers object
     * @param publicKeyB64 Base64-encoded ED25519 public key
     * @throws WebhookVerificationException If verification fails
     */
    @JvmStatic
    fun verify(payload: String, headers: com.telnyx.sdk.core.http.Headers, publicKeyB64: String) {
        val signature = getHeader(headers, SIGNATURE_HEADER)
        val timestamp = getHeader(headers, TIMESTAMP_HEADER)

        if (signature.isNullOrEmpty()) {
            throw WebhookVerificationException("Missing required header: $SIGNATURE_HEADER")
        }
        if (timestamp.isNullOrEmpty()) {
            throw WebhookVerificationException("Missing required header: $TIMESTAMP_HEADER")
        }

        // Convert to simple map and delegate
        val headersMap = mapOf(SIGNATURE_HEADER to signature, TIMESTAMP_HEADER to timestamp)
        verify(payload, headersMap, publicKeyB64)
    }

    /** Get header value case-insensitively from a map. */
    private fun getHeader(headers: Map<String, String>, name: String): String? {
        // Try exact match first
        headers[name]?.let {
            return it
        }

        // Case-insensitive search
        for ((key, value) in headers) {
            if (key.equals(name, ignoreCase = true)) {
                return value
            }
        }
        return null
    }

    /** Get header value from SDK Headers type. */
    private fun getHeader(headers: com.telnyx.sdk.core.http.Headers, name: String): String? {
        val values = headers.values(name)
        if (values.isNotEmpty()) {
            return values.first()
        }
        // Case-insensitive search
        for (headerName in headers.names()) {
            if (headerName.equals(name, ignoreCase = true)) {
                val headerValues = headers.values(headerName)
                if (headerValues.isNotEmpty()) {
                    return headerValues.first()
                }
            }
        }
        return null
    }

    /**
     * Wrap a raw ED25519 public key in X.509 SubjectPublicKeyInfo format.
     *
     * Java's KeyFactory requires keys in X.509 format, but Telnyx provides raw 32-byte ED25519
     * public keys. This method adds the required ASN.1 header.
     *
     * ED25519 OID: 1.3.101.112 = 06 03 2b 65 70 X.509 SPKI header for ED25519: 30 2a 30 05 06 03 2b
     * 65 70 03 21 00
     */
    private fun wrapEd25519PublicKey(rawKey: ByteArray): ByteArray {
        val header =
            byteArrayOf(0x30, 0x2a, 0x30, 0x05, 0x06, 0x03, 0x2b, 0x65, 0x70, 0x03, 0x21, 0x00)
        return header + rawKey
    }
}
