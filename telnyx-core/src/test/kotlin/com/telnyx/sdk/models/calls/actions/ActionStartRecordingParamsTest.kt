// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartRecordingParamsTest {

    @Test
    fun create() {
        ActionStartRecordingParams.builder()
            .callControlId("call_control_id")
            .channels(ActionStartRecordingParams.Channels.SINGLE)
            .format(ActionStartRecordingParams.Format.WAV)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .customFileName("my_recording_file_name")
            .maxLength(0)
            .playBeep(true)
            .recordingTrack(ActionStartRecordingParams.RecordingTrack.OUTBOUND)
            .timeoutSecs(0)
            .transcription(true)
            .transcriptionEngine(ActionStartRecordingParams.TranscriptionEngine.B)
            .transcriptionLanguage(ActionStartRecordingParams.TranscriptionLanguage.EN_US)
            .transcriptionMaxSpeakerCount(4)
            .transcriptionMinSpeakerCount(4)
            .transcriptionProfanityFilter(true)
            .transcriptionSpeakerDiarization(true)
            .trim(ActionStartRecordingParams.Trim.TRIM_SILENCE)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionStartRecordingParams.builder()
                .callControlId("call_control_id")
                .channels(ActionStartRecordingParams.Channels.SINGLE)
                .format(ActionStartRecordingParams.Format.WAV)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartRecordingParams.builder()
                .callControlId("call_control_id")
                .channels(ActionStartRecordingParams.Channels.SINGLE)
                .format(ActionStartRecordingParams.Format.WAV)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .customFileName("my_recording_file_name")
                .maxLength(0)
                .playBeep(true)
                .recordingTrack(ActionStartRecordingParams.RecordingTrack.OUTBOUND)
                .timeoutSecs(0)
                .transcription(true)
                .transcriptionEngine(ActionStartRecordingParams.TranscriptionEngine.B)
                .transcriptionLanguage(ActionStartRecordingParams.TranscriptionLanguage.EN_US)
                .transcriptionMaxSpeakerCount(4)
                .transcriptionMinSpeakerCount(4)
                .transcriptionProfanityFilter(true)
                .transcriptionSpeakerDiarization(true)
                .trim(ActionStartRecordingParams.Trim.TRIM_SILENCE)
                .build()

        val body = params._body()

        assertThat(body.channels()).isEqualTo(ActionStartRecordingParams.Channels.SINGLE)
        assertThat(body.format()).isEqualTo(ActionStartRecordingParams.Format.WAV)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customFileName()).contains("my_recording_file_name")
        assertThat(body.maxLength()).contains(0)
        assertThat(body.playBeep()).contains(true)
        assertThat(body.recordingTrack())
            .contains(ActionStartRecordingParams.RecordingTrack.OUTBOUND)
        assertThat(body.timeoutSecs()).contains(0)
        assertThat(body.transcription()).contains(true)
        assertThat(body.transcriptionEngine())
            .contains(ActionStartRecordingParams.TranscriptionEngine.B)
        assertThat(body.transcriptionLanguage())
            .contains(ActionStartRecordingParams.TranscriptionLanguage.EN_US)
        assertThat(body.transcriptionMaxSpeakerCount()).contains(4)
        assertThat(body.transcriptionMinSpeakerCount()).contains(4)
        assertThat(body.transcriptionProfanityFilter()).contains(true)
        assertThat(body.transcriptionSpeakerDiarization()).contains(true)
        assertThat(body.trim()).contains(ActionStartRecordingParams.Trim.TRIM_SILENCE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionStartRecordingParams.builder()
                .callControlId("call_control_id")
                .channels(ActionStartRecordingParams.Channels.SINGLE)
                .format(ActionStartRecordingParams.Format.WAV)
                .build()

        val body = params._body()

        assertThat(body.channels()).isEqualTo(ActionStartRecordingParams.Channels.SINGLE)
        assertThat(body.format()).isEqualTo(ActionStartRecordingParams.Format.WAV)
    }
}
