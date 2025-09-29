// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StopRecordingRequestTest {

    @Test
    fun create() {
        val stopRecordingRequest =
            StopRecordingRequest.builder()
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                .build()

        assertThat(stopRecordingRequest.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(stopRecordingRequest.commandId())
            .contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(stopRecordingRequest.recordingId())
            .contains("6e00ab49-9487-4364-8ad6-23965965afb2")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val stopRecordingRequest =
            StopRecordingRequest.builder()
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .recordingId("6e00ab49-9487-4364-8ad6-23965965afb2")
                .build()

        val roundtrippedStopRecordingRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(stopRecordingRequest),
                jacksonTypeRef<StopRecordingRequest>(),
            )

        assertThat(roundtrippedStopRecordingRequest).isEqualTo(stopRecordingRequest)
    }
}
