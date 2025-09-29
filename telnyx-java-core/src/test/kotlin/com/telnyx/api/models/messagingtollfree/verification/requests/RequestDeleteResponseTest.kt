// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.messagingtollfree.verification.requests

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RequestDeleteResponseTest {

    @Test
    fun create() {
        val requestDeleteResponse = RequestDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val requestDeleteResponse = RequestDeleteResponse.builder().build()

        val roundtrippedRequestDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(requestDeleteResponse),
                jacksonTypeRef<RequestDeleteResponse>(),
            )

        assertThat(roundtrippedRequestDeleteResponse).isEqualTo(requestDeleteResponse)
    }
}
