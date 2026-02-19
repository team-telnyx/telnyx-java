// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationInbound
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationOutbound
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallControlApplicationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture =
            callControlApplicationServiceAsync.create(
                CallControlApplicationCreateParams.builder()
                    .applicationName("call-router")
                    .webhookEventUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(
                        CallControlApplicationCreateParams.AnchorsiteOverride.LATENCY
                    )
                    .callCostInWebhooks(true)
                    .dtmfType(CallControlApplicationCreateParams.DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .inbound(
                        CallControlApplicationInbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                CallControlApplicationInbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        CallControlApplicationOutbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .redactDtmfDebugLogging(true)
                    .webhookApiVersion(CallControlApplicationCreateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture = callControlApplicationServiceAsync.retrieve("id")

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture =
            callControlApplicationServiceAsync.update(
                CallControlApplicationUpdateParams.builder()
                    .id("id")
                    .applicationName("call-router")
                    .webhookEventUrl("https://example.com")
                    .active(false)
                    .anchorsiteOverride(
                        CallControlApplicationUpdateParams.AnchorsiteOverride.LATENCY
                    )
                    .callCostInWebhooks(true)
                    .dtmfType(CallControlApplicationUpdateParams.DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .inbound(
                        CallControlApplicationInbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                CallControlApplicationInbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        CallControlApplicationOutbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("outbound_voice_profile_id")
                            .build()
                    )
                    .redactDtmfDebugLogging(true)
                    .addTag("tag1")
                    .addTag("tag2")
                    .webhookApiVersion(CallControlApplicationUpdateParams.WebhookApiVersion.V1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val pageFuture = callControlApplicationServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture = callControlApplicationServiceAsync.delete("id")

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }
}
