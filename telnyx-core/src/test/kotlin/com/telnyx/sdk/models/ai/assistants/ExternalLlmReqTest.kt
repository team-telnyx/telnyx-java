// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLlmReqTest {

    @Test
    fun create() {
        val externalLlmReq =
            ExternalLlmReq.builder()
                .baseUrl("base_url")
                .model("model")
                .authenticationMethod(AuthenticationMethod.TOKEN)
                .certificateRef("certificate_ref")
                .forwardMetadata(true)
                .llmApiKeyRef("llm_api_key_ref")
                .tokenRetrievalUrl("token_retrieval_url")
                .build()

        assertThat(externalLlmReq.baseUrl()).isEqualTo("base_url")
        assertThat(externalLlmReq.model()).isEqualTo("model")
        assertThat(externalLlmReq.authenticationMethod()).contains(AuthenticationMethod.TOKEN)
        assertThat(externalLlmReq.certificateRef()).contains("certificate_ref")
        assertThat(externalLlmReq.forwardMetadata()).contains(true)
        assertThat(externalLlmReq.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(externalLlmReq.tokenRetrievalUrl()).contains("token_retrieval_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLlmReq =
            ExternalLlmReq.builder()
                .baseUrl("base_url")
                .model("model")
                .authenticationMethod(AuthenticationMethod.TOKEN)
                .certificateRef("certificate_ref")
                .forwardMetadata(true)
                .llmApiKeyRef("llm_api_key_ref")
                .tokenRetrievalUrl("token_retrieval_url")
                .build()

        val roundtrippedExternalLlmReq =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLlmReq),
                jacksonTypeRef<ExternalLlmReq>(),
            )

        assertThat(roundtrippedExternalLlmReq).isEqualTo(externalLlmReq)
    }
}
