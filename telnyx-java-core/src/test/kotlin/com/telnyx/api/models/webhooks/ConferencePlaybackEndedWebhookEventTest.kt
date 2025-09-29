// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferencePlaybackEndedWebhookEventTest {

    @Test
    fun create() {
        val conferencePlaybackEndedWebhookEvent =
            ConferencePlaybackEndedWebhookEvent.builder()
                .data(
                    ConferencePlaybackEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferencePlaybackEndedWebhookEvent.Data.EventType
                                .CONFERENCE_PLAYBACK_ENDED
                        )
                        .payload(
                            ConferencePlaybackEndedWebhookEvent.Data.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .mediaUrl("https://www.example.com/audio.mp3")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferencePlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(conferencePlaybackEndedWebhookEvent.data())
            .contains(
                ConferencePlaybackEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        ConferencePlaybackEndedWebhookEvent.Data.EventType.CONFERENCE_PLAYBACK_ENDED
                    )
                    .payload(
                        ConferencePlaybackEndedWebhookEvent.Data.Payload.builder()
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .mediaName("my_media_uploaded_to_media_storage_api")
                            .mediaUrl("https://www.example.com/audio.mp3")
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .build()
                    )
                    .recordType(ConferencePlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferencePlaybackEndedWebhookEvent =
            ConferencePlaybackEndedWebhookEvent.builder()
                .data(
                    ConferencePlaybackEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferencePlaybackEndedWebhookEvent.Data.EventType
                                .CONFERENCE_PLAYBACK_ENDED
                        )
                        .payload(
                            ConferencePlaybackEndedWebhookEvent.Data.Payload.builder()
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .mediaName("my_media_uploaded_to_media_storage_api")
                                .mediaUrl("https://www.example.com/audio.mp3")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(ConferencePlaybackEndedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedConferencePlaybackEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferencePlaybackEndedWebhookEvent),
                jacksonTypeRef<ConferencePlaybackEndedWebhookEvent>(),
            )

        assertThat(roundtrippedConferencePlaybackEndedWebhookEvent)
            .isEqualTo(conferencePlaybackEndedWebhookEvent)
    }
}
