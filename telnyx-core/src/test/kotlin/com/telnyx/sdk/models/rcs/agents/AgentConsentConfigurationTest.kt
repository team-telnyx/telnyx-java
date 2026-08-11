// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentConsentConfigurationTest {

    @Test
    fun create() {
        val agentConsentConfiguration =
            AgentConsentConfiguration.builder()
                .callToAction("x")
                .doubleOptIn(true)
                .helpResponse("x")
                .optInMessage("x")
                .addOptInMethod(
                    AgentConsentConfiguration.OptInMethod.builder()
                        .methodType(AgentConsentConfiguration.OptInMethod.MethodType.SMS)
                        .description("x")
                        .build()
                )
                .optOutResponse("x")
                .callToActionMediaUrl("https://example.com")
                .callToActionUrl("https://example.com")
                .doubleOptInMessage("x")
                .build()

        assertThat(agentConsentConfiguration.callToAction()).isEqualTo("x")
        assertThat(agentConsentConfiguration.doubleOptIn()).isEqualTo(true)
        assertThat(agentConsentConfiguration.helpResponse()).isEqualTo("x")
        assertThat(agentConsentConfiguration.optInMessage()).isEqualTo("x")
        assertThat(agentConsentConfiguration.optInMethods())
            .containsExactly(
                AgentConsentConfiguration.OptInMethod.builder()
                    .methodType(AgentConsentConfiguration.OptInMethod.MethodType.SMS)
                    .description("x")
                    .build()
            )
        assertThat(agentConsentConfiguration.optOutResponse()).isEqualTo("x")
        assertThat(agentConsentConfiguration.callToActionMediaUrl()).contains("https://example.com")
        assertThat(agentConsentConfiguration.callToActionUrl()).contains("https://example.com")
        assertThat(agentConsentConfiguration.doubleOptInMessage()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentConsentConfiguration =
            AgentConsentConfiguration.builder()
                .callToAction("x")
                .doubleOptIn(true)
                .helpResponse("x")
                .optInMessage("x")
                .addOptInMethod(
                    AgentConsentConfiguration.OptInMethod.builder()
                        .methodType(AgentConsentConfiguration.OptInMethod.MethodType.SMS)
                        .description("x")
                        .build()
                )
                .optOutResponse("x")
                .callToActionMediaUrl("https://example.com")
                .callToActionUrl("https://example.com")
                .doubleOptInMessage("x")
                .build()

        val roundtrippedAgentConsentConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentConsentConfiguration),
                jacksonTypeRef<AgentConsentConfiguration>(),
            )

        assertThat(roundtrippedAgentConsentConfiguration).isEqualTo(agentConsentConfiguration)
    }
}
