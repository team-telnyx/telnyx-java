// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.porting.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingEventNewCommentEventTest {

    @Test
    fun create() {
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

        assertThat(portingEventNewCommentEvent.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingEventNewCommentEvent.availableNotificationMethods().getOrNull())
            .containsExactly(PortingEventNewCommentEvent.AvailableNotificationMethod.EMAIL)
        assertThat(portingEventNewCommentEvent.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingEventNewCommentEvent.eventType())
            .contains(PortingEventNewCommentEvent.EventType.PORTING_ORDER_DELETED)
        assertThat(portingEventNewCommentEvent.payload())
            .contains(
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
        assertThat(portingEventNewCommentEvent.payloadStatus())
            .contains(PortingEventNewCommentEvent.PayloadStatus.CREATED)
        assertThat(portingEventNewCommentEvent.portingOrderId())
            .contains("9471c873-e3eb-4ca1-957d-f9a451334d52")
        assertThat(portingEventNewCommentEvent.recordType()).contains("porting_event")
        assertThat(portingEventNewCommentEvent.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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

        val roundtrippedPortingEventNewCommentEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingEventNewCommentEvent),
                jacksonTypeRef<PortingEventNewCommentEvent>(),
            )

        assertThat(roundtrippedPortingEventNewCommentEvent).isEqualTo(portingEventNewCommentEvent)
    }
}
