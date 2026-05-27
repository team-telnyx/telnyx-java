// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacInboundTest {

    @Test
    fun create() {
        val uacInbound =
            UacInbound.builder()
                .aniNumberFormat(UacInbound.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultRoutingMethod(UacInbound.DefaultRoutingMethod.SEQUENTIAL)
                .dnisNumberFormat(UacInbound.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .simultaneousRinging(UacInbound.SimultaneousRinging.ENABLED)
                .sipCompactHeadersEnabled(true)
                .sipSubdomain("abc123def456")
                .sipSubdomainReceiveSettings(
                    UacInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        assertThat(uacInbound.aniNumberFormat()).contains(UacInbound.AniNumberFormat.PLUS_E_164)
        assertThat(uacInbound.channelLimit()).contains(10L)
        assertThat(uacInbound.codecs().getOrNull()).containsExactly("G722")
        assertThat(uacInbound.defaultRoutingMethod())
            .contains(UacInbound.DefaultRoutingMethod.SEQUENTIAL)
        assertThat(uacInbound.dnisNumberFormat()).contains(UacInbound.DnisNumberFormat.PLUS_E164)
        assertThat(uacInbound.generateRingbackTone()).contains(true)
        assertThat(uacInbound.isupHeadersEnabled()).contains(true)
        assertThat(uacInbound.prackEnabled()).contains(true)
        assertThat(uacInbound.shakenStirEnabled()).contains(true)
        assertThat(uacInbound.simultaneousRinging())
            .contains(UacInbound.SimultaneousRinging.ENABLED)
        assertThat(uacInbound.sipCompactHeadersEnabled()).contains(true)
        assertThat(uacInbound.sipSubdomain()).contains("abc123def456")
        assertThat(uacInbound.sipSubdomainReceiveSettings())
            .contains(UacInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS)
        assertThat(uacInbound.timeout1xxSecs()).contains(10L)
        assertThat(uacInbound.timeout2xxSecs()).contains(20L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uacInbound =
            UacInbound.builder()
                .aniNumberFormat(UacInbound.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultRoutingMethod(UacInbound.DefaultRoutingMethod.SEQUENTIAL)
                .dnisNumberFormat(UacInbound.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .simultaneousRinging(UacInbound.SimultaneousRinging.ENABLED)
                .sipCompactHeadersEnabled(true)
                .sipSubdomain("abc123def456")
                .sipSubdomainReceiveSettings(
                    UacInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        val roundtrippedUacInbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uacInbound),
                jacksonTypeRef<UacInbound>(),
            )

        assertThat(roundtrippedUacInbound).isEqualTo(uacInbound)
    }
}
