// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartAiAssistantResponseTest {

    @Test
    fun create() {
        val actionStartAiAssistantResponse =
            ActionStartAiAssistantResponse.builder()
                .data(
                    ActionStartAiAssistantResponse.Data.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        assertThat(actionStartAiAssistantResponse.data())
            .contains(
                ActionStartAiAssistantResponse.Data.builder()
                    .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                    .result("ok")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartAiAssistantResponse =
            ActionStartAiAssistantResponse.builder()
                .data(
                    ActionStartAiAssistantResponse.Data.builder()
                        .conversationId("d7e9c1d4-8b2a-4b8f-b3a7-9a671c9e9b0a")
                        .result("ok")
                        .build()
                )
                .build()

        val roundtrippedActionStartAiAssistantResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartAiAssistantResponse),
                jacksonTypeRef<ActionStartAiAssistantResponse>(),
            )

        assertThat(roundtrippedActionStartAiAssistantResponse)
            .isEqualTo(actionStartAiAssistantResponse)
    }
}
