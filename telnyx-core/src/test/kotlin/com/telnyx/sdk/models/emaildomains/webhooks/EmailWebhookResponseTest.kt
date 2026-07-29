// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailWebhookResponseTest {

    @Test
    fun create() {
        val emailWebhookResponse =
            EmailWebhookResponse.builder()
                .data(
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
                .build()

        assertThat(emailWebhookResponse.data())
            .isEqualTo(
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailWebhookResponse =
            EmailWebhookResponse.builder()
                .data(
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
                .build()

        val roundtrippedEmailWebhookResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailWebhookResponse),
                jacksonTypeRef<EmailWebhookResponse>(),
            )

        assertThat(roundtrippedEmailWebhookResponse).isEqualTo(emailWebhookResponse)
    }
}
