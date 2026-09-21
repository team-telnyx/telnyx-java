// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botchallenge

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BotChallengeCreateParamsTest {

    @Test
    fun create() {
        BotChallengeCreateParams.builder()
            .llmModelName("claude-opus-4")
            .llmParameterCount("175B")
            .llmQuantization("int8")
            .build()
    }

    @Test
    fun body() {
        val params =
            BotChallengeCreateParams.builder()
                .llmModelName("claude-opus-4")
                .llmParameterCount("175B")
                .llmQuantization("int8")
                .build()

        val body = params._body()

        assertThat(body.llmModelName()).contains("claude-opus-4")
        assertThat(body.llmParameterCount()).contains("175B")
        assertThat(body.llmQuantization()).contains("int8")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = BotChallengeCreateParams.builder().build()

        val body = params._body()
    }
}
