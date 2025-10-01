// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSummarizeParamsTest {

    @Test
    fun create() {
        AiSummarizeParams.builder()
            .bucket("bucket")
            .filename("filename")
            .systemPrompt("system_prompt")
            .build()
    }

    @Test
    fun body() {
        val params =
            AiSummarizeParams.builder()
                .bucket("bucket")
                .filename("filename")
                .systemPrompt("system_prompt")
                .build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("bucket")
        assertThat(body.filename()).isEqualTo("filename")
        assertThat(body.systemPrompt()).contains("system_prompt")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiSummarizeParams.builder().bucket("bucket").filename("filename").build()

        val body = params._body()

        assertThat(body.bucket()).isEqualTo("bucket")
        assertThat(body.filename()).isEqualTo("filename")
    }
}
