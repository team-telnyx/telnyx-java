// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
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
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookServiceTest {

    private val keyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()

    private val publicKeyB64: String =
        Base64.getEncoder().encodeToString(keyPair.public.encoded.takeLast(32).toByteArray())

    private fun signPayload(timestamp: Long, payload: String): String {
        val signedPayload = "$timestamp|$payload".toByteArray(Charsets.UTF_8)
        val sig = Signature.getInstance("Ed25519")
        sig.initSign(keyPair.private)
        sig.update(signedPayload)
        return Base64.getEncoder().encodeToString(sig.sign())
    }

    @Test
    fun unsafeUnwrap() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        webhookService.unsafeUnwrap(payload).validate()
    }

    @Test
    fun unwrapWithoutHeaders() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        webhookService.unwrap(payload).validate()
    }

    @Test
    fun unwrapWithValidSignature() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(publicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val timestamp = Instant.now().epochSecond
        val signature = signPayload(timestamp, payload)

        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "telnyx-signature-ed25519" to listOf(signature),
                        "telnyx-timestamp" to listOf(timestamp.toString()),
                    )
                )
                .build()

        webhookService
            .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
            .validate()
    }

    @Test
    fun unwrapWithWrongKey() {
        val wrongKeyPair = KeyPairGenerator.getInstance("Ed25519").generateKeyPair()
        val wrongPublicKeyB64 =
            Base64.getEncoder()
                .encodeToString(wrongKeyPair.public.encoded.takeLast(32).toByteArray())

        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(wrongPublicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val timestamp = Instant.now().epochSecond
        val signature = signPayload(timestamp, payload)

        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "telnyx-signature-ed25519" to listOf(signature),
                        "telnyx-timestamp" to listOf(timestamp.toString()),
                    )
                )
                .build()

        assertThrows<TelnyxWebhookException> {
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }

    @Test
    fun unwrapWithBadSignature() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(publicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val timestamp = Instant.now().epochSecond
        val badSignature = signPayload(timestamp, "some other payload")

        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "telnyx-signature-ed25519" to listOf(badSignature),
                        "telnyx-timestamp" to listOf(timestamp.toString()),
                    )
                )
                .build()

        assertThrows<TelnyxWebhookException> {
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }

    @Test
    fun unwrapWithOldTimestamp() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(publicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val oldTimestamp = Instant.now().epochSecond - 600
        val signature = signPayload(oldTimestamp, payload)

        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "telnyx-signature-ed25519" to listOf(signature),
                        "telnyx-timestamp" to listOf(oldTimestamp.toString()),
                    )
                )
                .build()

        assertThrows<TelnyxWebhookException> {
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }

    @Test
    fun unwrapWithMissingSignatureHeader() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(publicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val timestamp = Instant.now().epochSecond

        val headers =
            Headers.builder()
                .putAll(mapOf("telnyx-timestamp" to listOf(timestamp.toString())))
                .build()

        assertThrows<TelnyxWebhookException> {
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }

    @Test
    fun unwrapWithMissingTimestampHeader() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .publicKey(publicKeyB64)
                .build()
        val webhookService = client.webhooks()

        val payload =
            "{\"data\":{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"call.ai_gather.ended\",\"occurred_at\":\"2018-02-02T22:25:27.521992Z\",\"payload\":{},\"record_type\":\"event\"}}"

        val timestamp = Instant.now().epochSecond
        val signature = signPayload(timestamp, payload)

        val headers =
            Headers.builder().putAll(mapOf("telnyx-signature-ed25519" to listOf(signature))).build()

        assertThrows<TelnyxWebhookException> {
            webhookService.unwrap(
                UnwrapWebhookParams.builder().body(payload).headers(headers).build()
            )
        }
    }
}
