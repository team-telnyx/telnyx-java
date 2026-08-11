// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.campaign

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignUpdateParamsTest {

    @Test
    fun create() {
        CampaignUpdateParams.builder()
            .campaignId("campaignId")
            .autoRenewal(true)
            .helpMessage("Helpmessage")
            .messageFlow("Messageflow")
            .resellerId("RESELLER")
            .sample1("Sample1")
            .sample2("Sample2")
            .sample3("Sample3")
            .sample4("Sample4")
            .sample5("Sample5")
            .webhookFailoverUrl("WebhookURL")
            .webhookUrl("WebhookURL")
            .build()
    }

    @Test
    fun pathParams() {
        val params = CampaignUpdateParams.builder().campaignId("campaignId").build()

        assertThat(params._pathParam(0)).isEqualTo("campaignId")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CampaignUpdateParams.builder()
                .campaignId("campaignId")
                .autoRenewal(true)
                .helpMessage("Helpmessage")
                .messageFlow("Messageflow")
                .resellerId("RESELLER")
                .sample1("Sample1")
                .sample2("Sample2")
                .sample3("Sample3")
                .sample4("Sample4")
                .sample5("Sample5")
                .webhookFailoverUrl("WebhookURL")
                .webhookUrl("WebhookURL")
                .build()

        val body = params._body()

        assertThat(body.autoRenewal()).contains(true)
        assertThat(body.helpMessage()).contains("Helpmessage")
        assertThat(body.messageFlow()).contains("Messageflow")
        assertThat(body.resellerId()).contains("RESELLER")
        assertThat(body.sample1()).contains("Sample1")
        assertThat(body.sample2()).contains("Sample2")
        assertThat(body.sample3()).contains("Sample3")
        assertThat(body.sample4()).contains("Sample4")
        assertThat(body.sample5()).contains("Sample5")
        assertThat(body.webhookFailoverUrl()).contains("WebhookURL")
        assertThat(body.webhookUrl()).contains("WebhookURL")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignUpdateParams.builder().campaignId("campaignId").build()

        val body = params._body()
    }
}
