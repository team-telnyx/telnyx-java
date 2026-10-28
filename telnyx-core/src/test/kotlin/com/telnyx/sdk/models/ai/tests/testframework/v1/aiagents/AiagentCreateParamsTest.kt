// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiagentCreateParamsTest {

    @Test
    fun create() {
        AiagentCreateParams.builder()
            .agentName("Support Bot Under Test")
            .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
            .autoFetchCallsEnabled(true)
            .autoSyncPromptEnabled(true)
            .autoUpdateDropoffNodes(false)
            .autoUpdateTopicNodes(false)
            .contactNumber("contact_number")
            .description("Evaluates the support assistant against generated callers.")
            .inbound(false)
            .language("en")
            .llmMaxTokens(512L)
            .llmModel("openai/gpt-oss-120b")
            .llmSystemPrompt("llm_system_prompt")
            .llmTemperature(0.7)
            .outboundAutoCall(false)
            .sipEndpoint("")
            .build()
    }

    @Test
    fun body() {
        val params =
            AiagentCreateParams.builder()
                .agentName("Support Bot Under Test")
                .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
                .autoFetchCallsEnabled(true)
                .autoSyncPromptEnabled(true)
                .autoUpdateDropoffNodes(false)
                .autoUpdateTopicNodes(false)
                .contactNumber("contact_number")
                .description("Evaluates the support assistant against generated callers.")
                .inbound(false)
                .language("en")
                .llmMaxTokens(512L)
                .llmModel("openai/gpt-oss-120b")
                .llmSystemPrompt("llm_system_prompt")
                .llmTemperature(0.7)
                .outboundAutoCall(false)
                .sipEndpoint("")
                .build()

        val body = params._body()

        assertThat(body.agentName()).isEqualTo("Support Bot Under Test")
        assertThat(body.assistantId()).isEqualTo("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
        assertThat(body.autoFetchCallsEnabled()).contains(true)
        assertThat(body.autoSyncPromptEnabled()).contains(true)
        assertThat(body.autoUpdateDropoffNodes()).contains(false)
        assertThat(body.autoUpdateTopicNodes()).contains(false)
        assertThat(body.contactNumber()).contains("contact_number")
        assertThat(body.description())
            .contains("Evaluates the support assistant against generated callers.")
        assertThat(body.inbound()).contains(false)
        assertThat(body.language()).contains("en")
        assertThat(body.llmMaxTokens()).contains(512L)
        assertThat(body.llmModel()).contains("openai/gpt-oss-120b")
        assertThat(body.llmSystemPrompt()).contains("llm_system_prompt")
        assertThat(body.llmTemperature()).contains(0.7)
        assertThat(body.outboundAutoCall()).contains(false)
        assertThat(body.sipEndpoint()).contains("")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AiagentCreateParams.builder()
                .agentName("Support Bot Under Test")
                .assistantId("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
                .build()

        val body = params._body()

        assertThat(body.agentName()).isEqualTo("Support Bot Under Test")
        assertThat(body.assistantId()).isEqualTo("e1a2b3c4-d5e6-f7a8-b9c0-d1e2f3a4b5c6")
    }
}
