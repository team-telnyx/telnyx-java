// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.openai

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OpenAICreateResponseParamsTest {

    @Test
    fun create() {
        OpenAICreateResponseParams.builder()
            .conversation("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .input(
                JsonValue.from(
                    listOf(
                        mapOf(
                            "role" to "user",
                            "content" to
                                listOf(mapOf("type" to "input_text", "text" to "Hello, world!")),
                        )
                    )
                )
            )
            .instructions("You are a friendly chatbot.")
            .model("zai-org/GLM-5.1-FP8")
            .stream(true)
            .build()
    }

    @Test
    fun body() {
        val params =
            OpenAICreateResponseParams.builder()
                .conversation("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .input(
                    JsonValue.from(
                        listOf(
                            mapOf(
                                "role" to "user",
                                "content" to
                                    listOf(mapOf("type" to "input_text", "text" to "Hello, world!")),
                            )
                        )
                    )
                )
                .instructions("You are a friendly chatbot.")
                .model("zai-org/GLM-5.1-FP8")
                .stream(true)
                .build()

        val body = params._body()

        assertThat(body.conversation()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body._input())
            .isEqualTo(
                JsonValue.from(
                    listOf(
                        mapOf(
                            "role" to "user",
                            "content" to
                                listOf(mapOf("type" to "input_text", "text" to "Hello, world!")),
                        )
                    )
                )
            )
        assertThat(body.instructions()).contains("You are a friendly chatbot.")
        assertThat(body.model()).contains("zai-org/GLM-5.1-FP8")
        assertThat(body.stream()).contains(true)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = OpenAICreateResponseParams.builder().build()

        val body = params._body()
    }
}
