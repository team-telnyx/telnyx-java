// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingResponseDataTest {

    @Test
    fun create() {
        val recordingResponseData =
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

        assertThat(recordingResponseData.id()).contains("3fa85f64-5717-4562-b3fc-2c963f66afa6")
        assertThat(recordingResponseData.callControlId())
            .contains("v3:e-31OnvjEM7Y4wvxr3TKNk8M3QyLcGZPiUIzCGtwQtOtEjY-B0urkw")
        assertThat(recordingResponseData.callLegId())
            .contains("84a97d76-e40f-11ed-9074-02420a0daa69")
        assertThat(recordingResponseData.callSessionId())
            .contains("84a97d76-e40f-11ed-9074-02420a0daa69")
        assertThat(recordingResponseData.channels()).contains(RecordingResponseData.Channels.DUAL)
        assertThat(recordingResponseData.conferenceId())
            .contains("84a97d76-e40f-11ed-9074-02420a0daa69")
        assertThat(recordingResponseData.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(recordingResponseData.downloadUrls())
            .contains(RecordingResponseData.DownloadUrls.builder().mp3("mp3").wav("wav").build())
        assertThat(recordingResponseData.durationMillis()).contains(60000)
        assertThat(recordingResponseData.recordType())
            .contains(RecordingResponseData.RecordType.RECORDING)
        assertThat(recordingResponseData.recordingEndedAt()).contains("2019-01-23T18:10:02.574Z")
        assertThat(recordingResponseData.recordingStartedAt()).contains("2019-01-23T18:10:02.574Z")
        assertThat(recordingResponseData.source()).contains(RecordingResponseData.Source.CONFERENCE)
        assertThat(recordingResponseData.status()).contains(RecordingResponseData.Status.COMPLETED)
        assertThat(recordingResponseData.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingResponseData =
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

        val roundtrippedRecordingResponseData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingResponseData),
                jacksonTypeRef<RecordingResponseData>(),
            )

        assertThat(roundtrippedRecordingResponseData).isEqualTo(recordingResponseData)
    }
}
