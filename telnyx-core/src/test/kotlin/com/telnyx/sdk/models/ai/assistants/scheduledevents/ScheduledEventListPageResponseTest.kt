// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventListPageResponseTest {

    @Test
    fun create() {
        val scheduledEventListPageResponse =
            ScheduledEventListPageResponse.builder()
                .addData(
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

        assertThat(scheduledEventListPageResponse.data())
            .containsExactly(
                ScheduledEventListResponse.ofPhoneCallEvent(
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
                )
            )
        assertThat(scheduledEventListPageResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledEventListPageResponse =
            ScheduledEventListPageResponse.builder()
                .addData(
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

        val roundtrippedScheduledEventListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledEventListPageResponse),
                jacksonTypeRef<ScheduledEventListPageResponse>(),
            )

        assertThat(roundtrippedScheduledEventListPageResponse)
            .isEqualTo(scheduledEventListPageResponse)
    }
}
