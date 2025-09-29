// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.calls

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallUpdateResponseTest {

    @Test
    fun create() {
        val callUpdateResponse =
            CallUpdateResponse.builder()
                .data(
                    CallUpdateResponse.Data.builder()
                        .sid("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                        .status("accepted")
                        .build()
                )
                .build()

        assertThat(callUpdateResponse.data())
            .contains(
                CallUpdateResponse.Data.builder()
                    .sid("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                    .status("accepted")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callUpdateResponse =
            CallUpdateResponse.builder()
                .data(
                    CallUpdateResponse.Data.builder()
                        .sid("c46e06d7-b78f-4b13-96b6-c576af9640ff")
                        .status("accepted")
                        .build()
                )
                .build()

        val roundtrippedCallUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callUpdateResponse),
                jacksonTypeRef<CallUpdateResponse>(),
            )

        assertThat(roundtrippedCallUpdateResponse).isEqualTo(callUpdateResponse)
    }
}
