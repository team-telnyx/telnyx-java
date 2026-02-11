// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.scheduledevents

import com.telnyx.sdk.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledEventCreateParamsTest {

    @Test
    fun create() {
        ScheduledEventCreateParams.builder()
            .assistantId("assistant_id")
            .scheduledAtFixedDatetime(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
            .telnyxAgentTarget("telnyx_agent_target")
            .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
            .telnyxEndUserTarget("telnyx_end_user_target")
            .conversationMetadata(
                ScheduledEventCreateParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .dynamicVariables(
                ScheduledEventCreateParams.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .text("text")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ScheduledEventCreateParams.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ScheduledEventCreateParams.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .conversationMetadata(
                    ScheduledEventCreateParams.ConversationMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .dynamicVariables(
                    ScheduledEventCreateParams.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .text("text")
                .build()

        val body = params._body()

        assertThat(body.scheduledAtFixedDatetime())
            .isEqualTo(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
        assertThat(body.telnyxAgentTarget()).isEqualTo("telnyx_agent_target")
        assertThat(body.telnyxConversationChannel()).isEqualTo(ConversationChannelType.PHONE_CALL)
        assertThat(body.telnyxEndUserTarget()).isEqualTo("telnyx_end_user_target")
        assertThat(body.conversationMetadata())
            .contains(
                ScheduledEventCreateParams.ConversationMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.dynamicVariables())
            .contains(
                ScheduledEventCreateParams.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(body.text()).contains("text")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ScheduledEventCreateParams.builder()
                .assistantId("assistant_id")
                .scheduledAtFixedDatetime(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
                .telnyxAgentTarget("telnyx_agent_target")
                .telnyxConversationChannel(ConversationChannelType.PHONE_CALL)
                .telnyxEndUserTarget("telnyx_end_user_target")
                .build()

        val body = params._body()

        assertThat(body.scheduledAtFixedDatetime())
            .isEqualTo(OffsetDateTime.parse("2025-04-15T13:07:28.764Z"))
        assertThat(body.telnyxAgentTarget()).isEqualTo("telnyx_agent_target")
        assertThat(body.telnyxConversationChannel()).isEqualTo(ConversationChannelType.PHONE_CALL)
        assertThat(body.telnyxEndUserTarget()).isEqualTo("telnyx_end_user_target")
    }
}
