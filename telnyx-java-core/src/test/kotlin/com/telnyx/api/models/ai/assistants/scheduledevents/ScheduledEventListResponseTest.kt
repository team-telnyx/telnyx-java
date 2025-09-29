// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventListResponseTest {

    @Test
    fun create() {
        val scheduledEventListResponse =
            ScheduledEventListResponse.builder()
                .addData(
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
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(scheduledEventListResponse.data())
            .containsExactly(
                ScheduledEventListResponse.Data.ofScheduledPhoneCallEventResponse(
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
            )
        assertThat(scheduledEventListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventListResponse =
            ScheduledEventListResponse.builder()
                .addData(
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
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedScheduledEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventListResponse),
                jacksonTypeRef<ScheduledEventListResponse>(),
            )

        assertThat(roundtrippedScheduledEventListResponse).isEqualTo(scheduledEventListResponse)
    }
}
