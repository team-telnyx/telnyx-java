// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCreateResponseTest {

    @Test
    fun create() {
        val callCreateResponse =
            CallCreateResponse.builder()
                .callSid("v3:call-control-id")
                .from("+13120001234")
                .status(CallCreateResponse.Status.QUEUED)
                .to("+13121230000")
                .build()

        assertThat(callCreateResponse.callSid()).isEqualTo("v3:call-control-id")
        assertThat(callCreateResponse.from()).isEqualTo("+13120001234")
        assertThat(callCreateResponse.status()).isEqualTo(CallCreateResponse.Status.QUEUED)
        assertThat(callCreateResponse.to()).isEqualTo("+13121230000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callCreateResponse =
            CallCreateResponse.builder()
                .callSid("v3:call-control-id")
                .from("+13120001234")
                .status(CallCreateResponse.Status.QUEUED)
                .to("+13121230000")
                .build()

        val roundtrippedCallCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callCreateResponse),
                jacksonTypeRef<CallCreateResponse>(),
            )

        assertThat(roundtrippedCallCreateResponse).isEqualTo(callCreateResponse)
    }
}
