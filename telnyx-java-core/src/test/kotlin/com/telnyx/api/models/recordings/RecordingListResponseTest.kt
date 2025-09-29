// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.recordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingListResponseTest {

    @Test
    fun create() {
        val recordingListResponse =
            RecordingListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(recordingListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(recordingListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingListResponse =
            RecordingListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRecordingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingListResponse),
                jacksonTypeRef<RecordingListResponse>(),
            )

        assertThat(roundtrippedRecordingListResponse).isEqualTo(recordingListResponse)
    }
}
