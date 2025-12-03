// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(EventListResponse.AvailableNotificationMethod.EMAIL)
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(EventListResponse.EventType.PORTING_ORDER_DELETED)
                .payload(
                    EventListResponse.Payload.WebhookPortingOrderDeletedPayload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .payloadStatus(EventListResponse.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(eventListResponse.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(eventListResponse.availableNotificationMethods().getOrNull())
            .containsExactly(EventListResponse.AvailableNotificationMethod.EMAIL)
        assertThat(eventListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(eventListResponse.eventType())
            .contains(EventListResponse.EventType.PORTING_ORDER_DELETED)
        assertThat(eventListResponse.payload())
            .contains(
                EventListResponse.Payload.ofWebhookPortingOrderDeleted(
                    EventListResponse.Payload.WebhookPortingOrderDeletedPayload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
            )
        assertThat(eventListResponse.payloadStatus())
            .contains(EventListResponse.PayloadStatus.CREATED)
        assertThat(eventListResponse.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(eventListResponse.recordType()).contains("porting_event")
        assertThat(eventListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(EventListResponse.AvailableNotificationMethod.EMAIL)
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(EventListResponse.EventType.PORTING_ORDER_DELETED)
                .payload(
                    EventListResponse.Payload.WebhookPortingOrderDeletedPayload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .customerReference("my-ref-001")
                        .deletedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .build()
                )
                .payloadStatus(EventListResponse.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }
}
