// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.DtmfType
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationRetrieveResponseTest {

    @Test
    fun create() {
        val texmlApplicationRetrieveResponse =
            TexmlApplicationRetrieveResponse.builder()
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

        assertThat(texmlApplicationRetrieveResponse.data())
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
        val texmlApplicationRetrieveResponse =
            TexmlApplicationRetrieveResponse.builder()
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

        val roundtrippedTexmlApplicationRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlApplicationRetrieveResponse),
                jacksonTypeRef<TexmlApplicationRetrieveResponse>(),
            )

        assertThat(roundtrippedTexmlApplicationRetrieveResponse)
            .isEqualTo(texmlApplicationRetrieveResponse)
    }
}
