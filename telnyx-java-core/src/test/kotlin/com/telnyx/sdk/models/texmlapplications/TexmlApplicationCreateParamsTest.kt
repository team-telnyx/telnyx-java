// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texmlapplications

import com.telnyx.sdk.models.credentialconnections.AnchorsiteOverride
import com.telnyx.sdk.models.credentialconnections.DtmfType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationCreateParamsTest {

    @Test
    fun create() {
        TexmlApplicationCreateParams.builder()
            .friendlyName("call-router")
            .voiceUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
            .dtmfType(DtmfType.INBAND)
            .firstCommandTimeout(true)
            .firstCommandTimeoutSecs(10L)
            .inbound(
                TexmlApplicationCreateParams.Inbound.builder()
                    .channelLimit(10L)
                    .shakenStirEnabled(true)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        TexmlApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
            .outbound(
                TexmlApplicationCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .statusCallback("https://example.com")
            .statusCallbackMethod(TexmlApplicationCreateParams.StatusCallbackMethod.GET)
            .addTag("tag1")
            .addTag("tag2")
            .voiceFallbackUrl("https://fallback.example.com")
            .voiceMethod(TexmlApplicationCreateParams.VoiceMethod.GET)
            .build()
    }

    @Test
    fun body() {
        val params =
            TexmlApplicationCreateParams.builder()
                .friendlyName("call-router")
                .voiceUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .dtmfType(DtmfType.INBAND)
                .firstCommandTimeout(true)
                .firstCommandTimeoutSecs(10L)
                .inbound(
                    TexmlApplicationCreateParams.Inbound.builder()
                        .channelLimit(10L)
                        .shakenStirEnabled(true)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            TexmlApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                                .ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    TexmlApplicationCreateParams.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .statusCallback("https://example.com")
                .statusCallbackMethod(TexmlApplicationCreateParams.StatusCallbackMethod.GET)
                .addTag("tag1")
                .addTag("tag2")
                .voiceFallbackUrl("https://fallback.example.com")
                .voiceMethod(TexmlApplicationCreateParams.VoiceMethod.GET)
                .build()

        val body = params._body()

        assertThat(body.friendlyName()).isEqualTo("call-router")
        assertThat(body.voiceUrl()).isEqualTo("https://example.com")
        assertThat(body.active()).contains(false)
        assertThat(body.anchorsiteOverride()).contains(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
        assertThat(body.dtmfType()).contains(DtmfType.INBAND)
        assertThat(body.firstCommandTimeout()).contains(true)
        assertThat(body.firstCommandTimeoutSecs()).contains(10L)
        assertThat(body.inbound())
            .contains(
                TexmlApplicationCreateParams.Inbound.builder()
                    .channelLimit(10L)
                    .shakenStirEnabled(true)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        TexmlApplicationCreateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(body.outbound())
            .contains(
                TexmlApplicationCreateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
        assertThat(body.statusCallback()).contains("https://example.com")
        assertThat(body.statusCallbackMethod())
            .contains(TexmlApplicationCreateParams.StatusCallbackMethod.GET)
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.voiceFallbackUrl()).contains("https://fallback.example.com")
        assertThat(body.voiceMethod()).contains(TexmlApplicationCreateParams.VoiceMethod.GET)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TexmlApplicationCreateParams.builder()
                .friendlyName("call-router")
                .voiceUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.friendlyName()).isEqualTo("call-router")
        assertThat(body.voiceUrl()).isEqualTo("https://example.com")
    }
}
