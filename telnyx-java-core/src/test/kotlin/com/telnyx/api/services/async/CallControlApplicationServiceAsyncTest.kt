// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationInbound
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationOutbound
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallControlApplicationServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .webhookApiVersion(CallControlApplicationCreateParams.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture = callControlApplicationServiceAsync.retrieve("id")

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .webhookApiVersion(CallControlApplicationUpdateParams.WebhookApiVersion._1)
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationsFuture =
            callControlApplicationServiceAsync.list(
                CallControlApplicationListParams.builder()
                    .filter(
                        CallControlApplicationListParams.Filter.builder()
                            .applicationName(
                                CallControlApplicationListParams.Filter.ApplicationName.builder()
                                    .contains("contains")
                                    .build()
                            )
                            .applicationSessionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .connectionId("connection_id")
                            .failed(false)
                            .from("+12025550142")
                            .legId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                            .name("name")
                            .occurredAt(
                                CallControlApplicationListParams.Filter.OccurredAt.builder()
                                    .eq("2019-03-29T11:10:00Z")
                                    .gt("2019-03-29T11:10:00Z")
                                    .gte("2019-03-29T11:10:00Z")
                                    .lt("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .outboundOutboundVoiceProfileId("outbound.outbound_voice_profile_id")
                            .product(CallControlApplicationListParams.Filter.Product.TEXML)
                            .status(CallControlApplicationListParams.Filter.Status.INIT)
                            .to("+12025550142")
                            .type(CallControlApplicationListParams.Filter.Type.WEBHOOK)
                            .build()
                    )
                    .page(
                        CallControlApplicationListParams.Page.builder()
                            .after("after")
                            .before("before")
                            .limit(1L)
                            .number(1L)
                            .size(1L)
                            .build()
                    )
                    .sort(CallControlApplicationListParams.Sort.CONNECTION_NAME)
                    .build()
            )

        val callControlApplications = callControlApplicationsFuture.get()
        callControlApplications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationServiceAsync = client.callControlApplications()

        val callControlApplicationFuture = callControlApplicationServiceAsync.delete("id")

        val callControlApplication = callControlApplicationFuture.get()
        callControlApplication.validate()
    }
}
