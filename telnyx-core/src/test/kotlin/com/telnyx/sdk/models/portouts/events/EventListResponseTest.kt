// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .addData(
                    EventListResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventListResponse.Data.AvailableNotificationMethod.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .eventType(EventListResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                        .payload(
                            EventListResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .attemptedPin("1234")
                                .carrierName("Testing Carrier")
                                .addPhoneNumber("+35312345678")
                                .rejectionReason(null)
                                .spid("987H")
                                .status(
                                    EventListResponse.Data.Payload
                                        .WebhookPortoutStatusChangedPayload
                                        .Status
                                        .AUTHORIZED
                                )
                                .subscriberName("John Doe")
                                .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .payloadStatus(EventListResponse.Data.PayloadStatus.CREATED)
                        .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("portout_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(eventListResponse.data().getOrNull())
            .containsExactly(
                EventListResponse.Data.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        EventListResponse.Data.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(EventListResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                    .payload(
                        EventListResponse.Data.Payload.WebhookPortoutStatusChangedPayload.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .attemptedPin("1234")
                            .carrierName("Testing Carrier")
                            .addPhoneNumber("+35312345678")
                            .rejectionReason(null)
                            .spid("987H")
                            .status(
                                EventListResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                                    .Status
                                    .AUTHORIZED
                            )
                            .subscriberName("John Doe")
                            .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .payloadStatus(EventListResponse.Data.PayloadStatus.CREATED)
                    .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("portout_event")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )
        assertThat(eventListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .addData(
                    EventListResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventListResponse.Data.AvailableNotificationMethod.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .eventType(EventListResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                        .payload(
                            EventListResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .attemptedPin("1234")
                                .carrierName("Testing Carrier")
                                .addPhoneNumber("+35312345678")
                                .rejectionReason(null)
                                .spid("987H")
                                .status(
                                    EventListResponse.Data.Payload
                                        .WebhookPortoutStatusChangedPayload
                                        .Status
                                        .AUTHORIZED
                                )
                                .subscriberName("John Doe")
                                .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .payloadStatus(EventListResponse.Data.PayloadStatus.CREATED)
                        .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("portout_event")
                        .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }
}
