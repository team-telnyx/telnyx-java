// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.faxapplications.FaxApplicationCreateParams
import com.telnyx.sdk.models.faxapplications.FaxApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class FaxApplicationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val faxApplicationServiceAsync = client.faxApplications()

        val faxApplicationFuture =
            faxApplicationServiceAsync.create(
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

        val faxApplication = faxApplicationFuture.get()
        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val faxApplicationServiceAsync = client.faxApplications()

        val faxApplicationFuture = faxApplicationServiceAsync.retrieve("1293384261075731499")

        val faxApplication = faxApplicationFuture.get()
        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val faxApplicationServiceAsync = client.faxApplications()

        val faxApplicationFuture =
            faxApplicationServiceAsync.update(
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

        val faxApplication = faxApplicationFuture.get()
        faxApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val faxApplicationServiceAsync = client.faxApplications()

        val pageFuture = faxApplicationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val faxApplicationServiceAsync = client.faxApplications()

        val faxApplicationFuture = faxApplicationServiceAsync.delete("1293384261075731499")

        val faxApplication = faxApplicationFuture.get()
        faxApplication.validate()
    }
}
