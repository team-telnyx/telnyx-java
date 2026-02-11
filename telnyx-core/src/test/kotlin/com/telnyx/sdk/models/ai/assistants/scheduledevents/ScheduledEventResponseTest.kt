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

internal class ScheduledEventResponseTest {

    @Test
    fun ofPhoneCall() {
        val phoneCall =
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
                .dynamicVariables(
                    ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addError("string")
                .retryAttempts(0L)
                .retryCount(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        val scheduledEventResponse = ScheduledEventResponse.ofPhoneCall(phoneCall)

        assertThat(scheduledEventResponse.phoneCall()).contains(phoneCall)
        assertThat(scheduledEventResponse.sms()).isEmpty
    }

    @Test
    fun ofPhoneCallRoundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventResponse =
            ScheduledEventResponse.ofPhoneCall(
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
                    .dynamicVariables(
                        ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addError("string")
                    .retryAttempts(0L)
                    .retryCount(0L)
                    .scheduledEventId("scheduled_event_id")
                    .status(EventStatus.PENDING)
                    .build()
            )

        val roundtrippedScheduledEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventResponse),
                jacksonTypeRef<ScheduledEventResponse>(),
            )

        assertThat(roundtrippedScheduledEventResponse).isEqualTo(scheduledEventResponse)
    }

    @Test
    fun ofSms() {
        val sms =
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
                .dynamicVariables(
                    ScheduledSmsEventResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addError("string")
                .retryCount(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        val scheduledEventResponse = ScheduledEventResponse.ofSms(sms)

        assertThat(scheduledEventResponse.phoneCall()).isEmpty
        assertThat(scheduledEventResponse.sms()).contains(sms)
    }

    @Test
    fun ofSmsRoundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventResponse =
            ScheduledEventResponse.ofSms(
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
                    .dynamicVariables(
                        ScheduledSmsEventResponse.DynamicVariables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .addError("string")
                    .retryCount(0L)
                    .scheduledEventId("scheduled_event_id")
                    .status(EventStatus.PENDING)
                    .build()
            )

        val roundtrippedScheduledEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventResponse),
                jacksonTypeRef<ScheduledEventResponse>(),
            )

        assertThat(roundtrippedScheduledEventResponse).isEqualTo(scheduledEventResponse)
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
        val scheduledEventResponse =
            jsonMapper().convertValue(testCase.value, jacksonTypeRef<ScheduledEventResponse>())

        val e = assertThrows<TelnyxInvalidDataException> { scheduledEventResponse.validate() }
        assertThat(e).hasMessageStartingWith("Unknown ")
    }
}
