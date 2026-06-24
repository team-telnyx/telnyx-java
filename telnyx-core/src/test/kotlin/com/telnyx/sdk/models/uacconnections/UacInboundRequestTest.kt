// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacInboundRequestTest {

    @Test
    fun create() {
        val uacInboundRequest =
            UacInboundRequest.builder()
                .aniNumberFormat(UacInboundRequest.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultRoutingMethod(UacInboundRequest.DefaultRoutingMethod.SEQUENTIAL)
                .dnisNumberFormat(UacInboundRequest.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .simultaneousRinging(UacInboundRequest.SimultaneousRinging.ENABLED)
                .sipCompactHeadersEnabled(true)
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        assertThat(uacInboundRequest.aniNumberFormat())
            .contains(UacInboundRequest.AniNumberFormat.PLUS_E_164)
        assertThat(uacInboundRequest.channelLimit()).contains(10L)
        assertThat(uacInboundRequest.codecs().getOrNull()).containsExactly("G722")
        assertThat(uacInboundRequest.defaultRoutingMethod())
            .contains(UacInboundRequest.DefaultRoutingMethod.SEQUENTIAL)
        assertThat(uacInboundRequest.dnisNumberFormat())
            .contains(UacInboundRequest.DnisNumberFormat.PLUS_E164)
        assertThat(uacInboundRequest.generateRingbackTone()).contains(true)
        assertThat(uacInboundRequest.isupHeadersEnabled()).contains(true)
        assertThat(uacInboundRequest.prackEnabled()).contains(true)
        assertThat(uacInboundRequest.shakenStirEnabled()).contains(true)
        assertThat(uacInboundRequest.simultaneousRinging())
            .contains(UacInboundRequest.SimultaneousRinging.ENABLED)
        assertThat(uacInboundRequest.sipCompactHeadersEnabled()).contains(true)
        assertThat(uacInboundRequest.timeout1xxSecs()).contains(10L)
        assertThat(uacInboundRequest.timeout2xxSecs()).contains(20L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uacInboundRequest =
            UacInboundRequest.builder()
                .aniNumberFormat(UacInboundRequest.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultRoutingMethod(UacInboundRequest.DefaultRoutingMethod.SEQUENTIAL)
                .dnisNumberFormat(UacInboundRequest.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .simultaneousRinging(UacInboundRequest.SimultaneousRinging.ENABLED)
                .sipCompactHeadersEnabled(true)
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        val roundtrippedUacInboundRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uacInboundRequest),
                jacksonTypeRef<UacInboundRequest>(),
            )

        assertThat(roundtrippedUacInboundRequest).isEqualTo(uacInboundRequest)
    }
}
