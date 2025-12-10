// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventRetrieveResponseTest {

    @Test
    fun create() {
        val eventRetrieveResponse =
            EventRetrieveResponse.builder()
                .data(
                    EventRetrieveResponse.Data.PortingEventDeletedPayload.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload
                                .AvailableNotificationMethod
                                .EMAIL
                        )
                        .eventType(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.EventType
                                .PORTING_ORDER_DELETED
                        )
                        .payload(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.Payload.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .customerReference("my-ref-001")
                                .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .recordType("porting_event")
                                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .build()
                        )
                        .payloadStatus(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.PayloadStatus
                                .CREATED
                        )
                        .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .build()
                )
                .build()

        assertThat(eventRetrieveResponse.data())
            .contains(
                EventRetrieveResponse.Data.ofPortingEventDeletedPayload(
                    EventRetrieveResponse.Data.PortingEventDeletedPayload.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload
                                .AvailableNotificationMethod
                                .EMAIL
                        )
                        .eventType(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.EventType
                                .PORTING_ORDER_DELETED
                        )
                        .payload(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.Payload.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .customerReference("my-ref-001")
                                .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .recordType("porting_event")
                                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .build()
                        )
                        .payloadStatus(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.PayloadStatus
                                .CREATED
                        )
                        .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .build()
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventRetrieveResponse =
            EventRetrieveResponse.builder()
                .data(
                    EventRetrieveResponse.Data.PortingEventDeletedPayload.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload
                                .AvailableNotificationMethod
                                .EMAIL
                        )
                        .eventType(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.EventType
                                .PORTING_ORDER_DELETED
                        )
                        .payload(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.Payload.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .customerReference("my-ref-001")
                                .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .recordType("porting_event")
                                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                                .build()
                        )
                        .payloadStatus(
                            EventRetrieveResponse.Data.PortingEventDeletedPayload.PayloadStatus
                                .CREATED
                        )
                        .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .build()
                )
                .build()

        val roundtrippedEventRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventRetrieveResponse),
                jacksonTypeRef<EventRetrieveResponse>(),
            )

        assertThat(roundtrippedEventRetrieveResponse).isEqualTo(eventRetrieveResponse)
    }
}
