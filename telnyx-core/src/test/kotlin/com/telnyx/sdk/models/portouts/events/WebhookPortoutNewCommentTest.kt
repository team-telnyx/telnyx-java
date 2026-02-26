// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookPortoutNewCommentTest {

    @Test
    fun create() {
        val webhookPortoutNewComment =
            WebhookPortoutNewComment.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutNewComment.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutNewComment.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutNewComment.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .comment("This is a comment.")
                        .portoutId("d26109e5-0605-4671-a235-d3c649cc8406")
                        .userId("1c45c968-c2e0-4559-b1dd-db073962fc61")
                        .build()
                )
                .payloadStatus(WebhookPortoutNewComment.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(webhookPortoutNewComment.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(webhookPortoutNewComment.availableNotificationMethods().getOrNull())
            .containsExactly(WebhookPortoutNewComment.AvailableNotificationMethod.EMAIL)
        assertThat(webhookPortoutNewComment.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(webhookPortoutNewComment.eventType())
            .contains(WebhookPortoutNewComment.EventType.PORTOUT_STATUS_CHANGED)
        assertThat(webhookPortoutNewComment.payload())
            .contains(
                WebhookPortoutNewComment.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .comment("This is a comment.")
                    .portoutId("d26109e5-0605-4671-a235-d3c649cc8406")
                    .userId("1c45c968-c2e0-4559-b1dd-db073962fc61")
                    .build()
            )
        assertThat(webhookPortoutNewComment.payloadStatus())
            .contains(WebhookPortoutNewComment.PayloadStatus.CREATED)
        assertThat(webhookPortoutNewComment.portoutId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(webhookPortoutNewComment.recordType()).contains("portout_event")
        assertThat(webhookPortoutNewComment.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookPortoutNewComment =
            WebhookPortoutNewComment.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutNewComment.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutNewComment.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutNewComment.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .comment("This is a comment.")
                        .portoutId("d26109e5-0605-4671-a235-d3c649cc8406")
                        .userId("1c45c968-c2e0-4559-b1dd-db073962fc61")
                        .build()
                )
                .payloadStatus(WebhookPortoutNewComment.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedWebhookPortoutNewComment =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookPortoutNewComment),
                jacksonTypeRef<WebhookPortoutNewComment>(),
            )

        assertThat(roundtrippedWebhookPortoutNewComment).isEqualTo(webhookPortoutNewComment)
    }
}
