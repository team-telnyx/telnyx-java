// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.errors.TelnyxInvalidDataException
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.EnumSource

internal class EventListResponseTest {

    @Test
    fun ofWebhookPortoutStatusChanged() {
        val webhookPortoutStatusChanged =
            WebhookPortoutStatusChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutStatusChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutStatusChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutStatusChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .attemptedPin("1234")
                        .carrierName("Testing Carrier")
                        .addPhoneNumber("+35312345678")
                        .rejectionReason(null)
                        .spid("987H")
                        .status(WebhookPortoutStatusChanged.Payload.Status.AUTHORIZED)
                        .subscriberName("John Doe")
                        .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .build()
                )
                .payloadStatus(WebhookPortoutStatusChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val eventListResponse =
            EventListResponse.ofWebhookPortoutStatusChanged(webhookPortoutStatusChanged)

        assertThat(eventListResponse.webhookPortoutStatusChanged())
            .contains(webhookPortoutStatusChanged)
        assertThat(eventListResponse.webhookPortoutNewComment()).isEmpty
        assertThat(eventListResponse.webhookPortoutFocDateChanged()).isEmpty
    }

    @Test
    fun ofWebhookPortoutStatusChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofWebhookPortoutStatusChanged(
                WebhookPortoutStatusChanged.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        WebhookPortoutStatusChanged.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(WebhookPortoutStatusChanged.EventType.PORTOUT_STATUS_CHANGED)
                    .payload(
                        WebhookPortoutStatusChanged.Payload.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .attemptedPin("1234")
                            .carrierName("Testing Carrier")
                            .addPhoneNumber("+35312345678")
                            .rejectionReason(null)
                            .spid("987H")
                            .status(WebhookPortoutStatusChanged.Payload.Status.AUTHORIZED)
                            .subscriberName("John Doe")
                            .userId("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .build()
                    )
                    .payloadStatus(WebhookPortoutStatusChanged.PayloadStatus.CREATED)
                    .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("portout_event")
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
    fun ofWebhookPortoutNewComment() {
        val webhookPortoutNewComment =
            WebhookPortoutNewComment.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutNewComment.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutNewComment.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutNewComment.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .comment("This is a comment.")
                        .portoutId("d26109e5-0605-4671-a235-d3c649cc8406")
                        .userId("1c45c968-c2e0-4559-b1dd-db073962fc61")
                        .build()
                )
                .payloadStatus(WebhookPortoutNewComment.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val eventListResponse =
            EventListResponse.ofWebhookPortoutNewComment(webhookPortoutNewComment)

        assertThat(eventListResponse.webhookPortoutStatusChanged()).isEmpty
        assertThat(eventListResponse.webhookPortoutNewComment()).contains(webhookPortoutNewComment)
        assertThat(eventListResponse.webhookPortoutFocDateChanged()).isEmpty
    }

    @Test
    fun ofWebhookPortoutNewCommentRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofWebhookPortoutNewComment(
                WebhookPortoutNewComment.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        WebhookPortoutNewComment.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(WebhookPortoutNewComment.EventType.PORTOUT_STATUS_CHANGED)
                    .payload(
                        WebhookPortoutNewComment.Payload.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .comment("This is a comment.")
                            .portoutId("d26109e5-0605-4671-a235-d3c649cc8406")
                            .userId("1c45c968-c2e0-4559-b1dd-db073962fc61")
                            .build()
                    )
                    .payloadStatus(WebhookPortoutNewComment.PayloadStatus.CREATED)
                    .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("portout_event")
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
    fun ofWebhookPortoutFocDateChanged() {
        val webhookPortoutFocDateChanged =
            WebhookPortoutFocDateChanged.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .addAvailableNotificationMethod(
                    WebhookPortoutFocDateChanged.AvailableNotificationMethod.EMAIL
                )
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .eventType(WebhookPortoutFocDateChanged.EventType.PORTOUT_STATUS_CHANGED)
                .payload(
                    WebhookPortoutFocDateChanged.Payload.builder()
                        .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                        .focDate(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                        .userId("0e19c89e-f0ce-458a-a36c-3c60bc2014b1")
                        .build()
                )
                .payloadStatus(WebhookPortoutFocDateChanged.PayloadStatus.CREATED)
                .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                .recordType("portout_event")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val eventListResponse =
            EventListResponse.ofWebhookPortoutFocDateChanged(webhookPortoutFocDateChanged)

        assertThat(eventListResponse.webhookPortoutStatusChanged()).isEmpty
        assertThat(eventListResponse.webhookPortoutNewComment()).isEmpty
        assertThat(eventListResponse.webhookPortoutFocDateChanged())
            .contains(webhookPortoutFocDateChanged)
    }

    @Test
    fun ofWebhookPortoutFocDateChangedRoundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.ofWebhookPortoutFocDateChanged(
                WebhookPortoutFocDateChanged.builder()
                    .id("eef3340b-8903-4466-b445-89b697315a3a")
                    .addAvailableNotificationMethod(
                        WebhookPortoutFocDateChanged.AvailableNotificationMethod.EMAIL
                    )
                    .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                    .eventType(WebhookPortoutFocDateChanged.EventType.PORTOUT_STATUS_CHANGED)
                    .payload(
                        WebhookPortoutFocDateChanged.Payload.builder()
                            .id("96dfa9e4-c753-4fd3-97cd-42d66f26cf0c")
                            .focDate(OffsetDateTime.parse("2021-03-19T10:07:15.527Z"))
                            .userId("0e19c89e-f0ce-458a-a36c-3c60bc2014b1")
                            .build()
                    )
                    .payloadStatus(WebhookPortoutFocDateChanged.PayloadStatus.CREATED)
                    .portoutId("9471c873-e3eb-4ca1-957d-f9a451334d52")
                    .recordType("portout_event")
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
