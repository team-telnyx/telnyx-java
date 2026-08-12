// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentTestingConfigurationTest {

    @Test
    fun create() {
        val agentTestingConfiguration =
            AgentTestingConfiguration.builder()
                .testUrl("https://example.com")
                .additionalInformation("x")
                .messageId("x")
                .build()

        assertThat(agentTestingConfiguration.testUrl()).isEqualTo("https://example.com")
        assertThat(agentTestingConfiguration.additionalInformation()).contains("x")
        assertThat(agentTestingConfiguration.messageId()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentTestingConfiguration =
            AgentTestingConfiguration.builder()
                .testUrl("https://example.com")
                .additionalInformation("x")
                .messageId("x")
                .build()

        val roundtrippedAgentTestingConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentTestingConfiguration),
                jacksonTypeRef<AgentTestingConfiguration>(),
            )

        assertThat(roundtrippedAgentTestingConfiguration).isEqualTo(agentTestingConfiguration)
    }
}
