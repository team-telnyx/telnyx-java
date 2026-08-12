// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSummarizeParamsTest {

    @Test
    fun create() {
        AiSummarizeParams.builder()
            .bucket("string")
            .filename("string")
            .systemPrompt("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            AiSummarizeParams.builder()
                .bucket("string")
                .filename("string")
                .systemPrompt("string")
                .build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("string")
        assertThat(body.filename()).isEqualTo("string")
        assertThat(body.systemPrompt()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiSummarizeParams.builder().bucket("string").filename("string").build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("string")
        assertThat(body.filename()).isEqualTo("string")
    }
}
