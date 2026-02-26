// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventMessagingChangedPayloadTest {

    @Test
    fun create() {
        val portingEventMessagingChangedPayload =
            PortingEventMessagingChangedPayload.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventMessagingChangedPayload.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventMessagingChangedPayload.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventMessagingChangedPayload.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .messaging(
                            PortingEventMessagingChangedPayload.Payload.Messaging.builder()
                                .enableMessaging(true)
                                .messagingCapable(true)
                                .messagingPortCompleted(true)
                                .messagingPortStatus(
                                    PortingEventMessagingChangedPayload.Payload.Messaging
                                        .MessagingPortStatus
                                        .PORTED
                                )
                                .build()
                        )
                        .supportKey("sr_b1a2c3")
                        .build()
                )
                .payloadStatus(PortingEventMessagingChangedPayload.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingEventMessagingChangedPayload.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventMessagingChangedPayload.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventMessagingChangedPayload.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventMessagingChangedPayload.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingEventMessagingChangedPayload.eventType())
            .contains(PortingEventMessagingChangedPayload.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventMessagingChangedPayload.payload())
            .contains(
                PortingEventMessagingChangedPayload.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .customerReference("my-ref-001")
                    .messaging(
                        PortingEventMessagingChangedPayload.Payload.Messaging.builder()
                            .enableMessaging(true)
                            .messagingCapable(true)
                            .messagingPortCompleted(true)
                            .messagingPortStatus(
                                PortingEventMessagingChangedPayload.Payload.Messaging
                                    .MessagingPortStatus
                                    .PORTED
                            )
                            .build()
                    )
                    .supportKey("sr_b1a2c3")
                    .build()
            )
        assertThat(portingEventMessagingChangedPayload.payloadStatus())
            .contains(PortingEventMessagingChangedPayload.PayloadStatus.CREATED)
        assertThat(portingEventMessagingChangedPayload.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(portingEventMessagingChangedPayload.recordType()).contains("porting_event")
        assertThat(portingEventMessagingChangedPayload.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingEventMessagingChangedPayload =
            PortingEventMessagingChangedPayload.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventMessagingChangedPayload.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventMessagingChangedPayload.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventMessagingChangedPayload.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .messaging(
                            PortingEventMessagingChangedPayload.Payload.Messaging.builder()
                                .enableMessaging(true)
                                .messagingCapable(true)
                                .messagingPortCompleted(true)
                                .messagingPortStatus(
                                    PortingEventMessagingChangedPayload.Payload.Messaging
                                        .MessagingPortStatus
                                        .PORTED
                                )
                                .build()
                        )
                        .supportKey("sr_b1a2c3")
                        .build()
                )
                .payloadStatus(PortingEventMessagingChangedPayload.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingEventMessagingChangedPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventMessagingChangedPayload),
                jacksonTypeRef<PortingEventMessagingChangedPayload>(),
            )

        assertThat(roundtrippedPortingEventMessagingChangedPayload)
            .isEqualTo(portingEventMessagingChangedPayload)
    }
}
