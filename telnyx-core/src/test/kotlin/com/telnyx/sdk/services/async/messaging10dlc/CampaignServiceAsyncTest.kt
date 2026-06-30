// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignListParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignSubmitAppealParams
import com.telnyx.sdk.models.messaging10dlc.campaign.CampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CampaignServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val telnyxCampaignCspFuture = campaignServiceAsync.retrieve("campaignId")

        val telnyxCampaignCsp = telnyxCampaignCspFuture.get()
        telnyxCampaignCsp.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val telnyxCampaignCspFuture =
            campaignServiceAsync.update(
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

        val telnyxCampaignCsp = telnyxCampaignCspFuture.get()
        telnyxCampaignCsp.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val pageFuture =
            campaignServiceAsync.list(CampaignListParams.builder().brandId("brandId").build())

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun acceptSharing() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture = campaignServiceAsync.acceptSharing("C26F1KLZN")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun deactivate() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture = campaignServiceAsync.deactivate("campaignId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getMnoMetadata() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture = campaignServiceAsync.getMnoMetadata("campaignId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getOperationStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture = campaignServiceAsync.getOperationStatus("campaignId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun getSharingStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture = campaignServiceAsync.getSharingStatus("campaignId")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun submitAppeal() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val campaignServiceAsync = client.messaging10dlc().campaign()

        val responseFuture =
            campaignServiceAsync.submitAppeal(
                CampaignSubmitAppealParams.builder()
                    .campaignId("5eb13888-32b7-4cab-95e6-d834dde21d64")
                    .appealReason(
                        "The website has been updated to include the required privacy policy and terms of service."
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
