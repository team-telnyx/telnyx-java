// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ipconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundIpTest {

    @Test
    fun create() {
        val outboundIp =
            OutboundIp.builder()
                .aniOverride("string")
                .aniOverrideType(OutboundIp.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethod.TOKEN)
                .ipAuthenticationToken("string")
                .localization("string")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(OutboundIp.T38ReinviteSource.CUSTOMER)
                .techPrefix("string")
                .build()

        assertThat(outboundIp.aniOverride()).contains("string")
        assertThat(outboundIp.aniOverrideType()).contains(OutboundIp.AniOverrideType.ALWAYS)
        assertThat(outboundIp.callParkingEnabled()).contains(true)
        assertThat(outboundIp.channelLimit()).contains(10L)
        assertThat(outboundIp.generateRingbackTone()).contains(true)
        assertThat(outboundIp.instantRingbackEnabled()).contains(true)
        assertThat(outboundIp.ipAuthenticationMethod())
            .contains(OutboundIp.IpAuthenticationMethod.TOKEN)
        assertThat(outboundIp.ipAuthenticationToken()).contains("string")
        assertThat(outboundIp.localization()).contains("string")
        assertThat(outboundIp.outboundVoiceProfileId()).contains("outbound_voice_profile_id")
        assertThat(outboundIp.t38ReinviteSource()).contains(OutboundIp.T38ReinviteSource.CUSTOMER)
        assertThat(outboundIp.techPrefix()).contains("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundIp =
            OutboundIp.builder()
                .aniOverride("string")
                .aniOverrideType(OutboundIp.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .ipAuthenticationMethod(OutboundIp.IpAuthenticationMethod.TOKEN)
                .ipAuthenticationToken("string")
                .localization("string")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(OutboundIp.T38ReinviteSource.CUSTOMER)
                .techPrefix("string")
                .build()

        val roundtrippedOutboundIp =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundIp),
                jacksonTypeRef<OutboundIp>(),
            )

        assertThat(roundtrippedOutboundIp).isEqualTo(outboundIp)
    }
}
