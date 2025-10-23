// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.campaignbuilder

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.campaign.TelnyxCampaignCsp
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignBuilderCreateResponseTest {

    @Test
    fun ofJsonValue() {
        val jsonValue = JsonValue.from(mapOf<String, Any>())

        val campaignBuilderCreateResponse = CampaignBuilderCreateResponse.ofJsonValue(jsonValue)

        assertThat(campaignBuilderCreateResponse.jsonValue()).contains(jsonValue)
        assertThat(campaignBuilderCreateResponse.telnyxCampaignCsp()).isEmpty
    }

    @Test
    fun ofJsonValueRoundtrip() {
        val jsonMapper = jsonMapper()
        val campaignBuilderCreateResponse =
            CampaignBuilderCreateResponse.ofJsonValue(JsonValue.from(mapOf<String, Any>()))

        val roundtrippedCampaignBuilderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignBuilderCreateResponse),
                jacksonTypeRef<CampaignBuilderCreateResponse>(),
            )

        assertThat(roundtrippedCampaignBuilderCreateResponse)
            .isEqualTo(campaignBuilderCreateResponse)
    }

    @Test
    fun ofTelnyxCampaignCsp() {
        val telnyxCampaignCsp =
            TelnyxCampaignCsp.builder()
                .brandId("d2ca9d69-641b-4131-83fa-5d0744f4c8a9")
                .campaignId("823d6b1a-6ed6-41a3-9c50-c8ff41b682ba")
                .cspId("cspId")
                .description("description")
                .mock(true)
                .addSubUsecase("string")
                .termsAndConditions(true)
                .usecase("usecase")
                .ageGated(true)
                .autoRenewal(true)
                .billedDate("billedDate")
                .brandDisplayName("ABC Mobile")
                .campaignStatus(TelnyxCampaignCsp.CampaignStatus.TCR_ACCEPTED)
                .createDate("createDate")
                .directLending(true)
                .embeddedLink(true)
                .embeddedLinkSample("embeddedLinkSample")
                .embeddedPhone(true)
                .failureReasons("failureReasons")
                .helpKeywords("helpKeywords")
                .helpMessage("helpMessage")
                .isTMobileNumberPoolingEnabled(true)
                .isTMobileRegistered(true)
                .isTMobileSuspended(true)
                .messageFlow("messageFlow")
                .nextRenewalOrExpirationDate("nextRenewalOrExpirationDate")
                .numberPool(true)
                .optinKeywords("optinKeywords")
                .optinMessage("optinMessage")
                .optoutKeywords("optoutKeywords")
                .optoutMessage("optoutMessage")
                .privacyPolicyLink("privacyPolicyLink")
                .referenceId("referenceId")
                .resellerId("resellerId")
                .sample1("sample1")
                .sample2("sample2")
                .sample3("sample3")
                .sample4("sample4")
                .sample5("sample5")
                .status("status")
                .submissionStatus(TelnyxCampaignCsp.SubmissionStatus.CREATED)
                .subscriberHelp(true)
                .subscriberOptin(true)
                .subscriberOptout(true)
                .tcrBrandId("BBRAND1")
                .tcrCampaignId("CCAMP1")
                .termsAndConditionsLink("termsAndConditionsLink")
                .vertical("vertical")
                .webhookFailoverUrl("https://example.com/failover-webhook")
                .webhookUrl("https://example.com/webhook")
                .build()

        val campaignBuilderCreateResponse =
            CampaignBuilderCreateResponse.ofTelnyxCampaignCsp(telnyxCampaignCsp)

        assertThat(campaignBuilderCreateResponse.jsonValue()).isEmpty
        assertThat(campaignBuilderCreateResponse.telnyxCampaignCsp()).contains(telnyxCampaignCsp)
    }

    @Test
    fun ofTelnyxCampaignCspRoundtrip() {
        val jsonMapper = jsonMapper()
        val campaignBuilderCreateResponse =
            CampaignBuilderCreateResponse.ofTelnyxCampaignCsp(
                TelnyxCampaignCsp.builder()
                    .brandId("d2ca9d69-641b-4131-83fa-5d0744f4c8a9")
                    .campaignId("823d6b1a-6ed6-41a3-9c50-c8ff41b682ba")
                    .cspId("cspId")
                    .description("description")
                    .mock(true)
                    .addSubUsecase("string")
                    .termsAndConditions(true)
                    .usecase("usecase")
                    .ageGated(true)
                    .autoRenewal(true)
                    .billedDate("billedDate")
                    .brandDisplayName("ABC Mobile")
                    .campaignStatus(TelnyxCampaignCsp.CampaignStatus.TCR_ACCEPTED)
                    .createDate("createDate")
                    .directLending(true)
                    .embeddedLink(true)
                    .embeddedLinkSample("embeddedLinkSample")
                    .embeddedPhone(true)
                    .failureReasons("failureReasons")
                    .helpKeywords("helpKeywords")
                    .helpMessage("helpMessage")
                    .isTMobileNumberPoolingEnabled(true)
                    .isTMobileRegistered(true)
                    .isTMobileSuspended(true)
                    .messageFlow("messageFlow")
                    .nextRenewalOrExpirationDate("nextRenewalOrExpirationDate")
                    .numberPool(true)
                    .optinKeywords("optinKeywords")
                    .optinMessage("optinMessage")
                    .optoutKeywords("optoutKeywords")
                    .optoutMessage("optoutMessage")
                    .privacyPolicyLink("privacyPolicyLink")
                    .referenceId("referenceId")
                    .resellerId("resellerId")
                    .sample1("sample1")
                    .sample2("sample2")
                    .sample3("sample3")
                    .sample4("sample4")
                    .sample5("sample5")
                    .status("status")
                    .submissionStatus(TelnyxCampaignCsp.SubmissionStatus.CREATED)
                    .subscriberHelp(true)
                    .subscriberOptin(true)
                    .subscriberOptout(true)
                    .tcrBrandId("BBRAND1")
                    .tcrCampaignId("CCAMP1")
                    .termsAndConditionsLink("termsAndConditionsLink")
                    .vertical("vertical")
                    .webhookFailoverUrl("https://example.com/failover-webhook")
                    .webhookUrl("https://example.com/webhook")
                    .build()
            )

        val roundtrippedCampaignBuilderCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignBuilderCreateResponse),
                jacksonTypeRef<CampaignBuilderCreateResponse>(),
            )

        assertThat(roundtrippedCampaignBuilderCreateResponse)
            .isEqualTo(campaignBuilderCreateResponse)
    }
}
