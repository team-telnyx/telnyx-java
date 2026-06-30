// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallForwardingTest {

    @Test
    fun create() {
        val callForwarding =
            CallForwarding.builder()
                .callForwardingEnabled(true)
                .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                .forwardsTo("+13035559123")
                .build()

        assertThat(callForwarding.callForwardingEnabled()).contains(true)
        assertThat(callForwarding.forwardingType()).contains(CallForwarding.ForwardingType.ALWAYS)
        assertThat(callForwarding.forwardsTo()).contains("+13035559123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callForwarding =
            CallForwarding.builder()
                .callForwardingEnabled(true)
                .forwardingType(CallForwarding.ForwardingType.ALWAYS)
                .forwardsTo("+13035559123")
                .build()

        val roundtrippedCallForwarding =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callForwarding),
                jacksonTypeRef<CallForwarding>(),
            )

        assertThat(roundtrippedCallForwarding).isEqualTo(callForwarding)
    }
}
