// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionPauseRecordingResponseTest {

    @Test
    fun create() {
        val actionPauseRecordingResponse =
            ActionPauseRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionPauseRecordingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionPauseRecordingResponse =
            ActionPauseRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionPauseRecordingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionPauseRecordingResponse),
                jacksonTypeRef<ActionPauseRecordingResponse>(),
            )

        assertThat(roundtrippedActionPauseRecordingResponse).isEqualTo(actionPauseRecordingResponse)
    }
}
