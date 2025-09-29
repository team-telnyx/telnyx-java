// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.callcontrolapplications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationCreateParamsTest {

    @Test
    fun create() {
        CallControlApplicationCreateParams.builder()
            .applicationName("call-router")
            .webhookEventUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(CallControlApplicationCreateParams.AnchorsiteOverride.LATENCY)
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
    }

    @Test
    fun body() {
        val params =
            CallControlApplicationCreateParams.builder()
                .applicationName("call-router")
                .webhookEventUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(CallControlApplicationCreateParams.AnchorsiteOverride.LATENCY)
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

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("call-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
        assertThat(body.active()).contains(false)
        assertThat(body.anchorsiteOverride())
            .contains(CallControlApplicationCreateParams.AnchorsiteOverride.LATENCY)
        assertThat(body.dtmfType()).contains(CallControlApplicationCreateParams.DtmfType.INBAND)
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
        assertThat(body.webhookApiVersion())
            .contains(CallControlApplicationCreateParams.WebhookApiVersion._1)
        assertThat(body.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(body.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallControlApplicationCreateParams.builder()
                .applicationName("call-router")
                .webhookEventUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.applicationName()).isEqualTo("call-router")
        assertThat(body.webhookEventUrl()).isEqualTo("https://example.com")
    }
}
