// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.artifacts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionArtifactTest {

    @Test
    fun create() {
        val meetingSessionArtifact =
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

        assertThat(meetingSessionArtifact.id())
            .isEqualTo("mtgart_550e8400-e29b-41d4-a716-446655440000")
        assertThat(meetingSessionArtifact.content())
            .contains(MeetingSessionArtifact.Content.builder().text("text").build())
        assertThat(meetingSessionArtifact.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
        assertThat(meetingSessionArtifact.failureReason()).isEmpty
        assertThat(meetingSessionArtifact.modelProvenance())
            .contains(
                MeetingSessionArtifact.ModelProvenance.builder()
                    .model("model")
                    .provider("provider")
                    .build()
            )
        assertThat(meetingSessionArtifact.sessionId())
            .isEqualTo("mtgsess_550e8400-e29b-41d4-a716-446655440001")
        assertThat(meetingSessionArtifact.status()).isEqualTo(MeetingSessionArtifact.Status.PENDING)
        assertThat(meetingSessionArtifact.type())
            .isEqualTo(MeetingSessionArtifact.Type.ACTION_ITEMS)
        assertThat(meetingSessionArtifact.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2025-01-15T10:30:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionArtifact =
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

        val roundtrippedMeetingSessionArtifact =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionArtifact),
                jacksonTypeRef<MeetingSessionArtifact>(),
            )

        assertThat(roundtrippedMeetingSessionArtifact).isEqualTo(meetingSessionArtifact)
    }
}
