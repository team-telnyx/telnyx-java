// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCallsResponseTest {

    @Test
    fun create() {
        val callCallsResponse =
            CallCallsResponse.builder()
                .from("+13120001234")
                .status("queued")
                .to("+13121230000")
                .build()

        assertThat(callCallsResponse.from()).contains("+13120001234")
        assertThat(callCallsResponse.status()).contains("queued")
        assertThat(callCallsResponse.to()).contains("+13121230000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callCallsResponse =
            CallCallsResponse.builder()
                .from("+13120001234")
                .status("queued")
                .to("+13121230000")
                .build()

        val roundtrippedCallCallsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callCallsResponse),
                jacksonTypeRef<CallCallsResponse>(),
            )

        assertThat(roundtrippedCallCallsResponse).isEqualTo(callCallsResponse)
    }
}
