// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryTest {

    @Test
    fun create() {
        val webhookDelivery =
            WebhookDelivery.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .addAttempt(
                    Attempt.builder()
                        .addError(0L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .http(
                            Http.builder()
                                .request(
                                    Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://fallback.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    Http.Response.builder()
                                        .body("All good.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .status(200L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                        .status(Attempt.Status.DELIVERED)
                        .build()
                )
                .addAttempt(
                    Attempt.builder()
                        .addError(75499L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                        .http(
                            Http.builder()
                                .request(
                                    Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://typo.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    Http.Response.builder()
                                        .body("Oops. Not found.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .addHeader(listOf("Pragma", "no-cache"))
                                        .status(404L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                        .status(Attempt.Status.FAILED)
                        .build()
                )
                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                .recordType("webhook_delivery")
                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                .status(WebhookDelivery.Status.DELIVERED)
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .webhook(
                    WebhookDelivery.Webhook.builder()
                        .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                        .eventType("call_initiated")
                        .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                        .payload(
                            WebhookDelivery.Webhook.Payload.builder()
                                .putAdditionalProperty("useful", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType(WebhookDelivery.Webhook.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(webhookDelivery.id()).contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(webhookDelivery.attempts().getOrNull())
            .containsExactly(
                Attempt.builder()
                    .addError(0L)
                    .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                    .http(
                        Http.builder()
                            .request(
                                Http.Request.builder()
                                    .addHeader(listOf("Accept", "*/*"))
                                    .url("https://fallback.example.com/webhooks")
                                    .build()
                            )
                            .response(
                                Http.Response.builder()
                                    .body("All good.")
                                    .addHeader(listOf("Content-Type", "text/html"))
                                    .status(200L)
                                    .build()
                            )
                            .build()
                    )
                    .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                    .status(Attempt.Status.DELIVERED)
                    .build(),
                Attempt.builder()
                    .addError(75499L)
                    .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                    .http(
                        Http.builder()
                            .request(
                                Http.Request.builder()
                                    .addHeader(listOf("Accept", "*/*"))
                                    .url("https://typo.example.com/webhooks")
                                    .build()
                            )
                            .response(
                                Http.Response.builder()
                                    .body("Oops. Not found.")
                                    .addHeader(listOf("Content-Type", "text/html"))
                                    .addHeader(listOf("Pragma", "no-cache"))
                                    .status(404L)
                                    .build()
                            )
                            .build()
                    )
                    .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                    .status(Attempt.Status.FAILED)
                    .build(),
            )
        assertThat(webhookDelivery.finishedAt())
            .contains(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
        assertThat(webhookDelivery.recordType()).contains("webhook_delivery")
        assertThat(webhookDelivery.startedAt())
            .contains(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
        assertThat(webhookDelivery.status()).contains(WebhookDelivery.Status.DELIVERED)
        assertThat(webhookDelivery.userId()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(webhookDelivery.webhook())
            .contains(
                WebhookDelivery.Webhook.builder()
                    .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                    .eventType("call_initiated")
                    .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                    .payload(
                        WebhookDelivery.Webhook.Payload.builder()
                            .putAdditionalProperty("useful", JsonValue.from("bar"))
                            .build()
                    )
                    .recordType(WebhookDelivery.Webhook.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDelivery =
            WebhookDelivery.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .addAttempt(
                    Attempt.builder()
                        .addError(0L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .http(
                            Http.builder()
                                .request(
                                    Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://fallback.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    Http.Response.builder()
                                        .body("All good.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .status(200L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                        .status(Attempt.Status.DELIVERED)
                        .build()
                )
                .addAttempt(
                    Attempt.builder()
                        .addError(75499L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                        .http(
                            Http.builder()
                                .request(
                                    Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://typo.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    Http.Response.builder()
                                        .body("Oops. Not found.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .addHeader(listOf("Pragma", "no-cache"))
                                        .status(404L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                        .status(Attempt.Status.FAILED)
                        .build()
                )
                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                .recordType("webhook_delivery")
                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                .status(WebhookDelivery.Status.DELIVERED)
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .webhook(
                    WebhookDelivery.Webhook.builder()
                        .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                        .eventType("call_initiated")
                        .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                        .payload(
                            WebhookDelivery.Webhook.Payload.builder()
                                .putAdditionalProperty("useful", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType(WebhookDelivery.Webhook.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedWebhookDelivery =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDelivery),
                jacksonTypeRef<WebhookDelivery>(),
            )

        assertThat(roundtrippedWebhookDelivery).isEqualTo(webhookDelivery)
    }
}
