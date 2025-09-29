// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventRetrieveResponseTest {

    @Test
    fun create() {
        val eventRetrieveResponse =
            EventRetrieveResponse.builder()
                .data(
                    EventRetrieveResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.AvailableNotificationMethod.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .eventType(EventRetrieveResponse.Data.EventType.PORTING_ORDER_DELETED)
                        .payload(
                            EventRetrieveResponse.Data.Payload.WebhookPortingOrderDeletedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .customerReference("my-ref-001")
                                .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                        .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("porting_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .build()

        assertThat(eventRetrieveResponse.data())
            .contains(
                EventRetrieveResponse.Data.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        EventRetrieveResponse.Data.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(EventRetrieveResponse.Data.EventType.PORTING_ORDER_DELETED)
                    .payload(
                        EventRetrieveResponse.Data.Payload.WebhookPortingOrderDeletedPayload
                            .builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .customerReference("my-ref-001")
                            .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .build()
                    )
                    .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                    .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("porting_event")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventRetrieveResponse =
            EventRetrieveResponse.builder()
                .data(
                    EventRetrieveResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.AvailableNotificationMethod.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .eventType(EventRetrieveResponse.Data.EventType.PORTING_ORDER_DELETED)
                        .payload(
                            EventRetrieveResponse.Data.Payload.WebhookPortingOrderDeletedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .customerReference("my-ref-001")
                                .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .build()
                        )
                        .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                        .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("porting_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
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
