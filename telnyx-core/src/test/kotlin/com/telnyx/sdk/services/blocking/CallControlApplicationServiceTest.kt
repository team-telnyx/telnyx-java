// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationCreateParams
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationInbound
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationOutbound
import com.telnyx.sdk.models.callcontrolapplications.CallControlApplicationUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallControlApplicationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication = callControlApplicationService.retrieve("id")

        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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

        callControlApplication.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callControlApplicationService = client.callControlApplications()

        val page = callControlApplicationService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callControlApplicationService = client.callControlApplications()

        val callControlApplication = callControlApplicationService.delete("id")

        callControlApplication.validate()
    }
}
