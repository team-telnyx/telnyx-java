// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.callcontrolapplications

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlApplicationInboundTest {

    @Test
    fun create() {
        val callControlApplicationInbound =
            CallControlApplicationInbound.builder()
                .channelLimit(10L)
                .shakenStirEnabled(false)
                .sipSubdomain("example")
                .sipSubdomainReceiveSettings(
                    CallControlApplicationInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .build()

        assertThat(callControlApplicationInbound.channelLimit()).contains(10L)
        assertThat(callControlApplicationInbound.shakenStirEnabled()).contains(false)
        assertThat(callControlApplicationInbound.sipSubdomain()).contains("example")
        assertThat(callControlApplicationInbound.sipSubdomainReceiveSettings())
            .contains(CallControlApplicationInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlApplicationInbound =
            CallControlApplicationInbound.builder()
                .channelLimit(10L)
                .shakenStirEnabled(false)
                .sipSubdomain("example")
                .sipSubdomainReceiveSettings(
                    CallControlApplicationInbound.SipSubdomainReceiveSettings.ONLY_MY_CONNECTIONS
                )
                .build()

        val roundtrippedCallControlApplicationInbound =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlApplicationInbound),
                jacksonTypeRef<CallControlApplicationInbound>(),
            )

        assertThat(roundtrippedCallControlApplicationInbound)
            .isEqualTo(callControlApplicationInbound)
    }
}
