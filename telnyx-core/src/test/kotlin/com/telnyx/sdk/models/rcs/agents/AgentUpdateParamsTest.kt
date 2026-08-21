// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentUpdateParamsTest {

    @Test
    fun create() {
        AgentUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .configuration(
                AgentConfiguration.builder()
                    .basics(
                        AgentConfiguration.Basics.AgentPhoneContactRequirement.builder()
                            .phoneNumber(
                                AgentPhoneContact.builder().label("x").number("+49605132").build()
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
                                                AgentConsentConfiguration.OptInMethod.MethodType.SMS
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
                                        AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
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
    }

    @Test
    fun pathParams() {
        val params = AgentUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AgentUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .configuration(
                    AgentConfiguration.builder()
                        .basics(
                            AgentConfiguration.Basics.AgentPhoneContactRequirement.builder()
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
                                                    AgentConsentConfiguration.OptInMethod.MethodType
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
                                            AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
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

        val body = params._body()

        assertThat(body.configuration())
            .contains(
                AgentConfiguration.builder()
                    .basics(
                        AgentConfiguration.Basics.AgentPhoneContactRequirement.builder()
                            .phoneNumber(
                                AgentPhoneContact.builder().label("x").number("+49605132").build()
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
                                                AgentConsentConfiguration.OptInMethod.MethodType.SMS
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
                                        AgentInteraction.InteractionType.TRANSACTIONAL_UPDATES
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
        assertThat(body.displayName()).contains("Acme Delivery Updates")
        assertThat(body.hostingRegion()).contains("hosting_region")
        assertThat(body.profileId()).contains("profile_id")
        assertThat(body.useCase()).contains(AgentUseCase.MULTI_USE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = AgentUpdateParams.builder().id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e").build()

        val body = params._body()
    }
}
