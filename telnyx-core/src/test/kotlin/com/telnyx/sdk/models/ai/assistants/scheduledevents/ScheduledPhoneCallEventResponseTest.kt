// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledPhoneCallEventResponseTest {

    @Test
    fun create() {
        val scheduledPhoneCallEventResponse =
            ScheduledPhoneCallEventResponse.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .addCallAttempt(
                    ScheduledPhoneCallEventResponse.CallAttempt.builder()
                        .attemptNumber(0L)
                        .attemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .callStatus("call_status")
                        .callDuration(0L)
                        .telnyxCallControlId("telnyx_call_control_id")
                        .build()
                )
                .callDuration(0L)
                .callSettings(
                    ScheduledPhoneCallEventResponse.CallSettings.builder()
                        .sipRegion(ScheduledPhoneCallEventResponse.CallSettings.SipRegion.US)
                        .build()
                )
                .callStatus("call_status")
                .conversationId("conversation_id")
                .conversationMetadata(
                    ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dispatchedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dynamicVariables(
                    ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addError("string")
                .maxRetriesClientErrors(0L)
                .retryAttempts(0L)
                .retryCount(0L)
                .retryIntervalSecs(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        assertThat(scheduledPhoneCallEventResponse.assistantId()).isEqualTo("assistant_id")
        assertThat(scheduledPhoneCallEventResponse.scheduledAtFixedDatetime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPhoneCallEventResponse.telnyxAgentTarget())
            .isEqualTo("telnyx_agent_target")
        assertThat(scheduledPhoneCallEventResponse.telnyxConversationChannel())
            .isEqualTo(ConversationChannelType.PHONE_CALL)
        assertThat(scheduledPhoneCallEventResponse.telnyxEndUserTarget())
            .isEqualTo("telnyx_end_user_target")
        assertThat(scheduledPhoneCallEventResponse.callAttempts().getOrNull())
            .containsExactly(
                ScheduledPhoneCallEventResponse.CallAttempt.builder()
                    .attemptNumber(0L)
                    .attemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .callStatus("call_status")
                    .callDuration(0L)
                    .telnyxCallControlId("telnyx_call_control_id")
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.callDuration()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.callSettings())
            .contains(
                ScheduledPhoneCallEventResponse.CallSettings.builder()
                    .sipRegion(ScheduledPhoneCallEventResponse.CallSettings.SipRegion.US)
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.callStatus()).contains("call_status")
        assertThat(scheduledPhoneCallEventResponse.conversationId()).contains("conversation_id")
        assertThat(scheduledPhoneCallEventResponse.conversationMetadata())
            .contains(
                ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPhoneCallEventResponse.dispatchedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPhoneCallEventResponse.dynamicVariables())
            .contains(
                ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.errors().getOrNull()).containsExactly("string")
        assertThat(scheduledPhoneCallEventResponse.maxRetriesClientErrors()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.retryAttempts()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.retryCount()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.retryIntervalSecs()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.scheduledEventId())
            .contains("scheduled_event_id")
        assertThat(scheduledPhoneCallEventResponse.status()).contains(EventStatus.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledPhoneCallEventResponse =
            ScheduledPhoneCallEventResponse.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .addCallAttempt(
                    ScheduledPhoneCallEventResponse.CallAttempt.builder()
                        .attemptNumber(0L)
                        .attemptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .callStatus("call_status")
                        .callDuration(0L)
                        .telnyxCallControlId("telnyx_call_control_id")
                        .build()
                )
                .callDuration(0L)
                .callSettings(
                    ScheduledPhoneCallEventResponse.CallSettings.builder()
                        .sipRegion(ScheduledPhoneCallEventResponse.CallSettings.SipRegion.US)
                        .build()
                )
                .callStatus("call_status")
                .conversationId("conversation_id")
                .conversationMetadata(
                    ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dispatchedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .dynamicVariables(
                    ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .addError("string")
                .maxRetriesClientErrors(0L)
                .retryAttempts(0L)
                .retryCount(0L)
                .retryIntervalSecs(0L)
                .scheduledEventId("scheduled_event_id")
                .status(EventStatus.PENDING)
                .build()

        val roundtrippedScheduledPhoneCallEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledPhoneCallEventResponse),
                jacksonTypeRef<ScheduledPhoneCallEventResponse>(),
            )

        assertThat(roundtrippedScheduledPhoneCallEventResponse)
            .isEqualTo(scheduledPhoneCallEventResponse)
    }
}
