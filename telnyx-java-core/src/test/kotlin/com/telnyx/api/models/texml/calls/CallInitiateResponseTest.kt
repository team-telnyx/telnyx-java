// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallInitiateResponseTest {

    @Test
    fun create() {
        val callInitiateResponse =
            CallInitiateResponse.builder()
                .data(
                    CallInitiateResponse.Data.builder()
                        .from("+13120001234")
                        .status("queued")
                        .to("+13121230000")
                        .build()
                )
                .build()

        assertThat(callInitiateResponse.data())
            .contains(
                CallInitiateResponse.Data.builder()
                    .from("+13120001234")
                    .status("queued")
                    .to("+13121230000")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callInitiateResponse =
            CallInitiateResponse.builder()
                .data(
                    CallInitiateResponse.Data.builder()
                        .from("+13120001234")
                        .status("queued")
                        .to("+13121230000")
                        .build()
                )
                .build()

        val roundtrippedCallInitiateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callInitiateResponse),
                jacksonTypeRef<CallInitiateResponse>(),
            )

        assertThat(roundtrippedCallInitiateResponse).isEqualTo(callInitiateResponse)
    }
}
