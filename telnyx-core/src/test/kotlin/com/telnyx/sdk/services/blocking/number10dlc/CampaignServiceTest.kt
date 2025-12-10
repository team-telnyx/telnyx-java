// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.campaign.CampaignAppealParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.number10dlc.campaign.CampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val telnyxCampaignCsp = campaignService.retrieve("campaignId")

        telnyxCampaignCsp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val telnyxCampaignCsp =
            campaignService.update(
                CampaignUpdateParams.builder()
                    .campaignId("campaignId")
                    .autoRenewal(true)
                    .helpMessage("helpMessage")
                    .messageFlow("messageFlow")
                    .resellerId("resellerId")
                    .sample1("sample1")
                    .sample2("sample2")
                    .sample3("sample3")
                    .sample4("sample4")
                    .sample5("sample5")
                    .webhookFailoverUrl("webhookFailoverURL")
                    .webhookUrl("webhookURL")
                    .build()
            )

        telnyxCampaignCsp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val campaigns =
            campaignService.list(
                CampaignListParams.builder()
                    .brandId("brandId")
                    .page(0L)
                    .recordsPerPage(0L)
                    .sort(CampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
                    .build()
            )

        campaigns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val campaign = campaignService.delete("campaignId")

        campaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun appeal() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val response =
            campaignService.appeal(
                CampaignAppealParams.builder()
                    .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
                    .appealReason(
                        "The website has been updated to include the required privacy policy and terms of service."
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveMnoMetadata() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val response = campaignService.retrieveMnoMetadata("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveOperationStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val response = campaignService.retrieveOperationStatus("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSharing() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignService = client.number10dlc().campaign()

        val response = campaignService.retrieveSharing("campaignId")

        response.validate()
    }
}
