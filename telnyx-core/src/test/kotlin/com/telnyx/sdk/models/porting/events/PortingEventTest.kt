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

internal class PortingEventTest {

    @Test
    fun ofOrderDeleted() {
        val orderDeleted =
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

        val portingEvent = PortingEvent.ofOrderDeleted(orderDeleted)

        assertThat(portingEvent.orderDeleted()).contains(orderDeleted)
        assertThat(portingEvent.orderMessagingChanged()).isEmpty
        assertThat(portingEvent.orderStatusChanged()).isEmpty
        assertThat(portingEvent.orderNewComment()).isEmpty
        assertThat(portingEvent.orderSplit()).isEmpty
        assertThat(portingEvent.withoutWebhook()).isEmpty
    }

    @Test
    fun ofOrderDeletedRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofOrderDeleted(
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

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
    }

    @Test
    fun ofOrderMessagingChanged() {
        val orderMessagingChanged =
            PortingEventMessagingChangedPayload.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventMessagingChangedPayload.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(
                    PortingEventMessagingChangedPayload.EventType.PORTING_ORDER_MESSAGING_CHANGED
                )
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

        val portingEvent = PortingEvent.ofOrderMessagingChanged(orderMessagingChanged)

        assertThat(portingEvent.orderDeleted()).isEmpty
        assertThat(portingEvent.orderMessagingChanged()).contains(orderMessagingChanged)
        assertThat(portingEvent.orderStatusChanged()).isEmpty
        assertThat(portingEvent.orderNewComment()).isEmpty
        assertThat(portingEvent.orderSplit()).isEmpty
        assertThat(portingEvent.withoutWebhook()).isEmpty
    }

    @Test
    fun ofOrderMessagingChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofOrderMessagingChanged(
                PortingEventMessagingChangedPayload.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventMessagingChangedPayload.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(
                        PortingEventMessagingChangedPayload.EventType
                            .PORTING_ORDER_MESSAGING_CHANGED
                    )
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

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
    }

    @Test
    fun ofOrderStatusChanged() {
        val orderStatusChanged =
            PortingEventStatusChangedEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventStatusChangedEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventStatusChangedEvent.EventType.PORTING_ORDER_STATUS_CHANGED)
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

        val portingEvent = PortingEvent.ofOrderStatusChanged(orderStatusChanged)

        assertThat(portingEvent.orderDeleted()).isEmpty
        assertThat(portingEvent.orderMessagingChanged()).isEmpty
        assertThat(portingEvent.orderStatusChanged()).contains(orderStatusChanged)
        assertThat(portingEvent.orderNewComment()).isEmpty
        assertThat(portingEvent.orderSplit()).isEmpty
        assertThat(portingEvent.withoutWebhook()).isEmpty
    }

    @Test
    fun ofOrderStatusChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofOrderStatusChanged(
                PortingEventStatusChangedEvent.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventStatusChangedEvent.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(
                        PortingEventStatusChangedEvent.EventType.PORTING_ORDER_STATUS_CHANGED
                    )
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

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
    }

    @Test
    fun ofOrderNewComment() {
        val orderNewComment =
            PortingEventNewCommentEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventNewCommentEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventNewCommentEvent.EventType.PORTING_ORDER_NEW_COMMENT)
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

        val portingEvent = PortingEvent.ofOrderNewComment(orderNewComment)

        assertThat(portingEvent.orderDeleted()).isEmpty
        assertThat(portingEvent.orderMessagingChanged()).isEmpty
        assertThat(portingEvent.orderStatusChanged()).isEmpty
        assertThat(portingEvent.orderNewComment()).contains(orderNewComment)
        assertThat(portingEvent.orderSplit()).isEmpty
        assertThat(portingEvent.withoutWebhook()).isEmpty
    }

    @Test
    fun ofOrderNewCommentRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofOrderNewComment(
                PortingEventNewCommentEvent.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventNewCommentEvent.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(PortingEventNewCommentEvent.EventType.PORTING_ORDER_NEW_COMMENT)
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

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
    }

    @Test
    fun ofOrderSplit() {
        val orderSplit =
            PortingEventSplitEvent.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventSplitEvent.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventSplitEvent.EventType.PORTING_ORDER_SPLIT)
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

        val portingEvent = PortingEvent.ofOrderSplit(orderSplit)

        assertThat(portingEvent.orderDeleted()).isEmpty
        assertThat(portingEvent.orderMessagingChanged()).isEmpty
        assertThat(portingEvent.orderStatusChanged()).isEmpty
        assertThat(portingEvent.orderNewComment()).isEmpty
        assertThat(portingEvent.orderSplit()).contains(orderSplit)
        assertThat(portingEvent.withoutWebhook()).isEmpty
    }

    @Test
    fun ofOrderSplitRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofOrderSplit(
                PortingEventSplitEvent.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventSplitEvent.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(PortingEventSplitEvent.EventType.PORTING_ORDER_SPLIT)
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

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
    }

    @Test
    fun ofWithoutWebhook() {
        val withoutWebhook =
            PortingEventWithoutWebhook.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    PortingEventWithoutWebhook.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(PortingEventWithoutWebhook.EventType.PORTING_ORDER_LOA_UPDATED)
                .payload(null)
                .payloadStatus(PortingEventWithoutWebhook.PayloadStatus.CREATED)
                .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("porting_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val portingEvent = PortingEvent.ofWithoutWebhook(withoutWebhook)

        assertThat(portingEvent.orderDeleted()).isEmpty
        assertThat(portingEvent.orderMessagingChanged()).isEmpty
        assertThat(portingEvent.orderStatusChanged()).isEmpty
        assertThat(portingEvent.orderNewComment()).isEmpty
        assertThat(portingEvent.orderSplit()).isEmpty
        assertThat(portingEvent.withoutWebhook()).contains(withoutWebhook)
    }

    @Test
    fun ofWithoutWebhookRoundtrip() {
        val jsonMapper = jsonMapper()
        val portingEvent =
            PortingEvent.ofWithoutWebhook(
                PortingEventWithoutWebhook.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        PortingEventWithoutWebhook.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(PortingEventWithoutWebhook.EventType.PORTING_ORDER_LOA_UPDATED)
                    .payload(null)
                    .payloadStatus(PortingEventWithoutWebhook.PayloadStatus.CREATED)
                    .portingOrderId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("porting_event")
                    .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .build()
            )

        val roundtrippedPortingEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEvent),
                jacksonTypeRef<PortingEvent>(),
            )

        assertThat(roundtrippedPortingEvent).isEqualTo(portingEvent)
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
        val portingEvent = jsonMapper().convertValue(testCase.value, jacksonTypeRef<PortingEvent>())

        val e = assertThrows<TelnyxInvalidDataException> { portingEvent.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
