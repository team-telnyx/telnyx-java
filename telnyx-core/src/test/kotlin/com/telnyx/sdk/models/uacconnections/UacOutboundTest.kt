// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.uacconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UacOutboundTest {

    @Test
    fun create() {
        val uacOutbound =
            UacOutbound.builder()
                .aniOverride("always")
                .aniOverrideType(UacOutbound.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .localization("US")
                .outboundVoiceProfileId("1293384261075731499")
                .t38ReinviteSource(UacOutbound.T38ReinviteSource.CUSTOMER)
                .build()

        assertThat(uacOutbound.aniOverride()).contains("always")
        assertThat(uacOutbound.aniOverrideType()).contains(UacOutbound.AniOverrideType.ALWAYS)
        assertThat(uacOutbound.callParkingEnabled()).contains(true)
        assertThat(uacOutbound.channelLimit()).contains(10L)
        assertThat(uacOutbound.generateRingbackTone()).contains(true)
        assertThat(uacOutbound.instantRingbackEnabled()).contains(true)
        assertThat(uacOutbound.localization()).contains("US")
        assertThat(uacOutbound.outboundVoiceProfileId()).contains("1293384261075731499")
        assertThat(uacOutbound.t38ReinviteSource()).contains(UacOutbound.T38ReinviteSource.CUSTOMER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uacOutbound =
            UacOutbound.builder()
                .aniOverride("always")
                .aniOverrideType(UacOutbound.AniOverrideType.ALWAYS)
                .callParkingEnabled(true)
                .channelLimit(10L)
                .generateRingbackTone(true)
                .instantRingbackEnabled(true)
                .localization("US")
                .outboundVoiceProfileId("1293384261075731499")
                .t38ReinviteSource(UacOutbound.T38ReinviteSource.CUSTOMER)
                .build()

        val roundtrippedUacOutbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uacOutbound),
                jacksonTypeRef<UacOutbound>(),
            )

        assertThat(roundtrippedUacOutbound).isEqualTo(uacOutbound)
    }
}
