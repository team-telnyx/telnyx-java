// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAICreateResponseResponseTest {

    @Test
    fun create() {
        val openaiCreateResponseResponse =
            OpenAICreateResponseResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val openaiCreateResponseResponse =
            OpenAICreateResponseResponse.builder()
                .putAdditionalProperty("foo", JsonValue.from("bar"))
                .build()

        val roundtrippedOpenAICreateResponseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(openaiCreateResponseResponse),
                jacksonTypeRef<OpenAICreateResponseResponse>(),
            )

        assertThat(roundtrippedOpenAICreateResponseResponse).isEqualTo(openaiCreateResponseResponse)
    }
}
