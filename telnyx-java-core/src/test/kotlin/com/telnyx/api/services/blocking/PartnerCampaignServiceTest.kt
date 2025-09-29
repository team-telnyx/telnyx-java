// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PartnerCampaignServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignService = client.partnerCampaigns()

        val telnyxDownstreamCampaign = partnerCampaignService.retrieve("campaignId")

        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignService = client.partnerCampaigns()

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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignService = client.partnerCampaigns()

        val partnerCampaigns =
            partnerCampaignService.list(
                PartnerCampaignListParams.builder()
                    .page(0L)
                    .recordsPerPage(0L)
                    .sort(PartnerCampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
                    .build()
            )

        partnerCampaigns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSharedByMe() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignService = client.partnerCampaigns()

        val response =
            partnerCampaignService.listSharedByMe(
                PartnerCampaignListSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSharingStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignService = client.partnerCampaigns()

        val response = partnerCampaignService.retrieveSharingStatus("campaignId")

        response.validate()
    }
}
