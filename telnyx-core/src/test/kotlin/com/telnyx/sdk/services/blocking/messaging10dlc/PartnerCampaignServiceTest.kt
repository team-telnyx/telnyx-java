// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging10dlc.partnercampaigns.PartnerCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PartnerCampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val partnerCampaignService = client.messaging10dlc().partnerCampaigns()

        val telnyxDownstreamCampaign = partnerCampaignService.retrieve("campaignId")

        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val partnerCampaignService = client.messaging10dlc().partnerCampaigns()

        val telnyxDownstreamCampaign =
            partnerCampaignService.update(
                PartnerCampaignUpdateParams.builder()
                    .campaignId("campaignId")
                    .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                    .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                    .build()
            )

        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val partnerCampaignService = client.messaging10dlc().partnerCampaigns()

        val page = partnerCampaignService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSharedByMe() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val partnerCampaignService = client.messaging10dlc().partnerCampaigns()

        val page = partnerCampaignService.listSharedByMe()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSharingStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val partnerCampaignService = client.messaging10dlc().partnerCampaigns()

        val response = partnerCampaignService.retrieveSharingStatus("campaignId")

        response.validate()
    }
}
