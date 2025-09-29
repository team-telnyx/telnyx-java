// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRecordingTest {

    @Test
    fun create() {
        val callRecording =
            CallRecording.builder()
                .inboundCallRecordingChannels(CallRecording.InboundCallRecordingChannels.SINGLE)
                .inboundCallRecordingEnabled(true)
                .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
                .build()

        assertThat(callRecording.inboundCallRecordingChannels())
            .contains(CallRecording.InboundCallRecordingChannels.SINGLE)
        assertThat(callRecording.inboundCallRecordingEnabled()).contains(true)
        assertThat(callRecording.inboundCallRecordingFormat())
            .contains(CallRecording.InboundCallRecordingFormat.WAV)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRecording =
            CallRecording.builder()
                .inboundCallRecordingChannels(CallRecording.InboundCallRecordingChannels.SINGLE)
                .inboundCallRecordingEnabled(true)
                .inboundCallRecordingFormat(CallRecording.InboundCallRecordingFormat.WAV)
                .build()

        val roundtrippedCallRecording =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRecording),
                jacksonTypeRef<CallRecording>(),
            )

        assertThat(roundtrippedCallRecording).isEqualTo(callRecording)
    }
}
