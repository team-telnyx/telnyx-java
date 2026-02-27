// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import com.telnyx.sdk.models.PortingOrderStatus
import com.telnyx.sdk.models.PortingOrdersExceptionType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EventListResponseTest {

    @Test
    fun ofPortingEventDeletedPayload() {
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

        val eventListResponse =
            EventListResponse.ofPortingEventDeletedPayload(portingEventDeletedPayload)

        assertThat(eventListResponse.portingEventDeletedPayload())
            .contains(portingEventDeletedPayload)
        assertThat(eventListResponse.portingEventMessagingChangedPayload()).isEmpty
        assertThat(eventListResponse.portingEventStatusChangedEvent()).isEmpty
        assertThat(eventListResponse.portingEventNewCommentEvent()).isEmpty
        assertThat(eventListResponse.portingEventSplitEvent()).isEmpty
        assertThat(eventListResponse.portingEventWithoutWebhook()).isEmpty
    }

    @Test
    fun ofPortingEventDeletedPayloadRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventDeletedPayload(
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
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    @Test
    fun ofPortingEventMessagingChangedPayload() {
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

        val eventListResponse =
            EventListResponse.ofPortingEventMessagingChangedPayload(
                portingEventMessagingChangedPayload
            )

        assertThat(eventListResponse.portingEventDeletedPayload()).isEmpty
        assertThat(eventListResponse.portingEventMessagingChangedPayload())
            .contains(portingEventMessagingChangedPayload)
        assertThat(eventListResponse.portingEventStatusChangedEvent()).isEmpty
        assertThat(eventListResponse.portingEventNewCommentEvent()).isEmpty
        assertThat(eventListResponse.portingEventSplitEvent()).isEmpty
        assertThat(eventListResponse.portingEventWithoutWebhook()).isEmpty
    }

    @Test
    fun ofPortingEventMessagingChangedPayloadRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventMessagingChangedPayload(
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
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    @Test
    fun ofPortingEventStatusChangedEvent() {
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

        val eventListResponse =
            EventListResponse.ofPortingEventStatusChangedEvent(portingEventStatusChangedEvent)

        assertThat(eventListResponse.portingEventDeletedPayload()).isEmpty
        assertThat(eventListResponse.portingEventMessagingChangedPayload()).isEmpty
        assertThat(eventListResponse.portingEventStatusChangedEvent())
            .contains(portingEventStatusChangedEvent)
        assertThat(eventListResponse.portingEventNewCommentEvent()).isEmpty
        assertThat(eventListResponse.portingEventSplitEvent()).isEmpty
        assertThat(eventListResponse.portingEventWithoutWebhook()).isEmpty
    }

    @Test
    fun ofPortingEventStatusChangedEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventStatusChangedEvent(
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
                                            .code(
                                                PortingOrdersExceptionType.Code.ENTITY_NAME_MISMATCH
                                            )
                                            .description(
                                                "Entity name does not match that on the CSR"
                                            )
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
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    @Test
    fun ofPortingEventNewCommentEvent() {
        val portingEventNewCommentEvent =
            PortingEventNewCommentEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventNewCommentEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventNewCommentEvent.EventType.PORTING_ORDER_DELETED)
                .payload(
                    PortingEventNewCommentEvent.Payload.builder()
                        .comment(
                            PortingEventNewCommentEvent.Payload.Comment.builder()
                                .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .body("This is a comment.")
                                .insertedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                .userType(PortingEventNewCommentEvent.Payload.Comment.UserType.USER)
                                .build()
                        )
                        .portingOrderId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .supportKey("sr_b1a2c3")
                        .build()
                )
                .payloadStatus(PortingEventNewCommentEvent.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val eventListResponse =
            EventListResponse.ofPortingEventNewCommentEvent(portingEventNewCommentEvent)

        assertThat(eventListResponse.portingEventDeletedPayload()).isEmpty
        assertThat(eventListResponse.portingEventMessagingChangedPayload()).isEmpty
        assertThat(eventListResponse.portingEventStatusChangedEvent()).isEmpty
        assertThat(eventListResponse.portingEventNewCommentEvent())
            .contains(portingEventNewCommentEvent)
        assertThat(eventListResponse.portingEventSplitEvent()).isEmpty
        assertThat(eventListResponse.portingEventWithoutWebhook()).isEmpty
    }

    @Test
    fun ofPortingEventNewCommentEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventNewCommentEvent(
                PortingEventNewCommentEvent.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventNewCommentEvent.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(PortingEventNewCommentEvent.EventType.PORTING_ORDER_DELETED)
                    .payload(
                        PortingEventNewCommentEvent.Payload.builder()
                            .comment(
                                PortingEventNewCommentEvent.Payload.Comment.builder()
                                    .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                    .body("This is a comment.")
                                    .insertedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                                    .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                                    .userType(
                                        PortingEventNewCommentEvent.Payload.Comment.UserType.USER
                                    )
                                    .build()
                            )
                            .portingOrderId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .supportKey("sr_b1a2c3")
                            .build()
                    )
                    .payloadStatus(PortingEventNewCommentEvent.PayloadStatus.CREATED)
                    .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("porting_event")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    @Test
    fun ofPortingEventSplitEvent() {
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

        val eventListResponse = EventListResponse.ofPortingEventSplitEvent(portingEventSplitEvent)

        assertThat(eventListResponse.portingEventDeletedPayload()).isEmpty
        assertThat(eventListResponse.portingEventMessagingChangedPayload()).isEmpty
        assertThat(eventListResponse.portingEventStatusChangedEvent()).isEmpty
        assertThat(eventListResponse.portingEventNewCommentEvent()).isEmpty
        assertThat(eventListResponse.portingEventSplitEvent()).contains(portingEventSplitEvent)
        assertThat(eventListResponse.portingEventWithoutWebhook()).isEmpty
    }

    @Test
    fun ofPortingEventSplitEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventSplitEvent(
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
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    @Test
    fun ofPortingEventWithoutWebhook() {
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

        val eventListResponse =
            EventListResponse.ofPortingEventWithoutWebhook(portingEventWithoutWebhook)

        assertThat(eventListResponse.portingEventDeletedPayload()).isEmpty
        assertThat(eventListResponse.portingEventMessagingChangedPayload()).isEmpty
        assertThat(eventListResponse.portingEventStatusChangedEvent()).isEmpty
        assertThat(eventListResponse.portingEventNewCommentEvent()).isEmpty
        assertThat(eventListResponse.portingEventSplitEvent()).isEmpty
        assertThat(eventListResponse.portingEventWithoutWebhook())
            .contains(portingEventWithoutWebhook)
    }

    @Test
    fun ofPortingEventWithoutWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofPortingEventWithoutWebhook(
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
            )

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }

    enum class IncompatibleJsonShapeTestCase(val value: JsonValue) {
        BOOLEAN(JsonValue.from(false)),
        STRING(JsonValue.from("invalid")),
        INTEGER(JsonValue.from(-1)),
        FLOAT(JsonValue.from(3.14)),
        ARRAY(JsonValue.from(listOf("invalid", "array"))),
    }

    @ParameterizedTest
    @EnumSource
    fun incompatibleJsonShapeDeserializesToUnknown(testCase: IncompatibleJsonShapeTestCase) {
        val eventListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<EventListResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { eventListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
