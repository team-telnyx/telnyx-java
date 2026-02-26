// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventDeletedPayloadTest {

    @Test
    fun create() {
        val portingEventDeletedPayload =
            PortingEventDeletedPayload.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventDeletedPayload.AvailableNotificationMethod.EMAIL
                )
                .eventType(PortingEventDeletedPayload.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventDeletedPayload.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .customerReference("my-ref-001")
                        .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .payloadStatus(PortingEventDeletedPayload.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .build()

        assertThat(portingEventDeletedPayload.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventDeletedPayload.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventDeletedPayload.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventDeletedPayload.eventType())
            .contains(PortingEventDeletedPayload.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventDeletedPayload.payload())
            .contains(
                PortingEventDeletedPayload.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .customerReference("my-ref-001")
                    .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .recordType("porting_event")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
        assertThat(portingEventDeletedPayload.payloadStatus())
            .contains(PortingEventDeletedPayload.PayloadStatus.CREATED)
        assertThat(portingEventDeletedPayload.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingEventDeletedPayload =
            PortingEventDeletedPayload.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventDeletedPayload.AvailableNotificationMethod.EMAIL
                )
                .eventType(PortingEventDeletedPayload.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventDeletedPayload.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .customerReference("my-ref-001")
                        .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .recordType("porting_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .payloadStatus(PortingEventDeletedPayload.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .build()

        val roundtrippedPortingEventDeletedPayload =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventDeletedPayload),
                jacksonTypeRef<PortingEventDeletedPayload>(),
            )

        assertThat(roundtrippedPortingEventDeletedPayload).isEqualTo(portingEventDeletedPayload)
    }
}
