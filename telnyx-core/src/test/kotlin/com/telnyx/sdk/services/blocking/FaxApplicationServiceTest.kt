// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationListParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FaxApplicationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxApplicationService = client.faxApplications()

        val faxApplication =
            faxApplicationService.create(
                FaxApplicationCreateParams.builder()
                    .applicationName("fax-router")
                    .webhookEventUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .inbound(
                        FaxApplicationCreateParams.Inbound.builder()
                            .channelLimit(10L)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                FaxApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        FaxApplicationCreateParams.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxApplicationService = client.faxApplications()

        val faxApplication = faxApplicationService.retrieve("1293384261075731499")

        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxApplicationService = client.faxApplications()

        val faxApplication =
            faxApplicationService.update(
                FaxApplicationUpdateParams.builder()
                    .id("1293384261075731499")
                    .applicationName("fax-router")
                    .webhookEventUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .faxEmailRecipient("user@example.com")
                    .inbound(
                        FaxApplicationUpdateParams.Inbound.builder()
                            .channelLimit(10L)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                FaxApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        FaxApplicationUpdateParams.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxApplicationService = client.faxApplications()

        val faxApplications =
            faxApplicationService.list(
                FaxApplicationListParams.builder()
                    .filter(
                        FaxApplicationListParams.Filter.builder()
                            .applicationName(
                                FaxApplicationListParams.Filter.ApplicationName.builder()
                                    .contains("fax-app")
                                    .build()
                            )
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .page(FaxApplicationListParams.Page.builder().number(1L).size(1L).build())
                    .sort(FaxApplicationListParams.Sort.APPLICATION_NAME)
                    .build()
            )

        faxApplications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val faxApplicationService = client.faxApplications()

        val faxApplication = faxApplicationService.delete("1293384261075731499")

        faxApplication.validate()
    }
}
