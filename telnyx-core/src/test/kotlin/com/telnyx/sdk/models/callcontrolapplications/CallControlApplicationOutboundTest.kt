// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callcontrolapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationOutboundTest {

    @Test
    fun create() {
        val callControlApplicationOutbound =
            CallControlApplicationOutbound.builder()
                .channelLimit(10L)
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .build()

        assertThat(callControlApplicationOutbound.channelLimit()).contains(10L)
        assertThat(callControlApplicationOutbound.outboundVoiceProfileId())
            .contains("outbound_voice_profile_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlApplicationOutbound =
            CallControlApplicationOutbound.builder()
                .channelLimit(10L)
                .outboundVoiceProfileId("outbound_voice_profile_id")
                .build()

        val roundtrippedCallControlApplicationOutbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlApplicationOutbound),
                jacksonTypeRef<CallControlApplicationOutbound>(),
            )

        assertThat(roundtrippedCallControlApplicationOutbound)
            .isEqualTo(callControlApplicationOutbound)
    }
}
