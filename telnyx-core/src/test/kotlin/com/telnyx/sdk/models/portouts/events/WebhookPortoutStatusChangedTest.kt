// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WebhookPortoutStatusChangedTest {

    @Test
    fun create() {
        val webhookPortoutStatusChanged =
            WebhookPortoutStatusChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutStatusChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutStatusChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutStatusChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .attemptedPin("1234")
                        .carrierName("Testing Carrier")
                        .addPhoneNumber("+35312345678")
                        .rejectionReason(null)
                        .spid("987H")
                        .status(WebhookPortoutStatusChanged.Payload.Status.AUTHORIZED)
                        .subscriberName("John Doe")
                        .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .build()
                )
                .payloadStatus(WebhookPortoutStatusChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(webhookPortoutStatusChanged.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(webhookPortoutStatusChanged.availableNotificationMethods().getOrNull())
            .containsExactly(WebhookPortoutStatusChanged.AvailableNotificationMethod.EMAIL)
        assertThat(webhookPortoutStatusChanged.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(webhookPortoutStatusChanged.eventType())
            .contains(WebhookPortoutStatusChanged.EventType.PORTOUT_STATUS_CHANGED)
        assertThat(webhookPortoutStatusChanged.payload())
            .contains(
                WebhookPortoutStatusChanged.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .attemptedPin("1234")
                    .carrierName("Testing Carrier")
                    .addPhoneNumber("+35312345678")
                    .rejectionReason(null)
                    .spid("987H")
                    .status(WebhookPortoutStatusChanged.Payload.Status.AUTHORIZED)
                    .subscriberName("John Doe")
                    .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .build()
            )
        assertThat(webhookPortoutStatusChanged.payloadStatus())
            .contains(WebhookPortoutStatusChanged.PayloadStatus.CREATED)
        assertThat(webhookPortoutStatusChanged.portoutId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(webhookPortoutStatusChanged.recordType()).contains("portout_event")
        assertThat(webhookPortoutStatusChanged.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val webhookPortoutStatusChanged =
            WebhookPortoutStatusChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutStatusChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutStatusChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutStatusChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .attemptedPin("1234")
                        .carrierName("Testing Carrier")
                        .addPhoneNumber("+35312345678")
                        .rejectionReason(null)
                        .spid("987H")
                        .status(WebhookPortoutStatusChanged.Payload.Status.AUTHORIZED)
                        .subscriberName("John Doe")
                        .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .build()
                )
                .payloadStatus(WebhookPortoutStatusChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedWebhookPortoutStatusChanged =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(webhookPortoutStatusChanged),
                jacksonTypeRef<WebhookPortoutStatusChanged>(),
            )

        assertThat(roundtrippedWebhookPortoutStatusChanged).isEqualTo(webhookPortoutStatusChanged)
    }
}
