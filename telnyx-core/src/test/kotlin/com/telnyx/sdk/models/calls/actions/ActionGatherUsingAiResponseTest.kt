// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherUsingAiResponseTest {

    @Test
    fun create() {
        val actionGatherUsingAiResponse =
            ActionGatherUsingAiResponse.builder()
                .data(
                    CallControlCommandResultWithConversationId.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        assertThat(actionGatherUsingAiResponse.data())
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
        val actionGatherUsingAiResponse =
            ActionGatherUsingAiResponse.builder()
                .data(
                    CallControlCommandResultWithConversationId.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        val roundtrippedActionGatherUsingAiResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionGatherUsingAiResponse),
                jacksonTypeRef<ActionGatherUsingAiResponse>(),
            )

        assertThat(roundtrippedActionGatherUsingAiResponse).isEqualTo(actionGatherUsingAiResponse)
    }
}
