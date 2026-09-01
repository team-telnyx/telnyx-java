// File generated from our OpenAPI spec by Stainless. See CONTRIBUTING.md for details.
// Modified: Updated from StandardWebhooks (HMAC) to ED25519 verification

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.UnwrapWebhookParams
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.errors.TelnyxWebhookException
import java.security.KeyPairGenerator
import java.security.Signature
import java.time.Instant
import java.util.Base64
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class WebhookServiceTest {

    @Test
    fun unwrapValidTelnyxEd25519Signature() {
        val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val rawPublicKey = keyPair.public.encoded.takeLast(32).toByteArray()
        val publicKeyBase64 = Base64.getEncoder().encodeToString(rawPublicKey)
        val timestamp = Instant.now().epochSecond.toString()
        val payload =
            "{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"conference.floor.changed\",\"payload\":{\"call_control_id\":\"v3:test\",\"call_leg_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"call_session_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"client_state\":\"aGF2ZSBhIG5pY2UgZGF5ID1d\",\"conference_id\":\"428c31b6-abf3-3bc1-b7f4-5013ef9657c1\",\"connection_id\":\"7267xxxxxxxxxxxxxx\",\"occurred_at\":\"2018-02-02T22:25:27.521Z\"},\"record_type\":\"event\"}"
        val signer = Signature.getInstance("Ed25519")
        signer.initSign(keyPair.private)
        signer.update("$timestamp|$payload".toByteArray(Charsets.UTF_8))
        val signature = Base64.getEncoder().encodeToString(signer.sign())
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "Telnyx-Signature-Ed25519" to listOf(signature),
                        "Telnyx-Timestamp" to listOf(timestamp),
                    )
                )
                .build()
        val client =
            TelnyxOkHttpClient.builder().apiKey("My API Key").publicKey(publicKeyBase64).build()

        client
            .webhooks()
            .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
            .validate()
    }

    @Test
    fun unsafeUnwrap() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"conference.floor.changed\",\"payload\":{\"call_control_id\":\"v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg\",\"call_leg_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"call_session_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"client_state\":\"aGF2ZSBhIG5pY2UgZGF5ID1d\",\"conference_id\":\"428c31b6-abf3-3bc1-b7f4-5013ef9657c1\",\"connection_id\":\"7267xxxxxxxxxxxxxx\",\"occurred_at\":\"2018-02-02T22:25:27.521Z\"},\"record_type\":\"event\"}"
        val headers = Headers.builder().build()

        webhookService.unsafeUnwrap(payload).validate()
    }

    @Test
    fun unwrapMissingSignatureHeaderThrows() {
        val publicKeyBase64 = "jrMBoswHlhhVx2W2Www72WU/xn4UMpjreslD0m2u0qs="
        val client =
            TelnyxOkHttpClient.builder().apiKey("My API Key").publicKey(publicKeyBase64).build()
        val webhookService = client.webhooks()

        val payload = "{\"event_type\":\"test\"}"

        assertThrows<TelnyxWebhookException> {
            val badHeaders = Headers.builder().build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(badHeaders).build()
            )
        }
    }

    @Test
    fun unwrapExpiredTimestampThrows() {
        val publicKeyBase64 = "jrMBoswHlhhVx2W2Www72WU/xn4UMpjreslD0m2u0qs="
        val client =
            TelnyxOkHttpClient.builder().apiKey("My API Key").publicKey(publicKeyBase64).build()
        val webhookService = client.webhooks()

        val payload = "{\"event_type\":\"test\"}"

        assertThrows<TelnyxWebhookException> {
            val headers =
                Headers.builder()
                    .putAll(
                        mapOf(
                            "telnyx-signature-ed25519" to listOf("dGVzdA=="),
                            "telnyx-timestamp" to listOf("5"),
                        )
                    )
                    .build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }

    @Test
    fun unwrapMissingTimestampHeaderThrows() {
        val publicKeyBase64 = "jrMBoswHlhhVx2W2Www72WU/xn4UMpjreslD0m2u0qs="
        val client =
            TelnyxOkHttpClient.builder().apiKey("My API Key").publicKey(publicKeyBase64).build()
        val webhookService = client.webhooks()

        val payload = "{\"event_type\":\"test\"}"

        assertThrows<TelnyxWebhookException> {
            val headers =
                Headers.builder()
                    .putAll(mapOf("telnyx-signature-ed25519" to listOf("dGVzdA==")))
                    .build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }
}
