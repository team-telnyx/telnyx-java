// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantImportsParamsTest {

    @Test
    fun create() {
        AssistantImportsParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .apiKeyRef("string")
            .provider(AssistantImportsParams.Provider.ELEVENLABS)
            .addImportId("string")
            .build()
    }

    @Test
    fun headers() {
        val params =
            AssistantImportsParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .apiKeyRef("string")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .addImportId("string")
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
        val params =
            AssistantImportsParams.builder()
                .apiKeyRef("string")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            AssistantImportsParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .apiKeyRef("string")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .addImportId("string")
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("string")
        assertThat(body.provider()).isEqualTo(AssistantImportsParams.Provider.ELEVENLABS)
        assertThat(body.importIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantImportsParams.builder()
                .apiKeyRef("string")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("string")
        assertThat(body.provider()).isEqualTo(AssistantImportsParams.Provider.ELEVENLABS)
    }
}
