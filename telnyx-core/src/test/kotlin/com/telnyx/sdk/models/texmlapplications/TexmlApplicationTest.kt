// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.DtmfType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationTest {

    @Test
    fun create() {
        val texmlApplication =
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
                            TexmlApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
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

        assertThat(texmlApplication.id()).contains("1293384261075731499")
        assertThat(texmlApplication.active()).contains(false)
        assertThat(texmlApplication.anchorsiteOverride())
            .contains(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
        assertThat(texmlApplication.createdAt()).contains("2020-02-02T22:25:27.521Z")
        assertThat(texmlApplication.dtmfType()).contains(DtmfType.INBAND)
        assertThat(texmlApplication.firstCommandTimeout()).contains(true)
        assertThat(texmlApplication.firstCommandTimeoutSecs()).contains(10L)
        assertThat(texmlApplication.friendlyName()).contains("call-router")
        assertThat(texmlApplication.inbound())
            .contains(
                TexmlApplication.Inbound.builder()
                    .channelLimit(10L)
                    .shakenStirEnabled(true)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        TexmlApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(texmlApplication.outbound())
            .contains(
                TexmlApplication.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
        assertThat(texmlApplication.recordType()).contains("texml_application")
        assertThat(texmlApplication.statusCallback()).contains("https://example.com")
        assertThat(texmlApplication.statusCallbackMethod())
            .contains(TexmlApplication.StatusCallbackMethod.GET)
        assertThat(texmlApplication.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(texmlApplication.updatedAt()).contains("2020-02-03T22:25:27.521Z")
        assertThat(texmlApplication.voiceFallbackUrl()).contains("https://fallback.example.com")
        assertThat(texmlApplication.voiceMethod()).contains(TexmlApplication.VoiceMethod.GET)
        assertThat(texmlApplication.voiceUrl()).contains("https://example.com")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val texmlApplication =
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
                            TexmlApplication.Inbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
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

        val roundtrippedTexmlApplication =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(texmlApplication),
                jacksonTypeRef<TexmlApplication>(),
            )

        assertThat(roundtrippedTexmlApplication).isEqualTo(texmlApplication)
    }
}
