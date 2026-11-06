// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FallbackConfigTest {

    @Test
    fun create() {
        val fallbackConfig =
            FallbackConfig.builder()
                .externalLlm(
                    ExternalLlm.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .extraHeaders(
                            ExternalLlm.ExtraHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from(">Q0]"))
                                .build()
                        )
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .llmApiKeyRef("llm_api_key_ref")
                .model("model")
                .build()

        assertThat(fallbackConfig.externalLlm())
            .contains(
                ExternalLlm.builder()
                    .baseUrl("base_url")
                    .model("model")
                    .authenticationMethod(AuthenticationMethod.TOKEN)
                    .certificateRef("certificate_ref")
                    .extraHeaders(
                        ExternalLlm.ExtraHeaders.builder()
                            .putAdditionalProperty("foo", JsonValue.from(">Q0]"))
                            .build()
                    )
                    .forwardMetadata(true)
                    .llmApiKeyRef("llm_api_key_ref")
                    .tokenRetrievalUrl("token_retrieval_url")
                    .build()
            )
        assertThat(fallbackConfig.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(fallbackConfig.model()).contains("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fallbackConfig =
            FallbackConfig.builder()
                .externalLlm(
                    ExternalLlm.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .extraHeaders(
                            ExternalLlm.ExtraHeaders.builder()
                                .putAdditionalProperty("foo", JsonValue.from(">Q0]"))
                                .build()
                        )
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .llmApiKeyRef("llm_api_key_ref")
                .model("model")
                .build()

        val roundtrippedFallbackConfig =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fallbackConfig),
                jacksonTypeRef<FallbackConfig>(),
            )

        assertThat(roundtrippedFallbackConfig).isEqualTo(fallbackConfig)
    }
}
