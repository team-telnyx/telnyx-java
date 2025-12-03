// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationTest {

    @Test
    fun create() {
        val callControlApplication =
            CallControlApplication.builder()
                .id("id")
                .active(false)
                .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                .applicationName("call-router")
                .callCostInWebhooks(false)
                .createdAt("2018-02-02T22:25:27.521Z")
                .dtmfType(CallControlApplication.DtmfType.INBAND)
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
                .recordType(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
                .redactDtmfDebugLogging(true)
                .addTag("string")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookApiVersion(CallControlApplication.WebhookApiVersion._1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        assertThat(callControlApplication.id()).contains("id")
        assertThat(callControlApplication.active()).contains(false)
        assertThat(callControlApplication.anchorsiteOverride())
            .contains(CallControlApplication.AnchorsiteOverride.LATENCY)
        assertThat(callControlApplication.applicationName()).contains("call-router")
        assertThat(callControlApplication.callCostInWebhooks()).contains(false)
        assertThat(callControlApplication.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(callControlApplication.dtmfType())
            .contains(CallControlApplication.DtmfType.INBAND)
        assertThat(callControlApplication.firstCommandTimeout()).contains(true)
        assertThat(callControlApplication.firstCommandTimeoutSecs()).contains(10L)
        assertThat(callControlApplication.inbound())
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
        assertThat(callControlApplication.outbound())
            .contains(
                CallControlApplicationOutbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("outbound_voice_profile_id")
                    .build()
            )
        assertThat(callControlApplication.recordType())
            .contains(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
        assertThat(callControlApplication.redactDtmfDebugLogging()).contains(true)
        assertThat(callControlApplication.tags().getOrNull()).containsExactly("string")
        assertThat(callControlApplication.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(callControlApplication.webhookApiVersion())
            .contains(CallControlApplication.WebhookApiVersion._1)
        assertThat(callControlApplication.webhookEventFailoverUrl())
            .contains("https://failover.example.com")
        assertThat(callControlApplication.webhookEventUrl()).contains("https://example.com")
        assertThat(callControlApplication.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlApplication =
            CallControlApplication.builder()
                .id("id")
                .active(false)
                .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                .applicationName("call-router")
                .callCostInWebhooks(false)
                .createdAt("2018-02-02T22:25:27.521Z")
                .dtmfType(CallControlApplication.DtmfType.INBAND)
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
                .recordType(CallControlApplication.RecordType.CALL_CONTROL_APPLICATION)
                .redactDtmfDebugLogging(true)
                .addTag("string")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .webhookApiVersion(CallControlApplication.WebhookApiVersion._1)
                .webhookEventFailoverUrl("https://failover.example.com")
                .webhookEventUrl("https://example.com")
                .webhookTimeoutSecs(25L)
                .build()

        val roundtrippedCallControlApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlApplication),
                jacksonTypeRef<CallControlApplication>(),
            )

        assertThat(roundtrippedCallControlApplication).isEqualTo(callControlApplication)
    }
}
