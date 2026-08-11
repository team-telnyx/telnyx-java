// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rcs.agents.AgentCampaignConfiguration
import com.telnyx.sdk.models.rcs.agents.AgentConfiguration
import com.telnyx.sdk.models.rcs.agents.AgentConsentConfiguration
import com.telnyx.sdk.models.rcs.agents.AgentCreateParams
import com.telnyx.sdk.models.rcs.agents.AgentEmailContact
import com.telnyx.sdk.models.rcs.agents.AgentInteraction
import com.telnyx.sdk.models.rcs.agents.AgentLaunchParams
import com.telnyx.sdk.models.rcs.agents.AgentListParams
import com.telnyx.sdk.models.rcs.agents.AgentPhoneContact
import com.telnyx.sdk.models.rcs.agents.AgentTestingConfiguration
import com.telnyx.sdk.models.rcs.agents.AgentUpdateParams
import com.telnyx.sdk.models.rcs.agents.AgentUseCase
import com.telnyx.sdk.models.rcs.agents.AgentWebsiteContact
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponse =
            agentService.create(
                AgentCreateParams.builder()
                    .idempotencyKey("Idempotency-Key")
                    .brandId("11111111-1111-4111-8111-111111111111")
                    .configuration(
                        AgentConfiguration.builder()
                            .basics(
                                AgentConfiguration.Basics.UnionMember0.builder()
                                    .email(
                                        AgentEmailContact.builder()
                                            .address("support@example.com")
                                            .label("Support")
                                            .build()
                                    )
                                    .brandColor("#123456")
                                    .description("Order confirmations and delivery updates")
                                    .heroUrl("https://www.example.com/rcs/hero.png")
                                    .logoUrl("https://www.example.com/rcs/logo.png")
                                    .phoneNumber(
                                        AgentPhoneContact.builder()
                                            .label("x")
                                            .number("+49605132")
                                            .build()
                                    )
                                    .privacyPolicyUrl("https://www.example.com/privacy")
                                    .termsAndConditionsUrl("https://www.example.com/terms")
                                    .website(
                                        AgentWebsiteContact.builder()
                                            .label("x")
                                            .url("https://example.com")
                                            .build()
                                    )
                                    .build()
                            )
                            .campaign(
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
                                                    .methodType(
                                                        AgentConsentConfiguration.OptInMethod
                                                            .MethodType
                                                            .SMS
                                                    )
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
                                            .interactionType(
                                                AgentInteraction.InteractionType
                                                    .TRANSACTIONAL_UPDATES
                                            )
                                            .description("x")
                                            .build()
                                    )
                                    .addMessageExample("x")
                                    .build()
                            )
                            .testing(
                                AgentTestingConfiguration.builder()
                                    .testUrl("https://example.com")
                                    .additionalInformation("x")
                                    .messageId("x")
                                    .build()
                            )
                            .build()
                    )
                    .displayName("Acme Order Updates")
                    .useCase(AgentUseCase.TRANSACTIONAL)
                    .hostingRegion("hosting_region")
                    .profileId("profile_id")
                    .build()
            )

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponse = agentService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponse =
            agentService.update(
                AgentUpdateParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .configuration(
                        AgentConfiguration.builder()
                            .basics(
                                AgentConfiguration.Basics.UnionMember0.builder()
                                    .phoneNumber(
                                        AgentPhoneContact.builder()
                                            .label("x")
                                            .number("+49605132")
                                            .build()
                                    )
                                    .brandColor("#2FDCd1")
                                    .description("x")
                                    .email(
                                        AgentEmailContact.builder()
                                            .address("dev@stainless.com")
                                            .label("x")
                                            .build()
                                    )
                                    .heroUrl("https://example.com")
                                    .logoUrl("https://example.com")
                                    .privacyPolicyUrl("https://example.com")
                                    .termsAndConditionsUrl("https://example.com")
                                    .website(
                                        AgentWebsiteContact.builder()
                                            .label("x")
                                            .url("https://example.com")
                                            .build()
                                    )
                                    .build()
                            )
                            .campaign(
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
                                                    .methodType(
                                                        AgentConsentConfiguration.OptInMethod
                                                            .MethodType
                                                            .SMS
                                                    )
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
                                            .interactionType(
                                                AgentInteraction.InteractionType
                                                    .TRANSACTIONAL_UPDATES
                                            )
                                            .description("x")
                                            .build()
                                    )
                                    .addMessageExample("x")
                                    .build()
                            )
                            .testing(
                                AgentTestingConfiguration.builder()
                                    .testUrl("https://example.com")
                                    .additionalInformation("x")
                                    .messageId("x")
                                    .build()
                            )
                            .build()
                    )
                    .displayName("Acme Delivery Updates")
                    .hostingRegion("hosting_region")
                    .profileId("profile_id")
                    .useCase(AgentUseCase.MULTI_USE)
                    .build()
            )

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponses =
            agentService.list(
                AgentListParams.builder().brandId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )

        agentResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun launch() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponse =
            agentService.launch(
                AgentLaunchParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .campaign(
                        AgentLaunchParams.Campaign.builder()
                            .companyOverview("Acme provides online retail services.")
                            .additionalInformation("x")
                            .agentOverview(
                                "The agent sends order confirmations and delivery updates."
                            )
                            .consentSettings(
                                AgentConsentConfiguration.builder()
                                    .callToAction("Select RCS updates during checkout.")
                                    .doubleOptIn(false)
                                    .helpResponse("Contact support@example.com for help.")
                                    .optInMessage("You are subscribed to Acme order updates.")
                                    .addOptInMethod(
                                        AgentConsentConfiguration.OptInMethod.builder()
                                            .methodType(
                                                AgentConsentConfiguration.OptInMethod.MethodType
                                                    .WEBSITE
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
            )

        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCarrierApprovals() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val carrierApprovalResponses =
            agentService.retrieveCarrierApprovals("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        carrierApprovalResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.rcs().agents()

        val agentResponse = agentService.submit("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        agentResponse.validate()
    }
}
