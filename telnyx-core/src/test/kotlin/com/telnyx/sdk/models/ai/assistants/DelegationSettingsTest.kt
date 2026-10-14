// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DelegationSettingsTest {

    @Test
    fun create() {
        val delegationSettings =
            DelegationSettings.builder()
                .enabled(true)
                .externalLlm(
                    ExternalLlm.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .instructions("instructions")
                .llmApiKeyRef("llm_api_key_ref")
                .mode(DelegationSettings.Mode.TELNYX)
                .model("model")
                .speakResults(true)
                .build()

        assertThat(delegationSettings.enabled()).contains(true)
        assertThat(delegationSettings.externalLlm())
            .contains(
                ExternalLlm.builder()
                    .baseUrl("base_url")
                    .model("model")
                    .authenticationMethod(AuthenticationMethod.TOKEN)
                    .certificateRef("certificate_ref")
                    .forwardMetadata(true)
                    .llmApiKeyRef("llm_api_key_ref")
                    .tokenRetrievalUrl("token_retrieval_url")
                    .build()
            )
        assertThat(delegationSettings.instructions()).contains("instructions")
        assertThat(delegationSettings.llmApiKeyRef()).contains("llm_api_key_ref")
        assertThat(delegationSettings.mode()).contains(DelegationSettings.Mode.TELNYX)
        assertThat(delegationSettings.model()).contains("model")
        assertThat(delegationSettings.speakResults()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val delegationSettings =
            DelegationSettings.builder()
                .enabled(true)
                .externalLlm(
                    ExternalLlm.builder()
                        .baseUrl("base_url")
                        .model("model")
                        .authenticationMethod(AuthenticationMethod.TOKEN)
                        .certificateRef("certificate_ref")
                        .forwardMetadata(true)
                        .llmApiKeyRef("llm_api_key_ref")
                        .tokenRetrievalUrl("token_retrieval_url")
                        .build()
                )
                .instructions("instructions")
                .llmApiKeyRef("llm_api_key_ref")
                .mode(DelegationSettings.Mode.TELNYX)
                .model("model")
                .speakResults(true)
                .build()

        val roundtrippedDelegationSettings =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(delegationSettings),
                jacksonTypeRef<DelegationSettings>(),
            )

        assertThat(roundtrippedDelegationSettings).isEqualTo(delegationSettings)
    }
}
