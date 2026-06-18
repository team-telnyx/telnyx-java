// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.chat

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCreateCompletionResponseTest {

    @Test
    fun create() {
        val chatCreateCompletionResponse =
            ChatCreateCompletionResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val chatCreateCompletionResponse =
            ChatCreateCompletionResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedChatCreateCompletionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(chatCreateCompletionResponse),
                jacksonTypeRef<ChatCreateCompletionResponse>(),
            )

        assertThat(roundtrippedChatCreateCompletionResponse).isEqualTo(chatCreateCompletionResponse)
    }
}
