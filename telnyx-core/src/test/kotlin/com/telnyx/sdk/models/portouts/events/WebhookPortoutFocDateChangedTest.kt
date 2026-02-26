// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookPortoutFocDateChangedTest {

    @Test
    fun create() {
        val webhookPortoutFocDateChanged =
            WebhookPortoutFocDateChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutFocDateChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutFocDateChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutFocDateChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .focDate(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .userId("0e19c89e-f0ce-458a-a36c-3c60bc2014b1")
                        .build()
                )
                .payloadStatus(WebhookPortoutFocDateChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(webhookPortoutFocDateChanged.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(webhookPortoutFocDateChanged.availableNotificationMethods().getOrNull())
            .containsExactly(WebhookPortoutFocDateChanged.AvailableNotificationMethod.EMAIL)
        assertThat(webhookPortoutFocDateChanged.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(webhookPortoutFocDateChanged.eventType())
            .contains(WebhookPortoutFocDateChanged.EventType.PORTOUT_STATUS_CHANGED)
        assertThat(webhookPortoutFocDateChanged.payload())
            .contains(
                WebhookPortoutFocDateChanged.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .focDate(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .userId("0e19c89e-f0ce-458a-a36c-3c60bc2014b1")
                    .build()
            )
        assertThat(webhookPortoutFocDateChanged.payloadStatus())
            .contains(WebhookPortoutFocDateChanged.PayloadStatus.CREATED)
        assertThat(webhookPortoutFocDateChanged.portoutId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(webhookPortoutFocDateChanged.recordType()).contains("portout_event")
        assertThat(webhookPortoutFocDateChanged.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookPortoutFocDateChanged =
            WebhookPortoutFocDateChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutFocDateChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutFocDateChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutFocDateChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .focDate(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .userId("0e19c89e-f0ce-458a-a36c-3c60bc2014b1")
                        .build()
                )
                .payloadStatus(WebhookPortoutFocDateChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedWebhookPortoutFocDateChanged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookPortoutFocDateChanged),
                jacksonTypeRef<WebhookPortoutFocDateChanged>(),
            )

        assertThat(roundtrippedWebhookPortoutFocDateChanged).isEqualTo(webhookPortoutFocDateChanged)
    }
}
