// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.campaignbuilder.CampaignBuilderCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CampaignBuilderServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val campaignBuilderServiceAsync = client.campaignBuilder()

        val campaignBuilderFuture =
            campaignBuilderServiceAsync.create(
                CampaignBuilderCreateParams.builder()
                    .brandId("brandId")
                    .description("description")
                    .usecase("usecase")
                    .ageGated(true)
                    .autoRenewal(true)
                    .directLending(true)
                    .embeddedLink(true)
                    .embeddedLinkSample("embeddedLinkSample")
                    .embeddedPhone(true)
                    .helpKeywords("helpKeywords")
                    .helpMessage("helpMessage")
                    .messageFlow("messageFlow")
                    .addMnoId(0L)
                    .numberPool(true)
                    .optinKeywords("optinKeywords")
                    .optinMessage("optinMessage")
                    .optoutKeywords("optoutKeywords")
                    .optoutMessage("optoutMessage")
                    .privacyPolicyLink("privacyPolicyLink")
                    .referenceId("referenceId")
                    .resellerId("resellerId")
                    .sample1("sample1")
                    .sample2("sample2")
                    .sample3("sample3")
                    .sample4("sample4")
                    .sample5("sample5")
                    .subscriberHelp(true)
                    .subscriberOptin(true)
                    .subscriberOptout(true)
                    .addSubUsecase("string")
                    .addTag("string")
                    .termsAndConditions(true)
                    .termsAndConditionsLink("termsAndConditionsLink")
                    .webhookFailoverUrl("https://webhook.com/93711262-23e5-4048-a966-c0b2a16d5963")
                    .webhookUrl("https://webhook.com/67ea78a8-9f32-4d04-b62d-f9502e8e5f93")
                    .build()
            )

        val campaignBuilder = campaignBuilderFuture.get()
        campaignBuilder.validate()
    }
}
