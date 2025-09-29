// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationInbound
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationListParams
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationOutbound
import com.telnyx.api.models.callcontrolapplications.CallControlApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CallControlApplicationServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication =
            callControlApplicationService.create(
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

        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication = callControlApplicationService.retrieve("id")

        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication =
            callControlApplicationService.update(
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

        callControlApplication.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplications =
            callControlApplicationService.list(
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

        callControlApplications.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication = callControlApplicationService.delete("id")

        callControlApplication.validate()
    }
}
