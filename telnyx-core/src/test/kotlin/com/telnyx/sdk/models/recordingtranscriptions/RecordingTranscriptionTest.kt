// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordingtranscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionTest {

    @Test
    fun create() {
        val recordingTranscription =
            RecordingTranscription.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .createdAt("2018-02-02T22:25:27.521Z")
                .durationMillis(60000)
                .recordType(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
                .recordingId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(RecordingTranscription.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(recordingTranscription.id()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(recordingTranscription.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(recordingTranscription.durationMillis()).contains(60000)
        assertThat(recordingTranscription.recordType())
            .contains(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
        assertThat(recordingTranscription.recordingId())
            .contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(recordingTranscription.status())
            .contains(RecordingTranscription.Status.COMPLETED)
        assertThat(recordingTranscription.transcriptionText())
            .contains("Good morning, how may I help you?")
        assertThat(recordingTranscription.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingTranscription =
            RecordingTranscription.builder()
                .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .createdAt("2018-02-02T22:25:27.521Z")
                .durationMillis(60000)
                .recordType(RecordingTranscription.RecordType.RECORDING_TRANSCRIPTION)
                .recordingId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .status(RecordingTranscription.Status.COMPLETED)
                .transcriptionText("Good morning, how may I help you?")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedRecordingTranscription =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingTranscription),
                jacksonTypeRef<RecordingTranscription>(),
            )

        assertThat(roundtrippedRecordingTranscription).isEqualTo(recordingTranscription)
    }
}
