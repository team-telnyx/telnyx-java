// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRecordingExportTest {

    @Test
    fun create() {
        val meetingSessionRecordingExport =
            MeetingSessionRecordingExport.builder()
                .bucket("bucket")
                .bytes(0L)
                .exportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .region("region")
                .status(MeetingSessionRecordingExport.Status.PENDING)
                .build()

        assertThat(meetingSessionRecordingExport.bucket()).isEqualTo("bucket")
        assertThat(meetingSessionRecordingExport.bytes()).contains(0L)
        assertThat(meetingSessionRecordingExport.exportedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(meetingSessionRecordingExport.key()).isEqualTo("key")
        assertThat(meetingSessionRecordingExport.region()).isEqualTo("region")
        assertThat(meetingSessionRecordingExport.status())
            .isEqualTo(MeetingSessionRecordingExport.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionRecordingExport =
            MeetingSessionRecordingExport.builder()
                .bucket("bucket")
                .bytes(0L)
                .exportedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .key("key")
                .region("region")
                .status(MeetingSessionRecordingExport.Status.PENDING)
                .build()

        val roundtrippedMeetingSessionRecordingExport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionRecordingExport),
                jacksonTypeRef<MeetingSessionRecordingExport>(),
            )

        assertThat(roundtrippedMeetingSessionRecordingExport)
            .isEqualTo(meetingSessionRecordingExport)
    }
}
