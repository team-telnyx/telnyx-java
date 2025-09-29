// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.outboundvoiceprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OutboundCallRecordingTest {

    @Test
    fun create() {
        val outboundCallRecording =
            OutboundCallRecording.builder()
                .addCallRecordingCallerPhoneNumber("+19705555098")
                .callRecordingChannels(OutboundCallRecording.CallRecordingChannels.DUAL)
                .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                .callRecordingType(OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER)
                .build()

        assertThat(outboundCallRecording.callRecordingCallerPhoneNumbers().getOrNull())
            .containsExactly("+19705555098")
        assertThat(outboundCallRecording.callRecordingChannels())
            .contains(OutboundCallRecording.CallRecordingChannels.DUAL)
        assertThat(outboundCallRecording.callRecordingFormat())
            .contains(OutboundCallRecording.CallRecordingFormat.MP3)
        assertThat(outboundCallRecording.callRecordingType())
            .contains(OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val outboundCallRecording =
            OutboundCallRecording.builder()
                .addCallRecordingCallerPhoneNumber("+19705555098")
                .callRecordingChannels(OutboundCallRecording.CallRecordingChannels.DUAL)
                .callRecordingFormat(OutboundCallRecording.CallRecordingFormat.MP3)
                .callRecordingType(OutboundCallRecording.CallRecordingType.BY_CALLER_PHONE_NUMBER)
                .build()

        val roundtrippedOutboundCallRecording =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(outboundCallRecording),
                jacksonTypeRef<OutboundCallRecording>(),
            )

        assertThat(roundtrippedOutboundCallRecording).isEqualTo(outboundCallRecording)
    }
}
