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

        assertThat(scheduledPhoneCallEventResponse.assistantId()).isEqualTo("assistant_id")
        assertThat(scheduledPhoneCallEventResponse.scheduledAtFixedDatetime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPhoneCallEventResponse.telnyxAgentTarget())
            .isEqualTo("telnyx_agent_target")
        assertThat(scheduledPhoneCallEventResponse.telnyxConversationChannel())
            .isEqualTo(ConversationChannelType.PHONE_CALL)
        assertThat(scheduledPhoneCallEventResponse.telnyxEndUserTarget())
            .isEqualTo("telnyx_end_user_target")
        assertThat(scheduledPhoneCallEventResponse.conversationId()).contains("conversation_id")
        assertThat(scheduledPhoneCallEventResponse.conversationMetadata())
            .contains(
                ScheduledPhoneCallEventResponse.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledPhoneCallEventResponse.dynamicVariables())
            .contains(
                ScheduledPhoneCallEventResponse.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduledPhoneCallEventResponse.errors().getOrNull()).containsExactly("string")
        assertThat(scheduledPhoneCallEventResponse.retryAttempts()).contains(0L)
        assertThat(scheduledPhoneCallEventResponse.retryCount()).contains(0L)
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

        val roundtrippedScheduledPhoneCallEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledPhoneCallEventResponse),
                jacksonTypeRef<ScheduledPhoneCallEventResponse>(),
            )

        assertThat(roundtrippedScheduledPhoneCallEventResponse)
            .isEqualTo(scheduledPhoneCallEventResponse)
    }
}
