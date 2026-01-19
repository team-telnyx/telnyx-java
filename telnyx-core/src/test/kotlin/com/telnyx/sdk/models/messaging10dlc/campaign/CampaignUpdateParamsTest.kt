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

        val body = params._body()

        assertThat(body.autoRenewal()).contains(true)
        assertThat(body.helpMessage()).contains("helpMessage")
        assertThat(body.messageFlow()).contains("messageFlow")
        assertThat(body.resellerId()).contains("resellerId")
        assertThat(body.sample1()).contains("sample1")
        assertThat(body.sample2()).contains("sample2")
        assertThat(body.sample3()).contains("sample3")
        assertThat(body.sample4()).contains("sample4")
        assertThat(body.sample5()).contains("sample5")
        assertThat(body.webhookFailoverUrl()).contains("webhookFailoverURL")
        assertThat(body.webhookUrl()).contains("webhookURL")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CampaignUpdateParams.builder().campaignId("campaignId").build()

        val body = params._body()
    }
}
