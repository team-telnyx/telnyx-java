// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val telnyxCampaignCsp = campaignService.retrieve("campaignId")

        telnyxCampaignCsp.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

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
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val page = campaignService.list(CampaignListParams.builder().brandId("brandId").build())

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun acceptSharing() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response = campaignService.acceptSharing("C26F1KLZN")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun deactivate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response = campaignService.deactivate("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getMnoMetadata() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response = campaignService.getMnoMetadata("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getOperationStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response = campaignService.getOperationStatus("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getSharingStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response = campaignService.getSharingStatus("campaignId")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun submitAppeal() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val campaignService = client.messaging10dlc().campaign()

        val response =
            campaignService.submitAppeal(
                CampaignSubmitAppealParams.builder()
                    .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
                    .appealReason(
                        "The website has been updated to include the required privacy policy and terms of service."
                    )
                    .build()
            )

        response.validate()
    }
}
