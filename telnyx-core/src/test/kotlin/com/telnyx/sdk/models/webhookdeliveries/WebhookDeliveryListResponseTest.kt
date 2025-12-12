// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryListResponseTest {

    @Test
    fun create() {
        val webhookDeliveryListResponse =
            WebhookDeliveryListResponse.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .addAttempt(
                    WebhookDeliveryListResponse.Attempt.builder()
                        .addError(0L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .http(
                            WebhookDeliveryListResponse.Attempt.Http.builder()
                                .request(
                                    WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://fallback.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                        .body("All good.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .status(200L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                        .status(WebhookDeliveryListResponse.Attempt.Status.DELIVERED)
                        .build()
                )
                .addAttempt(
                    WebhookDeliveryListResponse.Attempt.builder()
                        .addError(75499L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                        .http(
                            WebhookDeliveryListResponse.Attempt.Http.builder()
                                .request(
                                    WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://typo.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                        .body("Oops. Not found.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .addHeader(listOf("Pragma", "no-cache"))
                                        .status(404L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                        .status(WebhookDeliveryListResponse.Attempt.Status.FAILED)
                        .build()
                )
                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                .recordType("webhook_delivery")
                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                .status(WebhookDeliveryListResponse.Status.DELIVERED)
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .webhook(
                    WebhookDeliveryListResponse.Webhook.builder()
                        .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                        .eventType("call_initiated")
                        .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                        .payload(
                            WebhookDeliveryListResponse.Webhook.Payload.builder()
                                .putAdditionalProperty("useful", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType(WebhookDeliveryListResponse.Webhook.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(webhookDeliveryListResponse.id())
            .contains("f5586561-8ff0-4291-a0ac-84fe544797bd")
        assertThat(webhookDeliveryListResponse.attempts().getOrNull())
            .containsExactly(
                WebhookDeliveryListResponse.Attempt.builder()
                    .addError(0L)
                    .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                    .http(
                        WebhookDeliveryListResponse.Attempt.Http.builder()
                            .request(
                                WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                    .addHeader(listOf("Accept", "*/*"))
                                    .url("https://fallback.example.com/webhooks")
                                    .build()
                            )
                            .response(
                                WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                    .body("All good.")
                                    .addHeader(listOf("Content-Type", "text/html"))
                                    .status(200L)
                                    .build()
                            )
                            .build()
                    )
                    .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                    .status(WebhookDeliveryListResponse.Attempt.Status.DELIVERED)
                    .build(),
                WebhookDeliveryListResponse.Attempt.builder()
                    .addError(75499L)
                    .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                    .http(
                        WebhookDeliveryListResponse.Attempt.Http.builder()
                            .request(
                                WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                    .addHeader(listOf("Accept", "*/*"))
                                    .url("https://typo.example.com/webhooks")
                                    .build()
                            )
                            .response(
                                WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                    .body("Oops. Not found.")
                                    .addHeader(listOf("Content-Type", "text/html"))
                                    .addHeader(listOf("Pragma", "no-cache"))
                                    .status(404L)
                                    .build()
                            )
                            .build()
                    )
                    .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                    .status(WebhookDeliveryListResponse.Attempt.Status.FAILED)
                    .build(),
            )
        assertThat(webhookDeliveryListResponse.finishedAt())
            .contains(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
        assertThat(webhookDeliveryListResponse.recordType()).contains("webhook_delivery")
        assertThat(webhookDeliveryListResponse.startedAt())
            .contains(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
        assertThat(webhookDeliveryListResponse.status())
            .contains(WebhookDeliveryListResponse.Status.DELIVERED)
        assertThat(webhookDeliveryListResponse.userId())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(webhookDeliveryListResponse.webhook())
            .contains(
                WebhookDeliveryListResponse.Webhook.builder()
                    .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                    .eventType("call_initiated")
                    .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                    .payload(
                        WebhookDeliveryListResponse.Webhook.Payload.builder()
                            .putAdditionalProperty("useful", JsonValue.from("bar"))
                            .build()
                    )
                    .recordType(WebhookDeliveryListResponse.Webhook.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeliveryListResponse =
            WebhookDeliveryListResponse.builder()
                .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                .addAttempt(
                    WebhookDeliveryListResponse.Attempt.builder()
                        .addError(0L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .http(
                            WebhookDeliveryListResponse.Attempt.Http.builder()
                                .request(
                                    WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://fallback.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                        .body("All good.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .status(200L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                        .status(WebhookDeliveryListResponse.Attempt.Status.DELIVERED)
                        .build()
                )
                .addAttempt(
                    WebhookDeliveryListResponse.Attempt.builder()
                        .addError(75499L)
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                        .http(
                            WebhookDeliveryListResponse.Attempt.Http.builder()
                                .request(
                                    WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                        .addHeader(listOf("Accept", "*/*"))
                                        .url("https://typo.example.com/webhooks")
                                        .build()
                                )
                                .response(
                                    WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                        .body("Oops. Not found.")
                                        .addHeader(listOf("Content-Type", "text/html"))
                                        .addHeader(listOf("Pragma", "no-cache"))
                                        .status(404L)
                                        .build()
                                )
                                .build()
                        )
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                        .status(WebhookDeliveryListResponse.Attempt.Status.FAILED)
                        .build()
                )
                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                .recordType("webhook_delivery")
                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                .status(WebhookDeliveryListResponse.Status.DELIVERED)
                .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .webhook(
                    WebhookDeliveryListResponse.Webhook.builder()
                        .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                        .eventType("call_initiated")
                        .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                        .payload(
                            WebhookDeliveryListResponse.Webhook.Payload.builder()
                                .putAdditionalProperty("useful", JsonValue.from("bar"))
                                .build()
                        )
                        .recordType(WebhookDeliveryListResponse.Webhook.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedWebhookDeliveryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeliveryListResponse),
                jacksonTypeRef<WebhookDeliveryListResponse>(),
            )

        assertThat(roundtrippedWebhookDeliveryListResponse).isEqualTo(webhookDeliveryListResponse)
    }
}
