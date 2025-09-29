// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopTranscriptionResponseTest {

    @Test
    fun create() {
        val actionStopTranscriptionResponse =
            ActionStopTranscriptionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopTranscriptionResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopTranscriptionResponse =
            ActionStopTranscriptionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopTranscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopTranscriptionResponse),
                jacksonTypeRef<ActionStopTranscriptionResponse>(),
            )

        assertThat(roundtrippedActionStopTranscriptionResponse)
            .isEqualTo(actionStopTranscriptionResponse)
    }
}
