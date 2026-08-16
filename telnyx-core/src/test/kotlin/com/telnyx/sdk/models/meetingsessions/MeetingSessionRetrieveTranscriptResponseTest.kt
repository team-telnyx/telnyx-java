// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionRetrieveTranscriptResponseTest {

    @Test
    fun create() {
        val meetingSessionRetrieveTranscriptResponse =
            MeetingSessionRetrieveTranscriptResponse.builder()
                .addData(
                    MeetingSessionRetrieveTranscriptResponse.Data.builder()
                        .confidence(0.94)
                        .occurredAt(OffsetDateTime.parse("2026-06-16T09:00:42Z"))
                        .relativeTs(1240.5)
                        .seq(41L)
                        .speakerLabel("Ada L.")
                        .text("let's ship it")
                        .build()
                )
                .meta(
                    MeetingSessionRetrieveTranscriptResponse.Meta.builder().nextAfter(41L).build()
                )
                .build()

        assertThat(meetingSessionRetrieveTranscriptResponse.data())
            .containsExactly(
                MeetingSessionRetrieveTranscriptResponse.Data.builder()
                    .confidence(0.94)
                    .occurredAt(OffsetDateTime.parse("2026-06-16T09:00:42Z"))
                    .relativeTs(1240.5)
                    .seq(41L)
                    .speakerLabel("Ada L.")
                    .text("let's ship it")
                    .build()
            )
        assertThat(meetingSessionRetrieveTranscriptResponse.meta())
            .isEqualTo(
                MeetingSessionRetrieveTranscriptResponse.Meta.builder().nextAfter(41L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionRetrieveTranscriptResponse =
            MeetingSessionRetrieveTranscriptResponse.builder()
                .addData(
                    MeetingSessionRetrieveTranscriptResponse.Data.builder()
                        .confidence(0.94)
                        .occurredAt(OffsetDateTime.parse("2026-06-16T09:00:42Z"))
                        .relativeTs(1240.5)
                        .seq(41L)
                        .speakerLabel("Ada L.")
                        .text("let's ship it")
                        .build()
                )
                .meta(
                    MeetingSessionRetrieveTranscriptResponse.Meta.builder().nextAfter(41L).build()
                )
                .build()

        val roundtrippedMeetingSessionRetrieveTranscriptResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionRetrieveTranscriptResponse),
                jacksonTypeRef<MeetingSessionRetrieveTranscriptResponse>(),
            )

        assertThat(roundtrippedMeetingSessionRetrieveTranscriptResponse)
            .isEqualTo(meetingSessionRetrieveTranscriptResponse)
    }
}
