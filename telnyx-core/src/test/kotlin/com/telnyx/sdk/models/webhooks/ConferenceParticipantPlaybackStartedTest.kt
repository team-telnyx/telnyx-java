// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceParticipantPlaybackStartedTest {

    @Test
    fun create() {
        val conferenceParticipantPlaybackStarted =
            ConferenceParticipantPlaybackStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    ConferenceParticipantPlaybackStarted.EventType
                        .CONFERENCE_PARTICIPANT_PLAYBACK_STARTED
                )
                .payload(
                    ConferenceParticipantPlaybackStarted.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferenceParticipantPlaybackStarted.RecordType.EVENT)
                .build()

        assertThat(conferenceParticipantPlaybackStarted.id())
            .contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(conferenceParticipantPlaybackStarted.eventType())
            .contains(
                ConferenceParticipantPlaybackStarted.EventType
                    .CONFERENCE_PARTICIPANT_PLAYBACK_STARTED
            )
        assertThat(conferenceParticipantPlaybackStarted.payload())
            .contains(
                ConferenceParticipantPlaybackStarted.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .mediaUrl("https://www.example.com/audio.mp3")
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(conferenceParticipantPlaybackStarted.recordType())
            .contains(ConferenceParticipantPlaybackStarted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceParticipantPlaybackStarted =
            ConferenceParticipantPlaybackStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(
                    ConferenceParticipantPlaybackStarted.EventType
                        .CONFERENCE_PARTICIPANT_PLAYBACK_STARTED
                )
                .payload(
                    ConferenceParticipantPlaybackStarted.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferenceParticipantPlaybackStarted.RecordType.EVENT)
                .build()

        val roundtrippedConferenceParticipantPlaybackStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceParticipantPlaybackStarted),
                jacksonTypeRef<ConferenceParticipantPlaybackStarted>(),
            )

        assertThat(roundtrippedConferenceParticipantPlaybackStarted)
            .isEqualTo(conferenceParticipantPlaybackStarted)
    }
}
