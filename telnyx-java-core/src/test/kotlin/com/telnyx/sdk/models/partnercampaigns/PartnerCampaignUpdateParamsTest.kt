// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.partnercampaigns

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignUpdateParamsTest {

    @Test
    fun create() {
        PartnerCampaignUpdateParams.builder()
            .campaignId("campaignId")
            .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
            .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
            .build()
    }

    @Test
    fun pathParams() {
        val params = PartnerCampaignUpdateParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PartnerCampaignUpdateParams.builder()
                .campaignId("campaignId")
                .webhookFailoverUrl("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
                .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                .build()

        val body = params._body()

        assertThat(body.webhookFailoverUrl())
            .contains("https://webhook.com/9010a453-4df8-4be6-a551-1070892888d6")
        assertThat(body.webhookUrl())
            .contains("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PartnerCampaignUpdateParams.builder().campaignId("campaignId").build()

        val body = params._body()
    }
}
