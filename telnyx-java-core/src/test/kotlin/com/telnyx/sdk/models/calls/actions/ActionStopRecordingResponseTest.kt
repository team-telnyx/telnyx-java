// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopRecordingResponseTest {

    @Test
    fun create() {
        val actionStopRecordingResponse =
            ActionStopRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopRecordingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopRecordingResponse =
            ActionStopRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopRecordingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopRecordingResponse),
                jacksonTypeRef<ActionStopRecordingResponse>(),
            )

        assertThat(roundtrippedActionStopRecordingResponse).isEqualTo(actionStopRecordingResponse)
    }
}
