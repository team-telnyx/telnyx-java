// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.conversations

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConversationListParamsTest {

    @Test
    fun create() {
        ConversationListParams.builder()
            .id("id")
            .createdAt("created_at")
            .lastMessageAt("last_message_at")
            .limit(1L)
            .metadataAssistantId("metadata->assistant_id")
            .metadataCallControlId("metadata->call_control_id")
            .metadataTelnyxAgentTarget("metadata->telnyx_agent_target")
            .metadataTelnyxConversationChannel("metadata->telnyx_conversation_channel")
            .metadataTelnyxEndUserTarget("metadata->telnyx_end_user_target")
            .name("name")
            .or("or")
            .order("order")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ConversationListParams.builder()
                .id("id")
                .createdAt("created_at")
                .lastMessageAt("last_message_at")
                .limit(1L)
                .metadataAssistantId("metadata->assistant_id")
                .metadataCallControlId("metadata->call_control_id")
                .metadataTelnyxAgentTarget("metadata->telnyx_agent_target")
                .metadataTelnyxConversationChannel("metadata->telnyx_conversation_channel")
                .metadataTelnyxEndUserTarget("metadata->telnyx_end_user_target")
                .name("name")
                .or("or")
                .order("order")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("id", "id")
                    .put("created_at", "created_at")
                    .put("last_message_at", "last_message_at")
                    .put("limit", "1")
                    .put("metadata->assistant_id", "metadata->assistant_id")
                    .put("metadata->call_control_id", "metadata->call_control_id")
                    .put("metadata->telnyx_agent_target", "metadata->telnyx_agent_target")
                    .put(
                        "metadata->telnyx_conversation_channel",
                        "metadata->telnyx_conversation_channel",
                    )
                    .put("metadata->telnyx_end_user_target", "metadata->telnyx_end_user_target")
                    .put("name", "name")
                    .put("or", "or")
                    .put("order", "order")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ConversationListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
