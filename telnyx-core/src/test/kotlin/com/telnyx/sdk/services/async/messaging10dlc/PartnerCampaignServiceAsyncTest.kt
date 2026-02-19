// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging10dlc

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging10dlc.partnercampaigns.PartnerCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PartnerCampaignServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val partnerCampaignServiceAsync = client.messaging10dlc().partnerCampaigns()

        val telnyxDownstreamCampaignFuture = partnerCampaignServiceAsync.retrieve("campaignId")

        val telnyxDownstreamCampaign = telnyxDownstreamCampaignFuture.get()
        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val partnerCampaignServiceAsync = client.messaging10dlc().partnerCampaigns()

        val telnyxDownstreamCampaignFuture =
            partnerCampaignServiceAsync.update(
                PartnerCampaignUpdateParams.builder()
                    .campaignId("campaignId")
                    .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                    .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                    .build()
            )

        val telnyxDownstreamCampaign = telnyxDownstreamCampaignFuture.get()
        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val partnerCampaignServiceAsync = client.messaging10dlc().partnerCampaigns()

        val pageFuture = partnerCampaignServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSharedByMe() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val partnerCampaignServiceAsync = client.messaging10dlc().partnerCampaigns()

        val pageFuture = partnerCampaignServiceAsync.listSharedByMe()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSharingStatus() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val partnerCampaignServiceAsync = client.messaging10dlc().partnerCampaigns()

        val responseFuture = partnerCampaignServiceAsync.retrieveSharingStatus("campaignId")

        val response = responseFuture.get()
        response.validate()
    }
}
