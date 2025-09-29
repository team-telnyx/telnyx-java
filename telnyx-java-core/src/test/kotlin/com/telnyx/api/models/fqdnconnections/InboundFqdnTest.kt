// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.fqdnconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFqdnTest {

    @Test
    fun create() {
        val inboundFqdn =
            InboundFqdn.builder()
                .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultPrimaryFqdnId("default_primary_fqdn_id")
                .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                .defaultSecondaryFqdnId("default_secondary_fqdn_id")
                .defaultTertiaryFqdnId("default_tertiary_fqdn_id")
                .dnisNumberFormat(InboundFqdn.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .sipRegion(InboundFqdn.SipRegion.US)
                .sipSubdomain("test")
                .sipSubdomainReceiveSettings(
                    InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        assertThat(inboundFqdn.aniNumberFormat()).contains(InboundFqdn.AniNumberFormat.PLUS_E_164)
        assertThat(inboundFqdn.channelLimit()).contains(10L)
        assertThat(inboundFqdn.codecs().getOrNull()).containsExactly("G722")
        assertThat(inboundFqdn.defaultPrimaryFqdnId()).contains("default_primary_fqdn_id")
        assertThat(inboundFqdn.defaultRoutingMethod())
            .contains(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
        assertThat(inboundFqdn.defaultSecondaryFqdnId()).contains("default_secondary_fqdn_id")
        assertThat(inboundFqdn.defaultTertiaryFqdnId()).contains("default_tertiary_fqdn_id")
        assertThat(inboundFqdn.dnisNumberFormat()).contains(InboundFqdn.DnisNumberFormat.PLUS_E164)
        assertThat(inboundFqdn.generateRingbackTone()).contains(true)
        assertThat(inboundFqdn.isupHeadersEnabled()).contains(true)
        assertThat(inboundFqdn.prackEnabled()).contains(true)
        assertThat(inboundFqdn.shakenStirEnabled()).contains(true)
        assertThat(inboundFqdn.sipCompactHeadersEnabled()).contains(true)
        assertThat(inboundFqdn.sipRegion()).contains(InboundFqdn.SipRegion.US)
        assertThat(inboundFqdn.sipSubdomain()).contains("test")
        assertThat(inboundFqdn.sipSubdomainReceiveSettings())
            .contains(InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS)
        assertThat(inboundFqdn.timeout1xxSecs()).contains(10L)
        assertThat(inboundFqdn.timeout2xxSecs()).contains(20L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val inboundFqdn =
            InboundFqdn.builder()
                .aniNumberFormat(InboundFqdn.AniNumberFormat.PLUS_E_164)
                .channelLimit(10L)
                .addCodec("G722")
                .defaultPrimaryFqdnId("default_primary_fqdn_id")
                .defaultRoutingMethod(InboundFqdn.DefaultRoutingMethod.SEQUENTIAL)
                .defaultSecondaryFqdnId("default_secondary_fqdn_id")
                .defaultTertiaryFqdnId("default_tertiary_fqdn_id")
                .dnisNumberFormat(InboundFqdn.DnisNumberFormat.PLUS_E164)
                .generateRingbackTone(true)
                .isupHeadersEnabled(true)
                .prackEnabled(true)
                .shakenStirEnabled(true)
                .sipCompactHeadersEnabled(true)
                .sipRegion(InboundFqdn.SipRegion.US)
                .sipSubdomain("test")
                .sipSubdomainReceiveSettings(
                    InboundFqdn.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .timeout1xxSecs(10L)
                .timeout2xxSecs(20L)
                .build()

        val roundtrippedInboundFqdn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundFqdn),
                jacksonTypeRef<InboundFqdn>(),
            )

        assertThat(roundtrippedInboundFqdn).isEqualTo(inboundFqdn)
    }
}
