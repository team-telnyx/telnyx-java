// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.instructions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InstructionEnhanceParamsTest {

    @Test
    fun create() {
        InstructionEnhanceParams.builder()
            .assistantId("assistant_id")
            .enhancementPrompt("string")
            .instructions("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = InstructionEnhanceParams.builder().assistantId("assistant_id").build()

        assertThat(params._pathParam(0)).isEqualTo("assistant_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InstructionEnhanceParams.builder()
                .assistantId("assistant_id")
                .enhancementPrompt("string")
                .instructions("string")
                .build()

        val body = params._body()

        assertThat(body.enhancementPrompt()).contains("string")
        assertThat(body.instructions()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = InstructionEnhanceParams.builder().assistantId("assistant_id").build()

        val body = params._body()
    }
}
