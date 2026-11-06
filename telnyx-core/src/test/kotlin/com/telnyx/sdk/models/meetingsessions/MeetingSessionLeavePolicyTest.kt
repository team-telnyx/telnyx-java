// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionLeavePolicyTest {

    @Test
    fun create() {
        val meetingSessionLeavePolicy =
            MeetingSessionLeavePolicy.builder()
                .aloneSeconds(1L)
                .addBotNameKeyword("x")
                .hostWaitSeconds(1L)
                .lobbyWaitSeconds(1L)
                .maxDurationSeconds(1L)
                .silenceGraceSeconds(1L)
                .silenceSeconds(1L)
                .build()

        assertThat(meetingSessionLeavePolicy.aloneSeconds()).contains(1L)
        assertThat(meetingSessionLeavePolicy.botNameKeywords().getOrNull()).containsExactly("x")
        assertThat(meetingSessionLeavePolicy.hostWaitSeconds()).contains(1L)
        assertThat(meetingSessionLeavePolicy.lobbyWaitSeconds()).contains(1L)
        assertThat(meetingSessionLeavePolicy.maxDurationSeconds()).contains(1L)
        assertThat(meetingSessionLeavePolicy.silenceGraceSeconds()).contains(1L)
        assertThat(meetingSessionLeavePolicy.silenceSeconds()).contains(1L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionLeavePolicy =
            MeetingSessionLeavePolicy.builder()
                .aloneSeconds(1L)
                .addBotNameKeyword("x")
                .hostWaitSeconds(1L)
                .lobbyWaitSeconds(1L)
                .maxDurationSeconds(1L)
                .silenceGraceSeconds(1L)
                .silenceSeconds(1L)
                .build()

        val roundtrippedMeetingSessionLeavePolicy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionLeavePolicy),
                jacksonTypeRef<MeetingSessionLeavePolicy>(),
            )

        assertThat(roundtrippedMeetingSessionLeavePolicy).isEqualTo(meetingSessionLeavePolicy)
    }
}
