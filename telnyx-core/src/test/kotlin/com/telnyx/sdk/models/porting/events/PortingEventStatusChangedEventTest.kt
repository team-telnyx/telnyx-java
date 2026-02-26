// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.PortingOrderStatus
import com.telnyx.sdk.models.PortingOrdersExceptionType
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventStatusChangedEventTest {

    @Test
    fun create() {
        val portingEventStatusChangedEvent =
            PortingEventStatusChangedEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventStatusChangedEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventStatusChangedEvent.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventStatusChangedEvent.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                                .build()
                        )
                        .supportKey("sr_b1a2c3")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .payloadStatus(PortingEventStatusChangedEvent.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingEventStatusChangedEvent.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventStatusChangedEvent.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventStatusChangedEvent.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventStatusChangedEvent.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingEventStatusChangedEvent.eventType())
            .contains(PortingEventStatusChangedEvent.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventStatusChangedEvent.payload())
            .contains(
                PortingEventStatusChangedEvent.Payload.builder()
                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                    .customerReference("my-ref-001")
                    .status(
                        PortingOrderStatus.builder()
                            .addDetail(
                                PortingOrdersExceptionType.builder()
                                    .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                    .description("Entity name does not match that on the CSR")
                                    .build()
                            )
                            .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                            .build()
                    )
                    .supportKey("sr_b1a2c3")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                    .webhookUrl("https://example.com/webhook")
                    .build()
            )
        assertThat(portingEventStatusChangedEvent.payloadStatus())
            .contains(PortingEventStatusChangedEvent.PayloadStatus.CREATED)
        assertThat(portingEventStatusChangedEvent.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(portingEventStatusChangedEvent.recordType()).contains("porting_event")
        assertThat(portingEventStatusChangedEvent.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingEventStatusChangedEvent =
            PortingEventStatusChangedEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventStatusChangedEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventStatusChangedEvent.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventStatusChangedEvent.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .status(
                            PortingOrderStatus.builder()
                                .addDetail(
                                    PortingOrdersExceptionType.builder()
                                        .code(PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH)
                                        .description("Entity name does not match that on the CSR")
                                        .build()
                                )
                                .value(PortingOrderStatus.PortingOrderStatusValue.PORTED)
                                .build()
                        )
                        .supportKey("sr_b1a2c3")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .payloadStatus(PortingEventStatusChangedEvent.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingEventStatusChangedEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventStatusChangedEvent),
                jacksonTypeRef<PortingEventStatusChangedEvent>(),
            )

        assertThat(roundtrippedPortingEventStatusChangedEvent)
            .isEqualTo(portingEventStatusChangedEvent)
    }
}
