// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingRetrieveResponseTest {

    @Test
    fun create() {
        val recordingRetrieveResponse =
            RecordingRetrieveResponse.builder()
                .data(
                    RecordingResponseData.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .callControlId("v3:e-31OnvjEM7Y4wvxr3TKNk8M3QyLcGZPiUIzCGtwQtOtEjY-B0urkw")
                        .callLegId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .callSessionId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .channels(RecordingResponseData.Channels.DUAL)
                        .conferenceId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .downloadUrls(
                            RecordingResponseData.DownloadUrls.builder()
                                .mp3("mp3")
                                .wav("wav")
                                .build()
                        )
                        .durationMillis(60000)
                        .recordType(RecordingResponseData.RecordType.RECORDING)
                        .recordingEndedAt("2019-01-23T18:10:02.574Z")
                        .recordingStartedAt("2019-01-23T18:10:02.574Z")
                        .source(RecordingResponseData.Source.CONFERENCE)
                        .status(RecordingResponseData.Status.COMPLETED)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(recordingRetrieveResponse.data())
            .contains(
                RecordingResponseData.builder()
                    .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .callControlId("v3:e-31OnvjEM7Y4wvxr3TKNk8M3QyLcGZPiUIzCGtwQtOtEjY-B0urkw")
                    .callLegId("84a97d76-e40f-11ed-9074-02420a0daa69")
                    .callSessionId("84a97d76-e40f-11ed-9074-02420a0daa69")
                    .channels(RecordingResponseData.Channels.DUAL)
                    .conferenceId("84a97d76-e40f-11ed-9074-02420a0daa69")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .downloadUrls(
                        RecordingResponseData.DownloadUrls.builder().mp3("mp3").wav("wav").build()
                    )
                    .durationMillis(60000)
                    .recordType(RecordingResponseData.RecordType.RECORDING)
                    .recordingEndedAt("2019-01-23T18:10:02.574Z")
                    .recordingStartedAt("2019-01-23T18:10:02.574Z")
                    .source(RecordingResponseData.Source.CONFERENCE)
                    .status(RecordingResponseData.Status.COMPLETED)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingRetrieveResponse =
            RecordingRetrieveResponse.builder()
                .data(
                    RecordingResponseData.builder()
                        .id("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                        .callControlId("v3:e-31OnvjEM7Y4wvxr3TKNk8M3QyLcGZPiUIzCGtwQtOtEjY-B0urkw")
                        .callLegId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .callSessionId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .channels(RecordingResponseData.Channels.DUAL)
                        .conferenceId("84a97d76-e40f-11ed-9074-02420a0daa69")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .downloadUrls(
                            RecordingResponseData.DownloadUrls.builder()
                                .mp3("mp3")
                                .wav("wav")
                                .build()
                        )
                        .durationMillis(60000)
                        .recordType(RecordingResponseData.RecordType.RECORDING)
                        .recordingEndedAt("2019-01-23T18:10:02.574Z")
                        .recordingStartedAt("2019-01-23T18:10:02.574Z")
                        .source(RecordingResponseData.Source.CONFERENCE)
                        .status(RecordingResponseData.Status.COMPLETED)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedRecordingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingRetrieveResponse),
                jacksonTypeRef<RecordingRetrieveResponse>(),
            )

        assertThat(roundtrippedRecordingRetrieveResponse).isEqualTo(recordingRetrieveResponse)
    }
}
