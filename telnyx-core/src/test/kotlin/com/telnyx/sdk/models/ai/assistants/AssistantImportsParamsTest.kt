// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantImportsParamsTest {

    @Test
    fun create() {
        AssistantImportsParams.builder()
            .apiKeyRef("api_key_ref")
            .provider(AssistantImportsParams.Provider.ELEVENLABS)
            .addImportId("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            AssistantImportsParams.builder()
                .apiKeyRef("api_key_ref")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .addImportId("string")
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("api_key_ref")
        assertThat(body.provider()).isEqualTo(AssistantImportsParams.Provider.ELEVENLABS)
        assertThat(body.importIds().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AssistantImportsParams.builder()
                .apiKeyRef("api_key_ref")
                .provider(AssistantImportsParams.Provider.ELEVENLABS)
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("api_key_ref")
        assertThat(body.provider()).isEqualTo(AssistantImportsParams.Provider.ELEVENLABS)
    }
}
