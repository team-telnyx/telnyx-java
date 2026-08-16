// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionDeleteRecordingMediaResponseTest {

    @Test
    fun create() {
        val meetingSessionDeleteRecordingMediaResponse =
            MeetingSessionDeleteRecordingMediaResponse.builder()
                .data(
                    MeetingSessionDeleteRecordingMediaResponse.Data.builder()
                        .deletionStatus(
                            MeetingSessionDeleteRecordingMediaResponse.Data.DeletionStatus.REQUESTED
                        )
                        .meetingSessionId("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                        .build()
                )
                .build()

        assertThat(meetingSessionDeleteRecordingMediaResponse.data())
            .isEqualTo(
                MeetingSessionDeleteRecordingMediaResponse.Data.builder()
                    .deletionStatus(
                        MeetingSessionDeleteRecordingMediaResponse.Data.DeletionStatus.REQUESTED
                    )
                    .meetingSessionId("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionDeleteRecordingMediaResponse =
            MeetingSessionDeleteRecordingMediaResponse.builder()
                .data(
                    MeetingSessionDeleteRecordingMediaResponse.Data.builder()
                        .deletionStatus(
                            MeetingSessionDeleteRecordingMediaResponse.Data.DeletionStatus.REQUESTED
                        )
                        .meetingSessionId("mtgsess_a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                        .build()
                )
                .build()

        val roundtrippedMeetingSessionDeleteRecordingMediaResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionDeleteRecordingMediaResponse),
                jacksonTypeRef<MeetingSessionDeleteRecordingMediaResponse>(),
            )

        assertThat(roundtrippedMeetingSessionDeleteRecordingMediaResponse)
            .isEqualTo(meetingSessionDeleteRecordingMediaResponse)
    }
}
