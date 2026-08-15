// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveRecordingsResponseTest {

    @Test
    fun create() {
        val meetingSessionRetrieveRecordingsResponse =
            MeetingSessionRetrieveRecordingsResponse.builder()
                .addData(
                    MeetingSessionRetrieveRecordingsResponse.Data.builder()
                        .expiresAt("expires_at")
                        .type("type")
                        .url("https://example.com")
                        .build()
                )
                .build()

        assertThat(meetingSessionRetrieveRecordingsResponse.data())
            .containsExactly(
                MeetingSessionRetrieveRecordingsResponse.Data.builder()
                    .expiresAt("expires_at")
                    .type("type")
                    .url("https://example.com")
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
                        .expiresAt("expires_at")
                        .type("type")
                        .url("https://example.com")
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
