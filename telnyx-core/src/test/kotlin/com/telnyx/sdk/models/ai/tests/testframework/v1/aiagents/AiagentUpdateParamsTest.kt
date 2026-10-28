// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiagentUpdateParamsTest {

    @Test
    fun create() {
        AiagentUpdateParams.builder()
            .id(0L)
            .agentName("Support Bot Under Test - renamed")
            .assistantId("assistant_id")
            .autoFetchCallsEnabled(true)
            .autoSyncPromptEnabled(true)
            .autoUpdateDropoffNodes(true)
            .autoUpdateTopicNodes(true)
            .contactNumber("contact_number")
            .description("description")
            .inbound(true)
            .language("language")
            .llmMaxTokens(256L)
            .llmModel("llm_model")
            .llmSystemPrompt("llm_system_prompt")
            .llmTemperature(0.5)
            .outboundAutoCall(true)
            .sipEndpoint("sip_endpoint")
            .build()
    }

    @Test
    fun pathParams() {
        val params = AiagentUpdateParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AiagentUpdateParams.builder()
                .id(0L)
                .agentName("Support Bot Under Test - renamed")
                .assistantId("assistant_id")
                .autoFetchCallsEnabled(true)
                .autoSyncPromptEnabled(true)
                .autoUpdateDropoffNodes(true)
                .autoUpdateTopicNodes(true)
                .contactNumber("contact_number")
                .description("description")
                .inbound(true)
                .language("language")
                .llmMaxTokens(256L)
                .llmModel("llm_model")
                .llmSystemPrompt("llm_system_prompt")
                .llmTemperature(0.5)
                .outboundAutoCall(true)
                .sipEndpoint("sip_endpoint")
                .build()

        val body = params._body()

        assertThat(body.agentName()).contains("Support Bot Under Test - renamed")
        assertThat(body.assistantId()).contains("assistant_id")
        assertThat(body.autoFetchCallsEnabled()).contains(true)
        assertThat(body.autoSyncPromptEnabled()).contains(true)
        assertThat(body.autoUpdateDropoffNodes()).contains(true)
        assertThat(body.autoUpdateTopicNodes()).contains(true)
        assertThat(body.contactNumber()).contains("contact_number")
        assertThat(body.description()).contains("description")
        assertThat(body.inbound()).contains(true)
        assertThat(body.language()).contains("language")
        assertThat(body.llmMaxTokens()).contains(256L)
        assertThat(body.llmModel()).contains("llm_model")
        assertThat(body.llmSystemPrompt()).contains("llm_system_prompt")
        assertThat(body.llmTemperature()).contains(0.5)
        assertThat(body.outboundAutoCall()).contains(true)
        assertThat(body.sipEndpoint()).contains("sip_endpoint")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AiagentUpdateParams.builder().id(0L).build()

        val body = params._body()
    }
}
