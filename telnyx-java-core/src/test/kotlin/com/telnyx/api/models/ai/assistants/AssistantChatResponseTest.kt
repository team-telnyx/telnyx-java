// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantChatResponseTest {

    @Test
    fun create() {
        val assistantChatResponse =
            AssistantChatResponse.builder()
                .content(
                    "Why did the cat sit on the computer? Because it wanted to keep an eye on the mouse!"
                )
                .build()

        assertThat(assistantChatResponse.content())
            .isEqualTo(
                "Why did the cat sit on the computer? Because it wanted to keep an eye on the mouse!"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantChatResponse =
            AssistantChatResponse.builder()
                .content(
                    "Why did the cat sit on the computer? Because it wanted to keep an eye on the mouse!"
                )
                .build()

        val roundtrippedAssistantChatResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantChatResponse),
                jacksonTypeRef<AssistantChatResponse>(),
            )

        assertThat(roundtrippedAssistantChatResponse).isEqualTo(assistantChatResponse)
    }
}
