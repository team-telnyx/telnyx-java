// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
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

internal class AgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponseFuture =
            agentServiceAsync.create(
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

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponseFuture = agentServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponseFuture =
            agentServiceAsync.update(
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

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponsesFuture =
            agentServiceAsync.list(
                AgentListParams.builder().brandId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()
            )

        val agentResponses = agentResponsesFuture.get()
        agentResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun launch() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponseFuture =
            agentServiceAsync.launch(
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

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCarrierApprovals() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val carrierApprovalResponsesFuture =
            agentServiceAsync.retrieveCarrierApprovals("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val carrierApprovalResponses = carrierApprovalResponsesFuture.get()
        carrierApprovalResponses.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val agentServiceAsync = client.rcs().agents()

        val agentResponseFuture = agentServiceAsync.submit("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val agentResponse = agentResponseFuture.get()
        agentResponse.validate()
    }
}
