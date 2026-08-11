// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentLaunchParamsTest {

    @Test
    fun create() {
        AgentLaunchParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .campaign(
                AgentLaunchParams.Campaign.builder()
                    .companyOverview("Acme provides online retail services.")
                    .additionalInformation("x")
                    .agentOverview("The agent sends order confirmations and delivery updates.")
                    .consentSettings(
                        AgentConsentConfiguration.builder()
                            .callToAction("Select RCS updates during checkout.")
                            .doubleOptIn(false)
                            .helpResponse("Contact support@example.com for help.")
                            .optInMessage("You are subscribed to Acme order updates.")
                            .addOptInMethod(
                                AgentConsentConfiguration.OptInMethod.builder()
                                    .methodType(
                                        AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                    )
                                    .description("x")
                                    .build()
                            )
                            .optOutResponse("You will receive no more messages.")
                            .callToActionMediaUrl("https://www.example.com/rcs/opt-in.png")
                            .callToActionUrl("https://www.example.com/checkout")
                            .doubleOptInMessage("x")
                            .build()
                    )
                    .addInteraction(
                        AgentInteraction.builder()
                            .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                            .description("x")
                            .build()
                    )
                    .messageExamples(
                        listOf(
                            "Your Acme order is confirmed.",
                            "Your Acme order has shipped.",
                            "Your Acme order was delivered.",
                        )
                    )
                    .build()
            )
            .testing(
                AgentTestingConfiguration.builder()
                    .testUrl("https://www.example.com/rcs/test-video")
                    .additionalInformation(
                        "Demonstrates START, STOP, HELP, and an order-status interaction."
                    )
                    .messageId("x")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentLaunchParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .campaign(
                    AgentLaunchParams.Campaign.builder()
                        .companyOverview("Acme provides online retail services.")
                        .agentOverview("The agent sends order confirmations and delivery updates.")
                        .consentSettings(
                            AgentConsentConfiguration.builder()
                                .callToAction("Select RCS updates during checkout.")
                                .doubleOptIn(false)
                                .helpResponse("Contact support@example.com for help.")
                                .optInMessage("You are subscribed to Acme order updates.")
                                .addOptInMethod(
                                    AgentConsentConfiguration.OptInMethod.builder()
                                        .methodType(
                                            AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                        )
                                        .build()
                                )
                                .optOutResponse("You will receive no more messages.")
                                .build()
                        )
                        .addInteraction(
                            AgentInteraction.builder()
                                .interactionType(
                                    AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
                                )
                                .build()
                        )
                        .messageExamples(
                            listOf(
                                "Your Acme order is confirmed.",
                                "Your Acme order has shipped.",
                                "Your Acme order was delivered.",
                            )
                        )
                        .build()
                )
                .testing(
                    AgentTestingConfiguration.builder()
                        .testUrl("https://www.example.com/rcs/test-video")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentLaunchParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .campaign(
                    AgentLaunchParams.Campaign.builder()
                        .companyOverview("Acme provides online retail services.")
                        .additionalInformation("x")
                        .agentOverview("The agent sends order confirmations and delivery updates.")
                        .consentSettings(
                            AgentConsentConfiguration.builder()
                                .callToAction("Select RCS updates during checkout.")
                                .doubleOptIn(false)
                                .helpResponse("Contact support@example.com for help.")
                                .optInMessage("You are subscribed to Acme order updates.")
                                .addOptInMethod(
                                    AgentConsentConfiguration.OptInMethod.builder()
                                        .methodType(
                                            AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                        )
                                        .description("x")
                                        .build()
                                )
                                .optOutResponse("You will receive no more messages.")
                                .callToActionMediaUrl("https://www.example.com/rcs/opt-in.png")
                                .callToActionUrl("https://www.example.com/checkout")
                                .doubleOptInMessage("x")
                                .build()
                        )
                        .addInteraction(
                            AgentInteraction.builder()
                                .interactionType(
                                    AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
                                )
                                .description("x")
                                .build()
                        )
                        .messageExamples(
                            listOf(
                                "Your Acme order is confirmed.",
                                "Your Acme order has shipped.",
                                "Your Acme order was delivered.",
                            )
                        )
                        .build()
                )
                .testing(
                    AgentTestingConfiguration.builder()
                        .testUrl("https://www.example.com/rcs/test-video")
                        .additionalInformation(
                            "Demonstrates START, STOP, HELP, and an order-status interaction."
                        )
                        .messageId("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.campaign())
            .isEqualTo(
                AgentLaunchParams.Campaign.builder()
                    .companyOverview("Acme provides online retail services.")
                    .additionalInformation("x")
                    .agentOverview("The agent sends order confirmations and delivery updates.")
                    .consentSettings(
                        AgentConsentConfiguration.builder()
                            .callToAction("Select RCS updates during checkout.")
                            .doubleOptIn(false)
                            .helpResponse("Contact support@example.com for help.")
                            .optInMessage("You are subscribed to Acme order updates.")
                            .addOptInMethod(
                                AgentConsentConfiguration.OptInMethod.builder()
                                    .methodType(
                                        AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                    )
                                    .description("x")
                                    .build()
                            )
                            .optOutResponse("You will receive no more messages.")
                            .callToActionMediaUrl("https://www.example.com/rcs/opt-in.png")
                            .callToActionUrl("https://www.example.com/checkout")
                            .doubleOptInMessage("x")
                            .build()
                    )
                    .addInteraction(
                        AgentInteraction.builder()
                            .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                            .description("x")
                            .build()
                    )
                    .messageExamples(
                        listOf(
                            "Your Acme order is confirmed.",
                            "Your Acme order has shipped.",
                            "Your Acme order was delivered.",
                        )
                    )
                    .build()
            )
        assertThat(body.testing())
            .isEqualTo(
                AgentTestingConfiguration.builder()
                    .testUrl("https://www.example.com/rcs/test-video")
                    .additionalInformation(
                        "Demonstrates START, STOP, HELP, and an order-status interaction."
                    )
                    .messageId("x")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentLaunchParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .campaign(
                    AgentLaunchParams.Campaign.builder()
                        .companyOverview("Acme provides online retail services.")
                        .agentOverview("The agent sends order confirmations and delivery updates.")
                        .consentSettings(
                            AgentConsentConfiguration.builder()
                                .callToAction("Select RCS updates during checkout.")
                                .doubleOptIn(false)
                                .helpResponse("Contact support@example.com for help.")
                                .optInMessage("You are subscribed to Acme order updates.")
                                .addOptInMethod(
                                    AgentConsentConfiguration.OptInMethod.builder()
                                        .methodType(
                                            AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                        )
                                        .build()
                                )
                                .optOutResponse("You will receive no more messages.")
                                .build()
                        )
                        .addInteraction(
                            AgentInteraction.builder()
                                .interactionType(
                                    AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
                                )
                                .build()
                        )
                        .messageExamples(
                            listOf(
                                "Your Acme order is confirmed.",
                                "Your Acme order has shipped.",
                                "Your Acme order was delivered.",
                            )
                        )
                        .build()
                )
                .testing(
                    AgentTestingConfiguration.builder()
                        .testUrl("https://www.example.com/rcs/test-video")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.campaign())
            .isEqualTo(
                AgentLaunchParams.Campaign.builder()
                    .companyOverview("Acme provides online retail services.")
                    .agentOverview("The agent sends order confirmations and delivery updates.")
                    .consentSettings(
                        AgentConsentConfiguration.builder()
                            .callToAction("Select RCS updates during checkout.")
                            .doubleOptIn(false)
                            .helpResponse("Contact support@example.com for help.")
                            .optInMessage("You are subscribed to Acme order updates.")
                            .addOptInMethod(
                                AgentConsentConfiguration.OptInMethod.builder()
                                    .methodType(
                                        AgentConsentConfiguration.OptInMethod.MethodType.WEBSITE
                                    )
                                    .build()
                            )
                            .optOutResponse("You will receive no more messages.")
                            .build()
                    )
                    .addInteraction(
                        AgentInteraction.builder()
                            .interactionType(AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES)
                            .build()
                    )
                    .messageExamples(
                        listOf(
                            "Your Acme order is confirmed.",
                            "Your Acme order has shipped.",
                            "Your Acme order was delivered.",
                        )
                    )
                    .build()
            )
        assertThat(body.testing())
            .isEqualTo(
                AgentTestingConfiguration.builder()
                    .testUrl("https://www.example.com/rcs/test-video")
                    .build()
            )
    }
}
