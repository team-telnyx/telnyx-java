// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopStreamingResponseTest {

    @Test
    fun create() {
        val actionStopStreamingResponse =
            ActionStopStreamingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopStreamingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopStreamingResponse =
            ActionStopStreamingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopStreamingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopStreamingResponse),
                jacksonTypeRef<ActionStopStreamingResponse>(),
            )

        assertThat(roundtrippedActionStopStreamingResponse).isEqualTo(actionStopStreamingResponse)
    }
}
