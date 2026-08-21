// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiSummarizeParamsTest {

    @Test
    fun create() {
        AiSummarizeParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .bucket("string")
            .filename("string")
            .systemPrompt("string")
            .build()
    }

    @Test
    fun headers() {
        val params =
            AiSummarizeParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .bucket("string")
                .filename("string")
                .systemPrompt("string")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = AiSummarizeParams.builder().bucket("string").filename("string").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AiSummarizeParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
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
