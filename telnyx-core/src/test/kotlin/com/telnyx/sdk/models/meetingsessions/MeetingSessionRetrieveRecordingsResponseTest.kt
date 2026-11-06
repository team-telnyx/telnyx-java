// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveRecordingsResponseTest {

    @Test
    fun create() {
        val meetingSessionRetrieveRecordingsResponse =
            MeetingSessionRetrieveRecordingsResponse.builder()
                .addData(
                    MeetingSessionRetrieveRecordingsResponse.Data.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type("type")
                        .url("https://example.com")
                        .build()
                )
                .recordingExport(
                    MeetingSessionRecordingExport.builder()
                        .bucket("bucket")
                        .bytes(0L)
                        .exportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .key("key")
                        .region("region")
                        .status(MeetingSessionRecordingExport.Status.PENDING)
                        .build()
                )
                .build()

        assertThat(meetingSessionRetrieveRecordingsResponse.data())
            .containsExactly(
                MeetingSessionRetrieveRecordingsResponse.Data.builder()
                    .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type("type")
                    .url("https://example.com")
                    .build()
            )
        assertThat(meetingSessionRetrieveRecordingsResponse.recordingExport())
            .contains(
                MeetingSessionRecordingExport.builder()
                    .bucket("bucket")
                    .bytes(0L)
                    .exportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .key("key")
                    .region("region")
                    .status(MeetingSessionRecordingExport.Status.PENDING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionRetrieveRecordingsResponse =
            MeetingSessionRetrieveRecordingsResponse.builder()
                .addData(
                    MeetingSessionRetrieveRecordingsResponse.Data.builder()
                        .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type("type")
                        .url("https://example.com")
                        .build()
                )
                .recordingExport(
                    MeetingSessionRecordingExport.builder()
                        .bucket("bucket")
                        .bytes(0L)
                        .exportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .key("key")
                        .region("region")
                        .status(MeetingSessionRecordingExport.Status.PENDING)
                        .build()
                )
                .build()

        val roundtrippedMeetingSessionRetrieveRecordingsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionRetrieveRecordingsResponse),
                jacksonTypeRef<MeetingSessionRetrieveRecordingsResponse>(),
            )

        assertThat(roundtrippedMeetingSessionRetrieveRecordingsResponse)
            .isEqualTo(meetingSessionRetrieveRecordingsResponse)
    }
}
