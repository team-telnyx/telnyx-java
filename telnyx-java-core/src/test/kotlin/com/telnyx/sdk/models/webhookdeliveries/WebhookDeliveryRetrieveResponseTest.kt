// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryRetrieveResponseTest {

    @Test
    fun create() {
        val webhookDeliveryRetrieveResponse =
            WebhookDeliveryRetrieveResponse.builder()
                .data(
                    WebhookDeliveryRetrieveResponse.Data.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .addAttempt(
                            WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                                .http(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://fallback.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Response
                                                .builder()
                                                .body("All good.")
                                                .addHeader(listOf("string"))
                                                .status(200L)
                                                .build()
                                        )
                                        .build()
                                )
                                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                                .status(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Status.DELIVERED
                                )
                                .build()
                        )
                        .addAttempt(
                            WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                                .http(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://typo.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Response
                                                .builder()
                                                .body("Oops. Not found.")
                                                .addHeader(listOf("string"))
                                                .addHeader(listOf("string"))
                                                .status(404L)
                                                .build()
                                        )
                                        .build()
                                )
                                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                                .status(WebhookDeliveryRetrieveResponse.Data.Attempt.Status.FAILED)
                                .build()
                        )
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .recordType("webhook_delivery")
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                        .status(WebhookDeliveryRetrieveResponse.Data.Status.DELIVERED)
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .webhook(
                            WebhookDeliveryRetrieveResponse.Data.Webhook.builder()
                                .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                                .eventType("call_initiated")
                                .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                                .payload(JsonValue.from(mapOf("useful" to "information")))
                                .recordType(
                                    WebhookDeliveryRetrieveResponse.Data.Webhook.RecordType.EVENT
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        assertThat(webhookDeliveryRetrieveResponse.data())
            .contains(
                WebhookDeliveryRetrieveResponse.Data.builder()
                    .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                    .addAttempt(
                        WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                            .addError(0L)
                            .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                            .http(
                                WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                    .request(
                                        WebhookDeliveryRetrieveResponse.Data.Attempt.Http.Request
                                            .builder()
                                            .addHeader(listOf("string"))
                                            .url("https://fallback.example.com/webhooks")
                                            .build()
                                    )
                                    .response(
                                        WebhookDeliveryRetrieveResponse.Data.Attempt.Http.Response
                                            .builder()
                                            .body("All good.")
                                            .addHeader(listOf("string"))
                                            .status(200L)
                                            .build()
                                    )
                                    .build()
                            )
                            .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                            .status(WebhookDeliveryRetrieveResponse.Data.Attempt.Status.DELIVERED)
                            .build()
                    )
                    .addAttempt(
                        WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                            .addError(0L)
                            .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                            .http(
                                WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                    .request(
                                        WebhookDeliveryRetrieveResponse.Data.Attempt.Http.Request
                                            .builder()
                                            .addHeader(listOf("string"))
                                            .url("https://typo.example.com/webhooks")
                                            .build()
                                    )
                                    .response(
                                        WebhookDeliveryRetrieveResponse.Data.Attempt.Http.Response
                                            .builder()
                                            .body("Oops. Not found.")
                                            .addHeader(listOf("string"))
                                            .addHeader(listOf("string"))
                                            .status(404L)
                                            .build()
                                    )
                                    .build()
                            )
                            .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                            .status(WebhookDeliveryRetrieveResponse.Data.Attempt.Status.FAILED)
                            .build()
                    )
                    .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                    .recordType("webhook_delivery")
                    .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                    .status(WebhookDeliveryRetrieveResponse.Data.Status.DELIVERED)
                    .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .webhook(
                        WebhookDeliveryRetrieveResponse.Data.Webhook.builder()
                            .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                            .eventType("call_initiated")
                            .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                            .payload(JsonValue.from(mapOf("useful" to "information")))
                            .recordType(
                                WebhookDeliveryRetrieveResponse.Data.Webhook.RecordType.EVENT
                            )
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeliveryRetrieveResponse =
            WebhookDeliveryRetrieveResponse.builder()
                .data(
                    WebhookDeliveryRetrieveResponse.Data.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .addAttempt(
                            WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                                .http(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://fallback.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Response
                                                .builder()
                                                .body("All good.")
                                                .addHeader(listOf("string"))
                                                .status(200L)
                                                .build()
                                        )
                                        .build()
                                )
                                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.364Z"))
                                .status(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Status.DELIVERED
                                )
                                .build()
                        )
                        .addAttempt(
                            WebhookDeliveryRetrieveResponse.Data.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                                .http(
                                    WebhookDeliveryRetrieveResponse.Data.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://typo.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryRetrieveResponse.Data.Attempt.Http
                                                .Response
                                                .builder()
                                                .body("Oops. Not found.")
                                                .addHeader(listOf("string"))
                                                .addHeader(listOf("string"))
                                                .status(404L)
                                                .build()
                                        )
                                        .build()
                                )
                                .startedAt(OffsetDateTime.parse("2020-08-10T14:00:05.004Z"))
                                .status(WebhookDeliveryRetrieveResponse.Data.Attempt.Status.FAILED)
                                .build()
                        )
                        .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                        .recordType("webhook_delivery")
                        .startedAt(OffsetDateTime.parse("2020-08-10T14:00:00.000Z"))
                        .status(WebhookDeliveryRetrieveResponse.Data.Status.DELIVERED)
                        .userId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .webhook(
                            WebhookDeliveryRetrieveResponse.Data.Webhook.builder()
                                .id("C9C0797E-901D-4349-A33C-C2C8F31A92C2")
                                .eventType("call_initiated")
                                .occurredAt(OffsetDateTime.parse("2020-08-10T13:02:01.000Z"))
                                .payload(JsonValue.from(mapOf("useful" to "information")))
                                .recordType(
                                    WebhookDeliveryRetrieveResponse.Data.Webhook.RecordType.EVENT
                                )
                                .build()
                        )
                        .build()
                )
                .build()

        val roundtrippedWebhookDeliveryRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeliveryRetrieveResponse),
                jacksonTypeRef<WebhookDeliveryRetrieveResponse>(),
            )

        assertThat(roundtrippedWebhookDeliveryRetrieveResponse)
            .isEqualTo(webhookDeliveryRetrieveResponse)
    }
}
