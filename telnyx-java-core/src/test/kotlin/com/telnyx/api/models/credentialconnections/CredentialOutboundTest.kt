// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.credentialconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CredentialOutboundTest {

    @Test
    fun create() {
        val credentialOutbound =
            CredentialOutbound.builder()
                .aniOverride("always")
                .aniOverrideType(CredentialOutbound.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .localization("US")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(CredentialOutbound.T38ReinviteSource.CUSTOMER)
                .build()

        assertThat(credentialOutbound.aniOverride()).contains("always")
        assertThat(credentialOutbound.aniOverrideType())
            .contains(CredentialOutbound.AniOverrideType.ALWAYS)
        assertThat(credentialOutbound.callParkingEnabled()).contains(true)
        assertThat(credentialOutbound.channelLimit()).contains(10L)
        assertThat(credentialOutbound.generateRingbackTone()).contains(true)
        assertThat(credentialOutbound.instantRingbackEnabled()).contains(true)
        assertThat(credentialOutbound.localization()).contains("US")
        assertThat(credentialOutbound.outboundVoiceProfileId())
            .contains("outbound_voice_profile_id")
        assertThat(credentialOutbound.t38ReinviteSource())
            .contains(CredentialOutbound.T38ReinviteSource.CUSTOMER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val credentialOutbound =
            CredentialOutbound.builder()
                .aniOverride("always")
                .aniOverrideType(CredentialOutbound.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .localization("US")
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .t38ReinviteSource(CredentialOutbound.T38ReinviteSource.CUSTOMER)
                .build()

        val roundtrippedCredentialOutbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(credentialOutbound),
                jacksonTypeRef<CredentialOutbound>(),
            )

        assertThat(roundtrippedCredentialOutbound).isEqualTo(credentialOutbound)
    }
}
