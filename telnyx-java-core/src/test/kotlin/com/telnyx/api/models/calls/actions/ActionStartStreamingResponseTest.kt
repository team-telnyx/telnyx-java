// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartStreamingResponseTest {

    @Test
    fun create() {
        val actionStartStreamingResponse =
            ActionStartStreamingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartStreamingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartStreamingResponse =
            ActionStartStreamingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartStreamingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartStreamingResponse),
                jacksonTypeRef<ActionStartStreamingResponse>(),
            )

        assertThat(roundtrippedActionStartStreamingResponse).isEqualTo(actionStartStreamingResponse)
    }
}
