// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texmlapplications

import com.telnyx.api.models.credentialconnections.AnchorsiteOverride
import com.telnyx.api.models.credentialconnections.DtmfType
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TexmlApplicationUpdateParamsTest {

    @Test
    fun create() {
        TexmlApplicationUpdateParams.builder()
            .id("1293384261075731499")
            .friendlyName("call-router")
            .voiceUrl("https://example.com")
            .active(false)
            .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
            .dtmfType(DtmfType.INBAND)
            .firstCommandTimeout(true)
            .firstCommandTimeoutSecs(10L)
            .inbound(
                TexmlApplicationUpdateParams.Inbound.builder()
                    .channelLimit(10L)
                    .shakenStirEnabled(true)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        TexmlApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
            .outbound(
                TexmlApplicationUpdateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
            .statusCallback("https://example.com")
            .statusCallbackMethod(TexmlApplicationUpdateParams.StatusCallbackMethod.GET)
            .addTag("tag1")
            .addTag("tag2")
            .voiceFallbackUrl("https://fallback.example.com")
            .voiceMethod(TexmlApplicationUpdateParams.VoiceMethod.GET)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TexmlApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .friendlyName("call-router")
                .voiceUrl("https://example.com")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TexmlApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .friendlyName("call-router")
                .voiceUrl("https://example.com")
                .active(false)
                .anchorsiteOverride(AnchorsiteOverride.AMSTERDAM_NETHERLANDS)
                .dtmfType(DtmfType.INBAND)
                .firstCommandTimeout(true)
                .firstCommandTimeoutSecs(10L)
                .inbound(
                    TexmlApplicationUpdateParams.Inbound.builder()
                        .channelLimit(10L)
                        .shakenStirEnabled(true)
                        .sipSubdomain("example")
                        .sipSubdomainReceiveSettings(
                            TexmlApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                                .ONLY_MY_CONNECTIONS
                        )
                        .build()
                )
                .outbound(
                    TexmlApplicationUpdateParams.Outbound.builder()
                        .channelLimit(10L)
                        .outboundVoiceProfileId("1293384261075731499")
                        .build()
                )
                .statusCallback("https://example.com")
                .statusCallbackMethod(TexmlApplicationUpdateParams.StatusCallbackMethod.GET)
                .addTag("tag1")
                .addTag("tag2")
                .voiceFallbackUrl("https://fallback.example.com")
                .voiceMethod(TexmlApplicationUpdateParams.VoiceMethod.GET)
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
                TexmlApplicationUpdateParams.Inbound.builder()
                    .channelLimit(10L)
                    .shakenStirEnabled(true)
                    .sipSubdomain("example")
                    .sipSubdomainReceiveSettings(
                        TexmlApplicationUpdateParams.Inbound.SipSubdomainReceiveSettings
                            .ONLY_MY_CONNECTIONS
                    )
                    .build()
            )
        assertThat(body.outbound())
            .contains(
                TexmlApplicationUpdateParams.Outbound.builder()
                    .channelLimit(10L)
                    .outboundVoiceProfileId("1293384261075731499")
                    .build()
            )
        assertThat(body.statusCallback()).contains("https://example.com")
        assertThat(body.statusCallbackMethod())
            .contains(TexmlApplicationUpdateParams.StatusCallbackMethod.GET)
        assertThat(body.tags().getOrNull()).containsExactly("tag1", "tag2")
        assertThat(body.voiceFallbackUrl()).contains("https://fallback.example.com")
        assertThat(body.voiceMethod()).contains(TexmlApplicationUpdateParams.VoiceMethod.GET)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TexmlApplicationUpdateParams.builder()
                .id("1293384261075731499")
                .friendlyName("call-router")
                .voiceUrl("https://example.com")
                .build()

        val body = params._body()

        assertThat(body.friendlyName()).isEqualTo("call-router")
        assertThat(body.voiceUrl()).isEqualTo("https://example.com")
    }
}
