// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.callreasons

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallReasonListResponseTest {

    @Test
    fun create() {
        val callReasonListResponse =
            CallReasonListResponse.builder()
                .id("d29914a4-3c93-440c-af72-03778f442522")
                .description("Alert about account status or changes")
                .reason("Account Alert")
                .build()

        assertThat(callReasonListResponse.id()).contains("d29914a4-3c93-440c-af72-03778f442522")
        assertThat(callReasonListResponse.description())
            .contains("Alert about account status or changes")
        assertThat(callReasonListResponse.reason()).contains("Account Alert")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callReasonListResponse =
            CallReasonListResponse.builder()
                .id("d29914a4-3c93-440c-af72-03778f442522")
                .description("Alert about account status or changes")
                .reason("Account Alert")
                .build()

        val roundtrippedCallReasonListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callReasonListResponse),
                jacksonTypeRef<CallReasonListResponse>(),
            )

        assertThat(roundtrippedCallReasonListResponse).isEqualTo(callReasonListResponse)
    }
}
