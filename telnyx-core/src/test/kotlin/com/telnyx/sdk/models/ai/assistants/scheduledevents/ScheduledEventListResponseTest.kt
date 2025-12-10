// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

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

internal class ScheduledEventListResponseTest {

    @Test
    fun ofPhoneCallEvent() {
        val phoneCallEvent =
            ScheduledPhoneCallEventResponse.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .conversationId("conversation_id")
                .conversationMetadata(
                    ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addError("string")
                .retryAttempts(0L)
                .retryCount(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        val scheduledEventListResponse = ScheduledEventListResponse.ofPhoneCallEvent(phoneCallEvent)

        assertThat(scheduledEventListResponse.phoneCallEvent()).contains(phoneCallEvent)
        assertThat(scheduledEventListResponse.smsEvent()).isEmpty
    }

    @Test
    fun ofPhoneCallEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventListResponse =
            ScheduledEventListResponse.ofPhoneCallEvent(
                ScheduledPhoneCallEventResponse.builder()
                    .assistantId("assistant_id")
                    .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .telnyxAgentTarget("telnyx_agent_target")
                    .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                    .telnyxEndUserTarget("telnyx_end_user_target")
                    .conversationId("conversation_id")
                    .conversationMetadata(
                        ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addError("string")
                    .retryAttempts(0L)
                    .retryCount(0L)
                    .scheduledEventId("scheduled_event_id")
                    .status(EventStatus.PENDING)
                    .build()
            )

        val roundtrippedScheduledEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventListResponse),
                jacksonTypeRef<ScheduledEventListResponse>(),
            )

        assertThat(roundtrippedScheduledEventListResponse).isEqualTo(scheduledEventListResponse)
    }

    @Test
    fun ofSmsEvent() {
        val smsEvent =
            ScheduledSmsEventResponse.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .text("text")
                .conversationId("conversation_id")
                .conversationMetadata(
                    ScheduledSmsEventResponse.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addError("string")
                .retryCount(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        val scheduledEventListResponse = ScheduledEventListResponse.ofSmsEvent(smsEvent)

        assertThat(scheduledEventListResponse.phoneCallEvent()).isEmpty
        assertThat(scheduledEventListResponse.smsEvent()).contains(smsEvent)
    }

    @Test
    fun ofSmsEventRoundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventListResponse =
            ScheduledEventListResponse.ofSmsEvent(
                ScheduledSmsEventResponse.builder()
                    .assistantId("assistant_id")
                    .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .telnyxAgentTarget("telnyx_agent_target")
                    .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                    .telnyxEndUserTarget("telnyx_end_user_target")
                    .text("text")
                    .conversationId("conversation_id")
                    .conversationMetadata(
                        ScheduledSmsEventResponse.ConversationMetadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addError("string")
                    .retryCount(0L)
                    .scheduledEventId("scheduled_event_id")
                    .status(EventStatus.PENDING)
                    .build()
            )

        val roundtrippedScheduledEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventListResponse),
                jacksonTypeRef<ScheduledEventListResponse>(),
            )

        assertThat(roundtrippedScheduledEventListResponse).isEqualTo(scheduledEventListResponse)
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
        val scheduledEventListResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ScheduledEventListResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { scheduledEventListResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
