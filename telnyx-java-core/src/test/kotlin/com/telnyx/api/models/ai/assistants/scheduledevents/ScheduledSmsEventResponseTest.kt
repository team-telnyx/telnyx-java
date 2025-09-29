// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledSmsEventResponseTest {

    @Test
    fun create() {
        val scheduledSmsEventResponse =
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

        assertThat(scheduledSmsEventResponse.assistantId()).isEqualTo("assistant_id")
        assertThat(scheduledSmsEventResponse.scheduledAtFixedDatetime())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledSmsEventResponse.telnyxAgentTarget()).isEqualTo("telnyx_agent_target")
        assertThat(scheduledSmsEventResponse.telnyxConversationChannel())
            .isEqualTo(ConversationChannelType.PHONE_CALL)
        assertThat(scheduledSmsEventResponse.telnyxEndUserTarget())
            .isEqualTo("telnyx_end_user_target")
        assertThat(scheduledSmsEventResponse.text()).isEqualTo("text")
        assertThat(scheduledSmsEventResponse.conversationId()).contains("conversation_id")
        assertThat(scheduledSmsEventResponse.conversationMetadata())
            .contains(
                ScheduledSmsEventResponse.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(scheduledSmsEventResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(scheduledSmsEventResponse.errors().getOrNull()).containsExactly("string")
        assertThat(scheduledSmsEventResponse.retryCount()).contains(0L)
        assertThat(scheduledSmsEventResponse.scheduledEventId()).contains("scheduled_event_id")
        assertThat(scheduledSmsEventResponse.status()).contains(EventStatus.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledSmsEventResponse =
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

        val roundtrippedScheduledSmsEventResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledSmsEventResponse),
                jacksonTypeRef<ScheduledSmsEventResponse>(),
            )

        assertThat(roundtrippedScheduledSmsEventResponse).isEqualTo(scheduledSmsEventResponse)
    }
}
