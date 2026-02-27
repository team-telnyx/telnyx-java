// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventSplitEventTest {

    @Test
    fun create() {
        val portingEventSplitEvent =
            PortingEventSplitEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventSplitEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventSplitEvent.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventSplitEvent.Payload.builder()
                        .from(
                            PortingEventSplitEvent.Payload.From.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .addPortingPhoneNumber(
                            PortingEventSplitEvent.Payload.PortingPhoneNumber.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .to(
                            PortingEventSplitEvent.Payload.To.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .build()
                )
                .payloadStatus(PortingEventSplitEvent.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingEventSplitEvent.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventSplitEvent.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventSplitEvent.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventSplitEvent.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingEventSplitEvent.eventType())
            .contains(PortingEventSplitEvent.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventSplitEvent.payload())
            .contains(
                PortingEventSplitEvent.Payload.builder()
                    .from(
                        PortingEventSplitEvent.Payload.From.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .addPortingPhoneNumber(
                        PortingEventSplitEvent.Payload.PortingPhoneNumber.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .to(
                        PortingEventSplitEvent.Payload.To.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .build()
            )
        assertThat(portingEventSplitEvent.payloadStatus())
            .contains(PortingEventSplitEvent.PayloadStatus.CREATED)
        assertThat(portingEventSplitEvent.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(portingEventSplitEvent.recordType()).contains("porting_event")
        assertThat(portingEventSplitEvent.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingEventSplitEvent =
            PortingEventSplitEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventSplitEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventSplitEvent.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventSplitEvent.Payload.builder()
                        .from(
                            PortingEventSplitEvent.Payload.From.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .addPortingPhoneNumber(
                            PortingEventSplitEvent.Payload.PortingPhoneNumber.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .to(
                            PortingEventSplitEvent.Payload.To.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .build()
                )
                .payloadStatus(PortingEventSplitEvent.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingEventSplitEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventSplitEvent),
                jacksonTypeRef<PortingEventSplitEvent>(),
            )

        assertThat(roundtrippedPortingEventSplitEvent).isEqualTo(portingEventSplitEvent)
    }
}
