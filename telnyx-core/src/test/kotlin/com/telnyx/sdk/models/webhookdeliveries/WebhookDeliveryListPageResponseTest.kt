// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhookdeliveries

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.storage.buckets.usage.PaginationMetaSimple
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookDeliveryListPageResponseTest {

    @Test
    fun create() {
        val webhookDeliveryListPageResponse =
            WebhookDeliveryListPageResponse.builder()
                .addData(
                    WebhookDeliveryListResponse.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .addAttempt(
                            WebhookDeliveryListResponse.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                                .http(
                                    WebhookDeliveryListResponse.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryListResponse.Attempt.Http.Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://fallback.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryListResponse.Attempt.Http.Response
                                                .builder()
                                                .body("All good.")
                                                .addHeader(listOf("string"))
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
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                                .http(
                                    WebhookDeliveryListResponse.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryListResponse.Attempt.Http.Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://typo.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryListResponse.Attempt.Http.Response
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
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(webhookDeliveryListPageResponse.data().getOrNull())
            .containsExactly(
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
                                            .addHeader(listOf("string"))
                                            .url("https://fallback.example.com/webhooks")
                                            .build()
                                    )
                                    .response(
                                        WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                            .body("All good.")
                                            .addHeader(listOf("string"))
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
                            .addError(0L)
                            .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                            .http(
                                WebhookDeliveryListResponse.Attempt.Http.builder()
                                    .request(
                                        WebhookDeliveryListResponse.Attempt.Http.Request.builder()
                                            .addHeader(listOf("string"))
                                            .url("https://typo.example.com/webhooks")
                                            .build()
                                    )
                                    .response(
                                        WebhookDeliveryListResponse.Attempt.Http.Response.builder()
                                            .body("Oops. Not found.")
                                            .addHeader(listOf("string"))
                                            .addHeader(listOf("string"))
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
            )
        assertThat(webhookDeliveryListPageResponse.meta())
            .contains(
                PaginationMetaSimple.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookDeliveryListPageResponse =
            WebhookDeliveryListPageResponse.builder()
                .addData(
                    WebhookDeliveryListResponse.builder()
                        .id("f5586561-8ff0-4291-a0ac-84fe544797bd")
                        .addAttempt(
                            WebhookDeliveryListResponse.Attempt.builder()
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.595Z"))
                                .http(
                                    WebhookDeliveryListResponse.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryListResponse.Attempt.Http.Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://fallback.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryListResponse.Attempt.Http.Response
                                                .builder()
                                                .body("All good.")
                                                .addHeader(listOf("string"))
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
                                .addError(0L)
                                .finishedAt(OffsetDateTime.parse("2020-08-10T14:00:05.360Z"))
                                .http(
                                    WebhookDeliveryListResponse.Attempt.Http.builder()
                                        .request(
                                            WebhookDeliveryListResponse.Attempt.Http.Request
                                                .builder()
                                                .addHeader(listOf("string"))
                                                .url("https://typo.example.com/webhooks")
                                                .build()
                                        )
                                        .response(
                                            WebhookDeliveryListResponse.Attempt.Http.Response
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
                )
                .meta(
                    PaginationMetaSimple.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedWebhookDeliveryListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookDeliveryListPageResponse),
                jacksonTypeRef<WebhookDeliveryListPageResponse>(),
            )

        assertThat(roundtrippedWebhookDeliveryListPageResponse)
            .isEqualTo(webhookDeliveryListPageResponse)
    }
}
