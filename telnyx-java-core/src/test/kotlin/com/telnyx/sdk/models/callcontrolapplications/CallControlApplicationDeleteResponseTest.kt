// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationDeleteResponseTest {

    @Test
    fun create() {
        val callControlApplicationDeleteResponse =
            CallControlApplicationDeleteResponse.builder()
                .data(
                    CallControlApplication.builder()
                        .id("id")
                        .active(false)
                        .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                        .applicationName("call-router")
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
                )
                .build()

        assertThat(callControlApplicationDeleteResponse.data())
            .contains(
                CallControlApplication.builder()
                    .id("id")
                    .active(false)
                    .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                    .applicationName("call-router")
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlApplicationDeleteResponse =
            CallControlApplicationDeleteResponse.builder()
                .data(
                    CallControlApplication.builder()
                        .id("id")
                        .active(false)
                        .anchorsiteOverride(CallControlApplication.AnchorsiteOverride.LATENCY)
                        .applicationName("call-router")
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
                )
                .build()

        val roundtrippedCallControlApplicationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlApplicationDeleteResponse),
                jacksonTypeRef<CallControlApplicationDeleteResponse>(),
            )

        assertThat(roundtrippedCallControlApplicationDeleteResponse)
            .isEqualTo(callControlApplicationDeleteResponse)
    }
}
