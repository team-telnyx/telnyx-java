// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.agents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentCreateParamsTest {

    @Test
    fun create() {
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
                                AgentPhoneContact.builder().label("x").number("+49605132").build()
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
            .displayName("Acme Order Updates")
            .useCase(AgentUseCase.TRANSACTIONAL)
            .hostingRegion("hosting_region")
            .profileId("profile_id")
            .build()
    }

    @Test
    fun headers() {
        val params =
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
                .displayName("Acme Order Updates")
                .useCase(AgentUseCase.TRANSACTIONAL)
                .hostingRegion("hosting_region")
                .profileId("profile_id")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .brandId("11111111-1111-4111-8111-111111111111")
                .configuration(
                    AgentConfiguration.builder()
                        .basics(
                            AgentConfiguration.Basics.UnionMember2.builder()
                                .email(
                                    AgentEmailContact.builder()
                                        .address("support@example.com")
                                        .label("Support")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .displayName("Acme Order Updates")
                .useCase(AgentUseCase.TRANSACTIONAL)
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "Idempotency-Key")
                    .build()
            )
    }

    @Test
    fun body() {
        val params =
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
                .displayName("Acme Order Updates")
                .useCase(AgentUseCase.TRANSACTIONAL)
                .hostingRegion("hosting_region")
                .profileId("profile_id")
                .build()

        val body = params._body()

        assertThat(body.brandId()).isEqualTo("11111111-1111-4111-8111-111111111111")
        assertThat(body.configuration())
            .isEqualTo(
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
                                AgentPhoneContact.builder().label("x").number("+49605132").build()
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
        assertThat(body.displayName()).isEqualTo("Acme Order Updates")
        assertThat(body.useCase()).isEqualTo(AgentUseCase.TRANSACTIONAL)
        assertThat(body.hostingRegion()).contains("hosting_region")
        assertThat(body.profileId()).contains("profile_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AgentCreateParams.builder()
                .idempotencyKey("Idempotency-Key")
                .brandId("11111111-1111-4111-8111-111111111111")
                .configuration(
                    AgentConfiguration.builder()
                        .basics(
                            AgentConfiguration.Basics.UnionMember2.builder()
                                .email(
                                    AgentEmailContact.builder()
                                        .address("support@example.com")
                                        .label("Support")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .displayName("Acme Order Updates")
                .useCase(AgentUseCase.TRANSACTIONAL)
                .build()

        val body = params._body()

        assertThat(body.brandId()).isEqualTo("11111111-1111-4111-8111-111111111111")
        assertThat(body.configuration())
            .isEqualTo(
                AgentConfiguration.builder()
                    .basics(
                        AgentConfiguration.Basics.UnionMember2.builder()
                            .email(
                                AgentEmailContact.builder()
                                    .address("support@example.com")
                                    .label("Support")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.displayName()).isEqualTo("Acme Order Updates")
        assertThat(body.useCase()).isEqualTo(AgentUseCase.TRANSACTIONAL)
    }
}
