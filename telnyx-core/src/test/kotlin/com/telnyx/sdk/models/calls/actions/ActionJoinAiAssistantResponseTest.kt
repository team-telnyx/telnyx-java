// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionJoinAiAssistantResponseTest {

    @Test
    fun create() {
        val actionJoinAiAssistantResponse =
            ActionJoinAiAssistantResponse.builder()
                .data(
                    CallControlCommandResultWithConversationId.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        assertThat(actionJoinAiAssistantResponse.data())
            .contains(
                CallControlCommandResultWithConversationId.builder()
                    .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                    .result("ok")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionJoinAiAssistantResponse =
            ActionJoinAiAssistantResponse.builder()
                .data(
                    CallControlCommandResultWithConversationId.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        val roundtrippedActionJoinAiAssistantResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionJoinAiAssistantResponse),
                jacksonTypeRef<ActionJoinAiAssistantResponse>(),
            )

        assertThat(roundtrippedActionJoinAiAssistantResponse)
            .isEqualTo(actionJoinAiAssistantResponse)
    }
}
