// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignListSharedByMeParams
import com.telnyx.api.models.partnercampaigns.PartnerCampaignUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PartnerCampaignServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignServiceAsync = client.partnerCampaigns()

        val telnyxDownstreamCampaignFuture = partnerCampaignServiceAsync.retrieve("campaignId")

        val telnyxDownstreamCampaign = telnyxDownstreamCampaignFuture.get()
        telnyxDownstreamCampaign.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignServiceAsync = client.partnerCampaigns()

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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignServiceAsync = client.partnerCampaigns()

        val partnerCampaignsFuture =
            partnerCampaignServiceAsync.list(
                PartnerCampaignListParams.builder()
                    .page(0L)
                    .recordsPerPage(0L)
                    .sort(PartnerCampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
                    .build()
            )

        val partnerCampaigns = partnerCampaignsFuture.get()
        partnerCampaigns.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listSharedByMe() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignServiceAsync = client.partnerCampaigns()

        val responseFuture =
            partnerCampaignServiceAsync.listSharedByMe(
                PartnerCampaignListSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveSharingStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val partnerCampaignServiceAsync = client.partnerCampaigns()

        val responseFuture = partnerCampaignServiceAsync.retrieveSharingStatus("campaignId")

        val response = responseFuture.get()
        response.validate()
    }
}
