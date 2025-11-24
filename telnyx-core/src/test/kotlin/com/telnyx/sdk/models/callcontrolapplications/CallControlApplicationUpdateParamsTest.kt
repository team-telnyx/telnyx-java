// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationUpdateParamsTest {

    @Test
    fun create() {
        CallControlApplicationUpdateParams.builder()
            .id("id")
            .applicationName("call-router")
            .webhookEventUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(CallControlApplicationUpdateParams.AnchorsiteOverride.LATENCY)
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
            .webhookApiVersion(CallControlApplicationUpdateParams.WebhookApiVersion._1)
            .webhookEventFailoverUrl("https://failover.example.com")
            .webhookTimeoutSecs(25L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallControlApplicationUpdateParams.builder()
                .id("id")
                .applicationName("call-router")
                .webhookEventUrl("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallControlApplicationUpdateParams.builder()
                .id("id")
                .applicationName("call-router")
                .webhookEventUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(CallControlApplicationUpdateParams.AnchorsiteOverride.LATENCY)
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
                .webhookApiVersion(CallControlApplicationUpdateParams.WebhookApiVersion._1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("call-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
        assertThat(body.active()).contains(false)
        assertThat(body.anchorsiteOverride())
            .contains(CallControlApplicationUpdateParams.AnchorsiteOverride.LATENCY)
        assertThat(body.callCostInWebhooks()).contains(true)
        assertThat(body.dtmfType()).contains(CallControlApplicationUpdateParams.DtmfType.INBAND)
        assertThat(body.firstCommandTimeout()).contains(true)
        assertThat(body.firstCommandTimeoutSecs()).contains(10L)
        assertThat(body.inbound())
            .contains(
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
        assertThat(body.outbound())
            .contains(
                CallControlApplicationOutbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(body.redactDtmfDebugLogging()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.webhookApiVersion())
            .contains(CallControlApplicationUpdateParams.WebhookApiVersion._1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallControlApplicationUpdateParams.builder()
                .id("id")
                .applicationName("call-router")
                .webhookEventUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("call-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
    }
}
