// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FallbackConfigReqTest {

    @Test
    fun create() {
        val fallbackConfigReq =
            FallbackConfigReq.builder()
                .externalLlm(
                    ExternalLlmReq.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .llmApiKeyRef("llm_api_key_ref")
                .model("model")
                .build()

        assertThat(fallbackConfigReq.externalLlm())
            .contains(
                ExternalLlmReq.builder()
                    .baseUrl("base_url")
                    .model("model")
                    .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
                    .certificateRef("certificate_ref")
                    .forwardMetadata(true)
                    .llmApiKeyRef("llm_api_key_ref")
                    .tokenRetrievalUrl("token_retrieval_url")
                    .build()
            )
        assertThat(fallbackConfigReq.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(fallbackConfigReq.model()).contains("model")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fallbackConfigReq =
            FallbackConfigReq.builder()
                .externalLlm(
                    ExternalLlmReq.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(ExternalLlmReq.AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .llmApiKeyRef("llm_api_key_ref")
                .model("model")
                .build()

        val roundtrippedFallbackConfigReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fallbackConfigReq),
                jacksonTypeRef<FallbackConfigReq>(),
            )

        assertThat(roundtrippedFallbackConfigReq).isEqualTo(fallbackConfigReq)
    }
}
