// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRecordingDestinationTest {

    @Test
    fun create() {
        val meetingSessionRecordingDestination =
            MeetingSessionRecordingDestination.builder().bucket("bucket").prefix("prefix").build()

        assertThat(meetingSessionRecordingDestination.bucket()).isEqualTo("bucket")
        assertThat(meetingSessionRecordingDestination.prefix()).contains("prefix")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionRecordingDestination =
            MeetingSessionRecordingDestination.builder().bucket("bucket").prefix("prefix").build()

        val roundtrippedMeetingSessionRecordingDestination =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionRecordingDestination),
                jacksonTypeRef<MeetingSessionRecordingDestination>(),
            )

        assertThat(roundtrippedMeetingSessionRecordingDestination)
            .isEqualTo(meetingSessionRecordingDestination)
    }
}
