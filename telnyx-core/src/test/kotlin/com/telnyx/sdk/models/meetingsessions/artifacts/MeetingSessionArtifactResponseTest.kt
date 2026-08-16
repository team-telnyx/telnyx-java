// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.artifacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionArtifactResponseTest {

    @Test
    fun create() {
        val meetingSessionArtifactResponse =
            MeetingSessionArtifactResponse.builder()
                .data(
                    MeetingSessionArtifact.builder()
                        .id("mtgart_550e8400-e29b-41d4-a716-446655440000")
                        .content(MeetingSessionArtifact.Content.builder().text("text").build())
                        .createdAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                        .failureReason(null)
                        .modelProvenance(
                            MeetingSessionArtifact.ModelProvenance.builder()
                                .model("model")
                                .provider("provider")
                                .build()
                        )
                        .sessionId("mtgsess_550e8400-e29b-41d4-a716-446655440001")
                        .status(MeetingSessionArtifact.Status.PENDING)
                        .type(MeetingSessionArtifact.Type.ACTION_ITEMS)
                        .updatedAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                        .build()
                )
                .build()

        assertThat(meetingSessionArtifactResponse.data())
            .isEqualTo(
                MeetingSessionArtifact.builder()
                    .id("mtgart_550e8400-e29b-41d4-a716-446655440000")
                    .content(MeetingSessionArtifact.Content.builder().text("text").build())
                    .createdAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                    .failureReason(null)
                    .modelProvenance(
                        MeetingSessionArtifact.ModelProvenance.builder()
                            .model("model")
                            .provider("provider")
                            .build()
                    )
                    .sessionId("mtgsess_550e8400-e29b-41d4-a716-446655440001")
                    .status(MeetingSessionArtifact.Status.PENDING)
                    .type(MeetingSessionArtifact.Type.ACTION_ITEMS)
                    .updatedAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionArtifactResponse =
            MeetingSessionArtifactResponse.builder()
                .data(
                    MeetingSessionArtifact.builder()
                        .id("mtgart_550e8400-e29b-41d4-a716-446655440000")
                        .content(MeetingSessionArtifact.Content.builder().text("text").build())
                        .createdAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                        .failureReason(null)
                        .modelProvenance(
                            MeetingSessionArtifact.ModelProvenance.builder()
                                .model("model")
                                .provider("provider")
                                .build()
                        )
                        .sessionId("mtgsess_550e8400-e29b-41d4-a716-446655440001")
                        .status(MeetingSessionArtifact.Status.PENDING)
                        .type(MeetingSessionArtifact.Type.ACTION_ITEMS)
                        .updatedAt(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
                        .build()
                )
                .build()

        val roundtrippedMeetingSessionArtifactResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionArtifactResponse),
                jacksonTypeRef<MeetingSessionArtifactResponse>(),
            )

        assertThat(roundtrippedMeetingSessionArtifactResponse)
            .isEqualTo(meetingSessionArtifactResponse)
    }
}
