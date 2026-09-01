// File generated from our OpenAPI spec by Stainless. See CONTRIBUTING.md for details.
// Modified: Updated from StandardWebhooks (HMAC) to ED25519 verification

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.UnwrapWebhookParams
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.errors.TelnyxWebhookException
import java.security.KeyPair
import java.security.KeyPairGenerator
import java.security.Signature
import java.time.Instant
import java.util.Base64
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class WebhookServiceTest {

    @Test
    fun unwrapBodyOnlyFailsClosedBeforeParsing() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()

        assertThrows<TelnyxWebhookException> { client.webhooks().unwrap("not json") }
    }

    @Test
    fun unwrapParamsWithoutHeadersFailsClosed() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()

        assertThrows<TelnyxWebhookException> {
            client.webhooks().unwrap(UnwrapWebhookParams.builder().body("{}").build())
        }
    }

    @Test
    fun unwrapWithoutPublicKeyFailsClosed() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "telnyx-signature-ed25519" to
                            listOf(Base64.getEncoder().encodeToString(ByteArray(64))),
                        "telnyx-timestamp" to listOf(Instant.now().epochSecond.toString()),
                    )
                )
                .build()

        assertThrows<TelnyxWebhookException> {
            client
                .webhooks()
                .unwrap(UnwrapWebhookParams.builder().body("{}").headers(headers).build())
        }
    }

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
    fun unwrapRejectsTamperedRawPayload() {
        val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val timestamp = Instant.now().epochSecond.toString()
        val signedPayload = "{\"event_type\":\"signed\"}"
        val client =
            TelnyxOkHttpClient.builder()
                .apiKey("My API Key")
                .publicKey(rawPublicKey(keyPair))
                .build()

        assertThrows<TelnyxWebhookException> {
            client
                .webhooks()
                .unwrap(
                    UnwrapWebhookParams.builder()
                        .body("{\"event_type\":\"tampered\"}")
                        .headers(signedHeaders(keyPair, signedPayload, timestamp))
                        .build()
                )
        }
    }

    @Test
    fun unwrapRejectsFutureTimestamp() {
        val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val payload = "{}"
        val timestamp = (Instant.now().epochSecond + 600).toString()
        val client =
            TelnyxOkHttpClient.builder()
                .apiKey("My API Key")
                .publicKey(rawPublicKey(keyPair))
                .build()

        assertThrows<TelnyxWebhookException> {
            client
                .webhooks()
                .unwrap(
                    UnwrapWebhookParams.builder()
                        .body(payload)
                        .headers(signedHeaders(keyPair, payload, timestamp))
                        .build()
                )
        }
    }

    @Test
    fun unwrapAcceptsPerCallPublicKeyOverride() {
        val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val payload =
            "{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"conference.floor.changed\",\"payload\":{\"call_control_id\":\"v3:test\",\"call_leg_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"call_session_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"client_state\":\"aGF2ZSBhIG5pY2UgZGF5ID1d\",\"conference_id\":\"428c31b6-abf3-3bc1-b7f4-5013ef9657c1\",\"connection_id\":\"7267xxxxxxxxxxxxxx\",\"occurred_at\":\"2018-02-02T22:25:27.521Z\"},\"record_type\":\"event\"}"
        val timestamp = Instant.now().epochSecond.toString()
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()

        client
            .webhooks()
            .unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(signedHeaders(keyPair, payload, timestamp))
                    .secret(rawPublicKey(keyPair))
                    .build()
            )
            .validate()
    }

    @Test
    fun unwrapVerifiesValidSignatureBeforeParsingInvalidJson() {
        val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val payload = "not json"
        val timestamp = Instant.now().epochSecond.toString()
        val client =
            TelnyxOkHttpClient.builder()
                .apiKey("My API Key")
                .publicKey(rawPublicKey(keyPair))
                .build()

        assertThrows<TelnyxInvalidDataException> {
            client
                .webhooks()
                .unwrap(
                    UnwrapWebhookParams.builder()
                        .body(payload)
                        .headers(signedHeaders(keyPair, payload, timestamp))
                        .build()
                )
        }
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

    private fun rawPublicKey(keyPair: KeyPair): String =
        Base64.getEncoder().encodeToString(keyPair.public.encoded.takeLast(32).toByteArray())

    private fun signedHeaders(keyPair: KeyPair, payload: String, timestamp: String): Headers {
        val signer = Signature.getInstance("Ed25519")
        signer.initSign(keyPair.private)
        signer.update("$timestamp|$payload".toByteArray(Charsets.UTF_8))
        return Headers.builder()
            .putAll(
                mapOf(
                    "Telnyx-Signature-Ed25519" to
                        listOf(Base64.getEncoder().encodeToString(signer.sign())),
                    "Telnyx-Timestamp" to listOf(timestamp),
                )
            )
            .build()
    }
}
