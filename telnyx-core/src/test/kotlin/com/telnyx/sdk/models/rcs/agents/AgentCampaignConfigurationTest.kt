// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCampaignConfigurationTest {

    @Test
    fun create() {
        val agentCampaignConfiguration =
            AgentCampaignConfiguration.builder()
                .companyOverview("x")
                .additionalInformation("x")
                .agentOverview("x")
                .consentSettings(
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
                )
                .addInteraction(
                    AgentInteraction.builder()
                        .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                        .description("x")
                        .build()
                )
                .addMessageExample("x")
                .build()

        assertThat(agentCampaignConfiguration.companyOverview()).isEqualTo("x")
        assertThat(agentCampaignConfiguration.additionalInformation()).contains("x")
        assertThat(agentCampaignConfiguration.agentOverview()).contains("x")
        assertThat(agentCampaignConfiguration.consentSettings())
            .contains(
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
            )
        assertThat(agentCampaignConfiguration.interactions().getOrNull())
            .containsExactly(
                AgentInteraction.builder()
                    .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                    .description("x")
                    .build()
            )
        assertThat(agentCampaignConfiguration.messageExamples().getOrNull()).containsExactly("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agentCampaignConfiguration =
            AgentCampaignConfiguration.builder()
                .companyOverview("x")
                .additionalInformation("x")
                .agentOverview("x")
                .consentSettings(
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
                )
                .addInteraction(
                    AgentInteraction.builder()
                        .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                        .description("x")
                        .build()
                )
                .addMessageExample("x")
                .build()

        val roundtrippedAgentCampaignConfiguration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agentCampaignConfiguration),
                jacksonTypeRef<AgentCampaignConfiguration>(),
            )

        assertThat(roundtrippedAgentCampaignConfiguration).isEqualTo(agentCampaignConfiguration)
    }
}
