// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookListPageResponseTest {

    @Test
    fun create() {
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
                    EmailWebhook.builder()
                        .id("123e4567-e89b-12d3-a456-426614174003")
                        .createdAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                        .domainId("123e4567-e89b-12d3-a456-426614174000")
                        .events(
                            listOf(
                                EmailWebhookEvent.EMAIL_SENT,
                                EmailWebhookEvent.EMAIL_DELIVERED,
                                EmailWebhookEvent.EMAIL_BOUNCED,
                            )
                        )
                        .recordType(EmailWebhook.RecordType.EMAIL_WEBHOOK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                        .url("https://example.com/webhooks/email")
                        .build()
                )
                .meta(
                    OffsetPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(1L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(webhookListPageResponse.data())
            .containsExactly(
                EmailWebhook.builder()
                    .id("123e4567-e89b-12d3-a456-426614174003")
                    .createdAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                    .domainId("123e4567-e89b-12d3-a456-426614174000")
                    .events(
                        listOf(
                            EmailWebhookEvent.EMAIL_SENT,
                            EmailWebhookEvent.EMAIL_DELIVERED,
                            EmailWebhookEvent.EMAIL_BOUNCED,
                        )
                    )
                    .recordType(EmailWebhook.RecordType.EMAIL_WEBHOOK)
                    .updatedAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                    .url("https://example.com/webhooks/email")
                    .build()
            )
        assertThat(webhookListPageResponse.meta())
            .isEqualTo(
                OffsetPaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(1L)
                    .totalPages(0L)
                    .totalResults(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookListPageResponse =
            WebhookListPageResponse.builder()
                .addData(
                    EmailWebhook.builder()
                        .id("123e4567-e89b-12d3-a456-426614174003")
                        .createdAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                        .domainId("123e4567-e89b-12d3-a456-426614174000")
                        .events(
                            listOf(
                                EmailWebhookEvent.EMAIL_SENT,
                                EmailWebhookEvent.EMAIL_DELIVERED,
                                EmailWebhookEvent.EMAIL_BOUNCED,
                            )
                        )
                        .recordType(EmailWebhook.RecordType.EMAIL_WEBHOOK)
                        .updatedAt(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
                        .url("https://example.com/webhooks/email")
                        .build()
                )
                .meta(
                    OffsetPaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(1L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedWebhookListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookListPageResponse),
                jacksonTypeRef<WebhookListPageResponse>(),
            )

        assertThat(roundtrippedWebhookListPageResponse).isEqualTo(webhookListPageResponse)
    }
}
