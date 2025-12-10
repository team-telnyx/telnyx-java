// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.partnercampaigns.TelnyxDownstreamCampaign
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListResponseTest {

    @Test
    fun create() {
        val partnerCampaignListResponse =
            PartnerCampaignListResponse.builder()
                .page(0L)
                .addRecord(
                    TelnyxDownstreamCampaign.builder()
                        .tcrBrandId("BBRAND1")
                        .tcrCampaignId("CCAMP1")
                        .ageGated(true)
                        .assignedPhoneNumbersCount(3.0)
                        .brandDisplayName("ABC Mobile")
                        .campaignStatus(TelnyxDownstreamCampaign.CampaignStatus.TCR_ACCEPTED)
                        .createdAt("2021-03-08T17:57:48.801186")
                        .description("description")
                        .directLending(true)
                        .embeddedLink(true)
                        .embeddedLinkSample("embeddedLinkSample")
                        .embeddedPhone(true)
                        .failureReasons("failureReasons")
                        .helpKeywords("helpKeywords")
                        .helpMessage("helpMessage")
                        .isNumberPoolingEnabled(true)
                        .messageFlow("messageFlow")
                        .numberPool(true)
                        .optinKeywords("optinKeywords")
                        .optinMessage("optinMessage")
                        .optoutKeywords("optoutKeywords")
                        .optoutMessage("optoutMessage")
                        .privacyPolicyLink("privacyPolicyLink")
                        .sample1("sample1")
                        .sample2("sample2")
                        .sample3("sample3")
                        .sample4("sample4")
                        .sample5("sample5")
                        .subscriberOptin(true)
                        .subscriberOptout(true)
                        .addSubUsecase("string")
                        .termsAndConditions(true)
                        .termsAndConditionsLink("termsAndConditionsLink")
                        .updatedAt("2021-03-08T17:57:48.801186")
                        .usecase("usecase")
                        .webhookFailoverUrl("https://example.com/failover-webhook")
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .totalRecords(0L)
                .build()

        assertThat(partnerCampaignListResponse.page()).contains(0L)
        assertThat(partnerCampaignListResponse.records().getOrNull())
            .containsExactly(
                TelnyxDownstreamCampaign.builder()
                    .tcrBrandId("BBRAND1")
                    .tcrCampaignId("CCAMP1")
                    .ageGated(true)
                    .assignedPhoneNumbersCount(3.0)
                    .brandDisplayName("ABC Mobile")
                    .campaignStatus(TelnyxDownstreamCampaign.CampaignStatus.TCR_ACCEPTED)
                    .createdAt("2021-03-08T17:57:48.801186")
                    .description("description")
                    .directLending(true)
                    .embeddedLink(true)
                    .embeddedLinkSample("embeddedLinkSample")
                    .embeddedPhone(true)
                    .failureReasons("failureReasons")
                    .helpKeywords("helpKeywords")
                    .helpMessage("helpMessage")
                    .isNumberPoolingEnabled(true)
                    .messageFlow("messageFlow")
                    .numberPool(true)
                    .optinKeywords("optinKeywords")
                    .optinMessage("optinMessage")
                    .optoutKeywords("optoutKeywords")
                    .optoutMessage("optoutMessage")
                    .privacyPolicyLink("privacyPolicyLink")
                    .sample1("sample1")
                    .sample2("sample2")
                    .sample3("sample3")
                    .sample4("sample4")
                    .sample5("sample5")
                    .subscriberOptin(true)
                    .subscriberOptout(true)
                    .addSubUsecase("string")
                    .termsAndConditions(true)
                    .termsAndConditionsLink("termsAndConditionsLink")
                    .updatedAt("2021-03-08T17:57:48.801186")
                    .usecase("usecase")
                    .webhookFailoverUrl("https://example.com/failover-webhook")
                    .webhookUrl("https://example.com/webhook")
                    .build()
            )
        assertThat(partnerCampaignListResponse.totalRecords()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignListResponse =
            PartnerCampaignListResponse.builder()
                .page(0L)
                .addRecord(
                    TelnyxDownstreamCampaign.builder()
                        .tcrBrandId("BBRAND1")
                        .tcrCampaignId("CCAMP1")
                        .ageGated(true)
                        .assignedPhoneNumbersCount(3.0)
                        .brandDisplayName("ABC Mobile")
                        .campaignStatus(TelnyxDownstreamCampaign.CampaignStatus.TCR_ACCEPTED)
                        .createdAt("2021-03-08T17:57:48.801186")
                        .description("description")
                        .directLending(true)
                        .embeddedLink(true)
                        .embeddedLinkSample("embeddedLinkSample")
                        .embeddedPhone(true)
                        .failureReasons("failureReasons")
                        .helpKeywords("helpKeywords")
                        .helpMessage("helpMessage")
                        .isNumberPoolingEnabled(true)
                        .messageFlow("messageFlow")
                        .numberPool(true)
                        .optinKeywords("optinKeywords")
                        .optinMessage("optinMessage")
                        .optoutKeywords("optoutKeywords")
                        .optoutMessage("optoutMessage")
                        .privacyPolicyLink("privacyPolicyLink")
                        .sample1("sample1")
                        .sample2("sample2")
                        .sample3("sample3")
                        .sample4("sample4")
                        .sample5("sample5")
                        .subscriberOptin(true)
                        .subscriberOptout(true)
                        .addSubUsecase("string")
                        .termsAndConditions(true)
                        .termsAndConditionsLink("termsAndConditionsLink")
                        .updatedAt("2021-03-08T17:57:48.801186")
                        .usecase("usecase")
                        .webhookFailoverUrl("https://example.com/failover-webhook")
                        .webhookUrl("https://example.com/webhook")
                        .build()
                )
                .totalRecords(0L)
                .build()

        val roundtrippedPartnerCampaignListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignListResponse),
                jacksonTypeRef<PartnerCampaignListResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignListResponse).isEqualTo(partnerCampaignListResponse)
    }
}
