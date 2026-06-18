// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.standardwebhooks.Webhook
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.UnwrapWebhookParams
import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.errors.TelnyxWebhookException
import java.time.Instant
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

internal class WebhookServiceTest {

    @Test
    fun unsafeUnwrap() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"conference.floor.changed\",\"payload\":{\"call_control_id\":\"v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg\",\"call_leg_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"call_session_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"client_state\":\"aGF2ZSBhIG5pY2UgZGF5ID1d\",\"conference_id\":\"428c31b6-abf3-3bc1-b7f4-5013ef9657c1\",\"connection_id\":\"7267xxxxxxxxxxxxxx\",\"occurred_at\":\"2018-02-02T22:25:27.521Z\"},\"record_type\":\"event\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val headers = Headers.builder().build()

        webhookService.unsafeUnwrap(payload).validate()
    }

    @Test
    fun unwrap() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookService = client.webhooks()

        val payload =
            "{\"id\":\"0ccc7b54-4df3-4bca-a65a-3da1ecc777f0\",\"event_type\":\"conference.floor.changed\",\"payload\":{\"call_control_id\":\"v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg\",\"call_leg_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"call_session_id\":\"428c31b6-7af4-4bcb-b7f5-5013ef9657c1\",\"client_state\":\"aGF2ZSBhIG5pY2UgZGF5ID1d\",\"conference_id\":\"428c31b6-abf3-3bc1-b7f4-5013ef9657c1\",\"connection_id\":\"7267xxxxxxxxxxxxxx\",\"occurred_at\":\"2018-02-02T22:25:27.521Z\"},\"record_type\":\"event\"}"
        val webhookSecret = "whsec_c2VjcmV0Cg=="
        val messageId = "1"
        val timestampSeconds = Instant.now().epochSecond
        val webhook = Webhook(webhookSecret)
        val signature = webhook.sign(messageId, timestampSeconds, payload)
        val headers =
            Headers.builder()
                .putAll(
                    mapOf(
                        "webhook-signature" to listOf(signature),
                        "webhook-id" to listOf(messageId),
                        "webhook-timestamp" to listOf(timestampSeconds.toString()),
                    )
                )
                .build()

        // Correct key should not throw
        webhookService.unwrap(
            UnwrapWebhookParams.builder()
                .body(payload)
                .headers(headers)
                .secret(webhookSecret)
                .build()
        )
        webhookService
            .withOptions { it.publicKey(webhookSecret) }
            .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())

        // Secret in method takes precedence to secret on client
        val wrongKey = "whsec_aaaaaaaaaa"
        webhookService
            .withOptions { it.publicKey(wrongKey) }
            .unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(webhookSecret)
                    .build()
            )

        // Wrong key should throw
        assertThrows<TelnyxWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<TelnyxWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService
                .withOptions { it.publicKey(wrongKey) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        assertThrows<TelnyxWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(headers)
                    .secret(wrongKey)
                    .build()
            )
        }
        assertThrows<TelnyxWebhookException> {
            val wrongKey = "whsec_aaaaaaaaaa"
            webhookService
                .withOptions { it.publicKey(wrongKey) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(headers).build())
        }

        // Bad signature should throw
        assertThrows<TelnyxWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(badHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<TelnyxWebhookException> {
            val badSig = webhook.sign(messageId, timestampSeconds, "some other payload")
            val badHeaders =
                headers.toBuilder().replace("webhook-signature", listOf(badSig)).build()
            webhookService
                .withOptions { it.publicKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(badHeaders).build())
        }

        // Old timestamp should throw
        assertThrows<TelnyxWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(oldHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<TelnyxWebhookException> {
            val oldHeaders = headers.toBuilder().replace("webhook-timestamp", listOf("5")).build()
            webhookService
                .withOptions { it.publicKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(oldHeaders).build())
        }

        // Wrong message ID should throw
        assertThrows<TelnyxWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService.unwrap(
                UnwrapWebhookParams.builder()
                    .body(payload)
                    .headers(wrongIdHeaders)
                    .secret(webhookSecret)
                    .build()
            )
        }
        assertThrows<TelnyxWebhookException> {
            val wrongIdHeaders = headers.toBuilder().replace("webhook-id", listOf("wrong")).build()
            webhookService
                .withOptions { it.publicKey(webhookSecret) }
                .unwrap(UnwrapWebhookParams.builder().body(payload).headers(wrongIdHeaders).build())
        }
    }
}
