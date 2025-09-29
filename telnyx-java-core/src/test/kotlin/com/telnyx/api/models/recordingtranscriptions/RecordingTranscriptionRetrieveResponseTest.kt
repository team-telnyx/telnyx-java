// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordingtranscriptions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionRetrieveResponseTest {

    @Test
    fun create() {
        val recordingTranscriptionRetrieveResponse =
            RecordingTranscriptionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(recordingTranscriptionRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingTranscriptionRetrieveResponse =
            RecordingTranscriptionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedRecordingTranscriptionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingTranscriptionRetrieveResponse),
                jacksonTypeRef<RecordingTranscriptionRetrieveResponse>(),
            )

        assertThat(roundtrippedRecordingTranscriptionRetrieveResponse)
            .isEqualTo(recordingTranscriptionRetrieveResponse)
    }
}
