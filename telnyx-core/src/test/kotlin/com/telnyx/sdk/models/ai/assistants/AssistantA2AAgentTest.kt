// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantA2AAgentTest {

    @Test
    fun create() {
        val assistantA2AAgent =
            AssistantA2AAgent.builder()
                .name("billing_agent")
                .url("https://agents.example.com")
                .async(true)
                .addHeader(
                    AssistantA2AAgent.Header.builder()
                        .name("X-Api-Key")
                        .value("{{#integration_secret}}my_agent_api_key{{/integration_secret}}")
                        .build()
                )
                .addMessage(
                    AssistantA2AAgent.Message.A2AAgentRequestStartMessage.builder()
                        .content("x")
                        .timingMs(100L)
                        .build()
                )
                .pollIntervalMs(500L)
                .timeoutMs(30000L)
                .build()

        assertThat(assistantA2AAgent.name()).isEqualTo("billing_agent")
        assertThat(assistantA2AAgent.url()).isEqualTo("https://agents.example.com")
        assertThat(assistantA2AAgent.async()).contains(true)
        assertThat(assistantA2AAgent.headers().getOrNull())
            .containsExactly(
                AssistantA2AAgent.Header.builder()
                    .name("X-Api-Key")
                    .value("{{#integration_secret}}my_agent_api_key{{/integration_secret}}")
                    .build()
            )
        assertThat(assistantA2AAgent.messages().getOrNull())
            .containsExactly(
                AssistantA2AAgent.Message.ofA2AAgentRequestStart(
                    AssistantA2AAgent.Message.A2AAgentRequestStartMessage.builder()
                        .content("x")
                        .timingMs(100L)
                        .build()
                )
            )
        assertThat(assistantA2AAgent.pollIntervalMs()).contains(500L)
        assertThat(assistantA2AAgent.timeoutMs()).contains(30000L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantA2AAgent =
            AssistantA2AAgent.builder()
                .name("billing_agent")
                .url("https://agents.example.com")
                .async(true)
                .addHeader(
                    AssistantA2AAgent.Header.builder()
                        .name("X-Api-Key")
                        .value("{{#integration_secret}}my_agent_api_key{{/integration_secret}}")
                        .build()
                )
                .addMessage(
                    AssistantA2AAgent.Message.A2AAgentRequestStartMessage.builder()
                        .content("x")
                        .timingMs(100L)
                        .build()
                )
                .pollIntervalMs(500L)
                .timeoutMs(30000L)
                .build()

        val roundtrippedAssistantA2AAgent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantA2AAgent),
                jacksonTypeRef<AssistantA2AAgent>(),
            )

        assertThat(roundtrippedAssistantA2AAgent).isEqualTo(assistantA2AAgent)
    }
}
