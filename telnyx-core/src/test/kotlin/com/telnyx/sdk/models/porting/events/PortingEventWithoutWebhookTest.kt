// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventWithoutWebhookTest {

    @Test
    fun create() {
        val portingEventWithoutWebhook =
            PortingEventWithoutWebhook.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventWithoutWebhook.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventWithoutWebhook.EventType.PORTING_ORDER_DELETED)
                .payload(null)
                .payloadStatus(PortingEventWithoutWebhook.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingEventWithoutWebhook.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventWithoutWebhook.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventWithoutWebhook.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventWithoutWebhook.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingEventWithoutWebhook.eventType())
            .contains(PortingEventWithoutWebhook.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventWithoutWebhook.payload()).isEmpty
        assertThat(portingEventWithoutWebhook.payloadStatus())
            .contains(PortingEventWithoutWebhook.PayloadStatus.CREATED)
        assertThat(portingEventWithoutWebhook.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(portingEventWithoutWebhook.recordType()).contains("porting_event")
        assertThat(portingEventWithoutWebhook.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingEventWithoutWebhook =
            PortingEventWithoutWebhook.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventWithoutWebhook.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventWithoutWebhook.EventType.PORTING_ORDER_DELETED)
                .payload(null)
                .payloadStatus(PortingEventWithoutWebhook.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingEventWithoutWebhook =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventWithoutWebhook),
                jacksonTypeRef<PortingEventWithoutWebhook>(),
            )

        assertThat(roundtrippedPortingEventWithoutWebhook).isEqualTo(portingEventWithoutWebhook)
    }
}
