// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emaildomains.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailWebhookTest {

    @Test
    fun create() {
        val emailWebhook =
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

        assertThat(emailWebhook.id()).isEqualTo("123e4567-e89b-12d3-a456-426614174003")
        assertThat(emailWebhook.createdAt()).isEqualTo(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
        assertThat(emailWebhook.domainId()).isEqualTo("123e4567-e89b-12d3-a456-426614174000")
        assertThat(emailWebhook.events())
            .containsExactly(
                EmailWebhookEvent.EMAIL_SENT,
                EmailWebhookEvent.EMAIL_DELIVERED,
                EmailWebhookEvent.EMAIL_BOUNCED,
            )
        assertThat(emailWebhook.recordType()).isEqualTo(EmailWebhook.RecordType.EMAIL_WEBHOOK)
        assertThat(emailWebhook.updatedAt()).isEqualTo(OffsetDateTime.parse("2026-06-18T12:00:00Z"))
        assertThat(emailWebhook.url()).isEqualTo("https://example.com/webhooks/email")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailWebhook =
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

        val roundtrippedEmailWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailWebhook),
                jacksonTypeRef<EmailWebhook>(),
            )

        assertThat(roundtrippedEmailWebhook).isEqualTo(emailWebhook)
    }
}
