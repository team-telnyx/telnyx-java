// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.fqdnconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.credentialconnections.EncryptedMedia
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundFqdnTest {

    @Test
    fun create() {
        val outboundFqdn =
            OutboundFqdn.builder()
                .aniOverride("ani_override")
                .aniOverrideType(OutboundFqdn.AniOverrideType.NORMAL)
                .callParkingEnabled(true)
                .channelLimit(0L)
                .encryptedMedia(EncryptedMedia.SRTP)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .ipAuthenticationMethod(
                    OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                )
                .ipAuthenticationToken("ip_authentication_token")
                .localization("US")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.TELNYX)
                .techPrefix("tech_prefix")
                .timeout1xxSecs(1L)
                .timeout2xxSecs(1L)
                .build()

        assertThat(outboundFqdn.aniOverride()).contains("ani_override")
        assertThat(outboundFqdn.aniOverrideType()).contains(OutboundFqdn.AniOverrideType.NORMAL)
        assertThat(outboundFqdn.callParkingEnabled()).contains(true)
        assertThat(outboundFqdn.channelLimit()).contains(0L)
        assertThat(outboundFqdn.encryptedMedia()).contains(EncryptedMedia.SRTP)
        assertThat(outboundFqdn.generateRingbackTone()).contains(true)
        assertThat(outboundFqdn.instantRingbackEnabled()).contains(true)
        assertThat(outboundFqdn.ipAuthenticationMethod())
            .contains(OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION)
        assertThat(outboundFqdn.ipAuthenticationToken()).contains("ip_authentication_token")
        assertThat(outboundFqdn.localization()).contains("US")
        assertThat(outboundFqdn.outboundVoiceProfileId()).contains("outbound_voice_profile_id")
        assertThat(outboundFqdn.t38ReinviteSource()).contains(OutboundFqdn.T38ReinviteSource.TELNYX)
        assertThat(outboundFqdn.techPrefix()).contains("tech_prefix")
        assertThat(outboundFqdn.timeout1xxSecs()).contains(1L)
        assertThat(outboundFqdn.timeout2xxSecs()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundFqdn =
            OutboundFqdn.builder()
                .aniOverride("ani_override")
                .aniOverrideType(OutboundFqdn.AniOverrideType.NORMAL)
                .callParkingEnabled(true)
                .channelLimit(0L)
                .encryptedMedia(EncryptedMedia.SRTP)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .ipAuthenticationMethod(
                    OutboundFqdn.IpAuthenticationMethod.CREDENTIAL_AUTHENTICATION
                )
                .ipAuthenticationToken("ip_authentication_token")
                .localization("US")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(OutboundFqdn.T38ReinviteSource.TELNYX)
                .techPrefix("tech_prefix")
                .timeout1xxSecs(1L)
                .timeout2xxSecs(1L)
                .build()

        val roundtrippedOutboundFqdn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundFqdn),
                jacksonTypeRef<OutboundFqdn>(),
            )

        assertThat(roundtrippedOutboundFqdn).isEqualTo(outboundFqdn)
    }
}
