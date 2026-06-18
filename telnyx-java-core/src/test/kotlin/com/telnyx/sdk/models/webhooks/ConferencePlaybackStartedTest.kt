// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferencePlaybackStartedTest {

    @Test
    fun create() {
        val conferencePlaybackStarted =
            ConferencePlaybackStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferencePlaybackStarted.EventType.CONFERENCE_PLAYBACK_STARTED)
                .payload(
                    ConferencePlaybackStarted.Payload.builder()
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferencePlaybackStarted.RecordType.EVENT)
                .build()

        assertThat(conferencePlaybackStarted.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(conferencePlaybackStarted.eventType())
            .contains(ConferencePlaybackStarted.EventType.CONFERENCE_PLAYBACK_STARTED)
        assertThat(conferencePlaybackStarted.payload())
            .contains(
                ConferencePlaybackStarted.Payload.builder()
                    .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .mediaName("my_media_uploaded_to_media_storage_api")
                    .mediaUrl("https://www.example.com/audio.mp3")
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(conferencePlaybackStarted.recordType())
            .contains(ConferencePlaybackStarted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferencePlaybackStarted =
            ConferencePlaybackStarted.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferencePlaybackStarted.EventType.CONFERENCE_PLAYBACK_STARTED)
                .payload(
                    ConferencePlaybackStarted.Payload.builder()
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .mediaName("my_media_uploaded_to_media_storage_api")
                        .mediaUrl("https://www.example.com/audio.mp3")
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .recordType(ConferencePlaybackStarted.RecordType.EVENT)
                .build()

        val roundtrippedConferencePlaybackStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferencePlaybackStarted),
                jacksonTypeRef<ConferencePlaybackStarted>(),
            )

        assertThat(roundtrippedConferencePlaybackStarted).isEqualTo(conferencePlaybackStarted)
    }
}
