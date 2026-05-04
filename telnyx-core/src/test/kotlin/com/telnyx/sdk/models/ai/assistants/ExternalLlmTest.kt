// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalLlmTest {

    @Test
    fun create() {
        val externalLlm =
            ExternalLlm.builder()
                .baseUrl("base_url")
                .model("model")
                .authenticationMethod(ExternalLlm.AuthenticationMethod.TOKEN)
                .certificateRef("certificate_ref")
                .forwardMetadata(true)
                .llmApiKeyRef("llm_api_key_ref")
                .tokenRetrievalUrl("token_retrieval_url")
                .build()

        assertThat(externalLlm.baseUrl()).isEqualTo("base_url")
        assertThat(externalLlm.model()).isEqualTo("model")
        assertThat(externalLlm.authenticationMethod())
            .contains(ExternalLlm.AuthenticationMethod.TOKEN)
        assertThat(externalLlm.certificateRef()).contains("certificate_ref")
        assertThat(externalLlm.forwardMetadata()).contains(true)
        assertThat(externalLlm.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(externalLlm.tokenRetrievalUrl()).contains("token_retrieval_url")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalLlm =
            ExternalLlm.builder()
                .baseUrl("base_url")
                .model("model")
                .authenticationMethod(ExternalLlm.AuthenticationMethod.TOKEN)
                .certificateRef("certificate_ref")
                .forwardMetadata(true)
                .llmApiKeyRef("llm_api_key_ref")
                .tokenRetrievalUrl("token_retrieval_url")
                .build()

        val roundtrippedExternalLlm =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalLlm),
                jacksonTypeRef<ExternalLlm>(),
            )

        assertThat(roundtrippedExternalLlm).isEqualTo(externalLlm)
    }
}
