// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundIpTest {

    @Test
    fun create() {
        val inboundIp =
            InboundIp.builder()
                .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("string")
                .defaultPrimaryIpId("192.168.0.0")
                .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                .defaultSecondaryIpId("192.168.0.0")
                .defaultTertiaryIpId("192.168.0.0")
                .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .sipRegion(InboundIp.SipRegion.US)
                .sipSubdomain("test")
                .sipSubdomainReceiveSettings(
                    InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        assertThat(inboundIp.aniNumberFormat()).contains(InboundIp.AniNumberFormat.PLUS_E_164)
        assertThat(inboundIp.channelLimit()).contains(10L)
        assertThat(inboundIp.codecs().getOrNull()).containsExactly("string")
        assertThat(inboundIp.defaultPrimaryIpId()).contains("192.168.0.0")
        assertThat(inboundIp.defaultRoutingMethod())
            .contains(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
        assertThat(inboundIp.defaultSecondaryIpId()).contains("192.168.0.0")
        assertThat(inboundIp.defaultTertiaryIpId()).contains("192.168.0.0")
        assertThat(inboundIp.dnisNumberFormat()).contains(InboundIp.DnisNumberFormat.PLUS_E164)
        assertThat(inboundIp.generateRingbackTone()).contains(true)
        assertThat(inboundIp.isupHeadersEnabled()).contains(true)
        assertThat(inboundIp.prackEnabled()).contains(true)
        assertThat(inboundIp.shakenStirEnabled()).contains(true)
        assertThat(inboundIp.sipCompactHeadersEnabled()).contains(true)
        assertThat(inboundIp.sipRegion()).contains(InboundIp.SipRegion.US)
        assertThat(inboundIp.sipSubdomain()).contains("test")
        assertThat(inboundIp.sipSubdomainReceiveSettings())
            .contains(InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS)
        assertThat(inboundIp.timeout1xxSecs()).contains(10L)
        assertThat(inboundIp.timeout2xxSecs()).contains(20L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundIp =
            InboundIp.builder()
                .aniNumberFormat(InboundIp.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("string")
                .defaultPrimaryIpId("192.168.0.0")
                .defaultRoutingMethod(InboundIp.DefaultRoutingMethod.SEQUENTIAL)
                .defaultSecondaryIpId("192.168.0.0")
                .defaultTertiaryIpId("192.168.0.0")
                .dnisNumberFormat(InboundIp.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .sipRegion(InboundIp.SipRegion.US)
                .sipSubdomain("test")
                .sipSubdomainReceiveSettings(
                    InboundIp.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        val roundtrippedInboundIp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundIp),
                jacksonTypeRef<InboundIp>(),
            )

        assertThat(roundtrippedInboundIp).isEqualTo(inboundIp)
    }
}
