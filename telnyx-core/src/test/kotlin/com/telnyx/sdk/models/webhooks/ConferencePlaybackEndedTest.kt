// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferencePlaybackEndedTest {

    @Test
    fun create() {
        val conferencePlaybackEnded =
            ConferencePlaybackEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferencePlaybackEnded.EventType.CONFERENCE_PLAYBACK_ENDED)
                .payload(
                    ConferencePlaybackEnded.Payload.builder()
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferencePlaybackEnded.RecordType.EVENT)
                .build()

        assertThat(conferencePlaybackEnded.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(conferencePlaybackEnded.eventType())
            .contains(ConferencePlaybackEnded.EventType.CONFERENCE_PLAYBACK_ENDED)
        assertThat(conferencePlaybackEnded.payload())
            .contains(
                ConferencePlaybackEnded.Payload.builder()
                    .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .mediaUrl("https://www.example.com/audio.mp3")
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(conferencePlaybackEnded.recordType())
            .contains(ConferencePlaybackEnded.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferencePlaybackEnded =
            ConferencePlaybackEnded.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferencePlaybackEnded.EventType.CONFERENCE_PLAYBACK_ENDED)
                .payload(
                    ConferencePlaybackEnded.Payload.builder()
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferencePlaybackEnded.RecordType.EVENT)
                .build()

        val roundtrippedConferencePlaybackEnded =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferencePlaybackEnded),
                jacksonTypeRef<ConferencePlaybackEnded>(),
            )

        assertThat(roundtrippedConferencePlaybackEnded).isEqualTo(conferencePlaybackEnded)
    }
}
