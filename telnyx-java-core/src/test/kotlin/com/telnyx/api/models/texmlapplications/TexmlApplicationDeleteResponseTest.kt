// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texmlapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.DtmfType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationDeleteResponseTest {

    @Test
    fun create() {
        val texmlApplicationDeleteResponse =
            TexmlApplicationDeleteResponse.builder()
                .data(
                    TexmlApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                        .createdAt("2020-02-02T22:25:27.521Z")
                        .dtmfType(DtmfType.INBAND)
                        .firstCommandTimeout(true)
                        .firstCommandTimeoutSecs(10L)
                        .friendlyName("call-router")
                        .inbound(
                            TexmlApplication.Inbound.builder()
                                .channelLimit(10L)
                                .shakenStirEnabled(true)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    TexmlApplication.Inbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            TexmlApplication.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType("texml_application")
                        .statusCallback("https://example.com")
                        .statusCallbackMethod(TexmlApplication.StatusCallbackMethod.GET)
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2020-02-03T22:25:27.521Z")
                        .voiceFallbackUrl("https://fallback.example.com")
                        .voiceMethod(TexmlApplication.VoiceMethod.GET)
                        .voiceUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(texmlApplicationDeleteResponse.data())
            .contains(
                TexmlApplication.builder()
                    .id("1293384261075731499")
                    .active(false)
                    .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                    .createdAt("2020-02-02T22:25:27.521Z")
                    .dtmfType(DtmfType.INBAND)
                    .firstCommandTimeout(true)
                    .firstCommandTimeoutSecs(10L)
                    .friendlyName("call-router")
                    .inbound(
                        TexmlApplication.Inbound.builder()
                            .channelLimit(10L)
                            .shakenStirEnabled(true)
                            .sipSubdomain("example")
                            .sipSubdomainReceiveSettings(
                                TexmlApplication.Inbound.SipSubdomainReceiveSettings
                                    .ONLY_MY_CONNECTIONS
                            )
                            .build()
                    )
                    .outbound(
                        TexmlApplication.Outbound.builder()
                            .channelLimit(10L)
                            .outboundVoiceProfileId("1293384261075731499")
                            .build()
                    )
                    .recordType("texml_application")
                    .statusCallback("https://example.com")
                    .statusCallbackMethod(TexmlApplication.StatusCallbackMethod.GET)
                    .addTag("tag1")
                    .addTag("tag2")
                    .updatedAt("2020-02-03T22:25:27.521Z")
                    .voiceFallbackUrl("https://fallback.example.com")
                    .voiceMethod(TexmlApplication.VoiceMethod.GET)
                    .voiceUrl("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlApplicationDeleteResponse =
            TexmlApplicationDeleteResponse.builder()
                .data(
                    TexmlApplication.builder()
                        .id("1293384261075731499")
                        .active(false)
                        .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                        .createdAt("2020-02-02T22:25:27.521Z")
                        .dtmfType(DtmfType.INBAND)
                        .firstCommandTimeout(true)
                        .firstCommandTimeoutSecs(10L)
                        .friendlyName("call-router")
                        .inbound(
                            TexmlApplication.Inbound.builder()
                                .channelLimit(10L)
                                .shakenStirEnabled(true)
                                .sipSubdomain("example")
                                .sipSubdomainReceiveSettings(
                                    TexmlApplication.Inbound.SipSubdomainReceiveSettings
                                        .ONLY_MY_CONNECTIONS
                                )
                                .build()
                        )
                        .outbound(
                            TexmlApplication.Outbound.builder()
                                .channelLimit(10L)
                                .outboundVoiceProfileId("1293384261075731499")
                                .build()
                        )
                        .recordType("texml_application")
                        .statusCallback("https://example.com")
                        .statusCallbackMethod(TexmlApplication.StatusCallbackMethod.GET)
                        .addTag("tag1")
                        .addTag("tag2")
                        .updatedAt("2020-02-03T22:25:27.521Z")
                        .voiceFallbackUrl("https://fallback.example.com")
                        .voiceMethod(TexmlApplication.VoiceMethod.GET)
                        .voiceUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedTexmlApplicationDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlApplicationDeleteResponse),
                jacksonTypeRef<TexmlApplicationDeleteResponse>(),
            )

        assertThat(roundtrippedTexmlApplicationDeleteResponse)
            .isEqualTo(texmlApplicationDeleteResponse)
    }
}
