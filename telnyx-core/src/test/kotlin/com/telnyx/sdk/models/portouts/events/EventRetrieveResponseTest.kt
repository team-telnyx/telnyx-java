// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

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
                    EventRetrieveResponse.Data.builder()
                        .id("eef3340b-8903-4466-b445-89b697315a3a")
                        .addAvailableNotificationMethod(
                            EventRetrieveResponse.Data.AvailableNotificationMethod.EMAIL
                        )
                        .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                        .eventType(EventRetrieveResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                        .payload(
                            EventRetrieveResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .attemptedPin("1234")
                                .carrierName("Testing Carrier")
                                .addPhoneNumber("+35312345678")
                                .rejectionReason(null)
                                .spid("987H")
                                .status(
                                    EventRetrieveResponse.Data.Payload
                                        .WebhookPortoutStatusChangedPayload
                                        .Status
                                        .AUTHORIZED
                                )
                                .subscriberName("John Doe")
                                .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                        .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("portout_event")
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
                    .eventType(EventRetrieveResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                    .payload(
                        EventRetrieveResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                            .builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .attemptedPin("1234")
                            .carrierName("Testing Carrier")
                            .addPhoneNumber("+35312345678")
                            .rejectionReason(null)
                            .spid("987H")
                            .status(
                                EventRetrieveResponse.Data.Payload
                                    .WebhookPortoutStatusChangedPayload
                                    .Status
                                    .AUTHORIZED
                            )
                            .subscriberName("John Doe")
                            .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                    .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("portout_event")
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
                        .eventType(EventRetrieveResponse.Data.EventType.PORTOUT_STATUS_CHANGED)
                        .payload(
                            EventRetrieveResponse.Data.Payload.WebhookPortoutStatusChangedPayload
                                .builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .attemptedPin("1234")
                                .carrierName("Testing Carrier")
                                .addPhoneNumber("+35312345678")
                                .rejectionReason(null)
                                .spid("987H")
                                .status(
                                    EventRetrieveResponse.Data.Payload
                                        .WebhookPortoutStatusChangedPayload
                                        .Status
                                        .AUTHORIZED
                                )
                                .subscriberName("John Doe")
                                .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .build()
                        )
                        .payloadStatus(EventRetrieveResponse.Data.PayloadStatus.CREATED)
                        .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                        .recordType("portout_event")
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
