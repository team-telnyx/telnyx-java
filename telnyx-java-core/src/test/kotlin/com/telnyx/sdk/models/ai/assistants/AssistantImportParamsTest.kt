// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantImportParamsTest {

    @Test
    fun create() {
        AssistantImportParams.builder()
            .apiKeyRef("api_key_ref")
            .provider(AssistantImportParams.Provider.ELEVENLABS)
            .build()
    }

    @Test
    fun body() {
        val params =
            AssistantImportParams.builder()
                .apiKeyRef("api_key_ref")
                .provider(AssistantImportParams.Provider.ELEVENLABS)
                .build()

        val body = params._body()

        assertThat(body.apiKeyRef()).isEqualTo("api_key_ref")
        assertThat(body.provider()).isEqualTo(AssistantImportParams.Provider.ELEVENLABS)
    }
}
