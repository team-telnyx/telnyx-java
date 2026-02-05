// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceRecordingSavedWebhookEventTest {

    @Test
    fun create() {
        val conferenceRecordingSavedWebhookEvent =
            ConferenceRecordingSavedWebhookEvent.builder()
                .data(
                    ConferenceRecordingSaved.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceRecordingSaved.EventType.CONFERENCE_RECORDING_SAVED)
                        .payload(
                            ConferenceRecordingSaved.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .channels(ConferenceRecordingSaved.Payload.Channels.SINGLE)
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .format(ConferenceRecordingSaved.Payload.Format.MP3)
                                .publicRecordingUrls(
                                    ConferenceRecordingSaved.Payload.PublicRecordingUrls.builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .recordingEndedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingId("4577f9a2-cf0e-44f3-ac57-9f95fb03fa47")
                                .recordingStartedAt(
                                    OffsetDateTime.parse("2021-05-11T10:17:03.692107Z")
                                )
                                .recordingUrls(
                                    ConferenceRecordingSaved.Payload.RecordingUrls.builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .build()
                        )
                        .recordType(ConferenceRecordingSaved.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(conferenceRecordingSavedWebhookEvent.data())
            .contains(
                ConferenceRecordingSaved.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(ConferenceRecordingSaved.EventType.CONFERENCE_RECORDING_SAVED)
                    .payload(
                        ConferenceRecordingSaved.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .channels(ConferenceRecordingSaved.Payload.Channels.SINGLE)
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .format(ConferenceRecordingSaved.Payload.Format.MP3)
                            .publicRecordingUrls(
                                ConferenceRecordingSaved.Payload.PublicRecordingUrls.builder()
                                    .mp3("http://example.com/recording.mp3")
                                    .wav("http://example.com/recording.wav")
                                    .build()
                            )
                            .recordingEndedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                            .recordingId("4577f9a2-cf0e-44f3-ac57-9f95fb03fa47")
                            .recordingStartedAt(OffsetDateTime.parse("2021-05-11T10:17:03.692107Z"))
                            .recordingUrls(
                                ConferenceRecordingSaved.Payload.RecordingUrls.builder()
                                    .mp3("http://example.com/recording.mp3")
                                    .wav("http://example.com/recording.wav")
                                    .build()
                            )
                            .build()
                    )
                    .recordType(ConferenceRecordingSaved.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceRecordingSavedWebhookEvent =
            ConferenceRecordingSavedWebhookEvent.builder()
                .data(
                    ConferenceRecordingSaved.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(ConferenceRecordingSaved.EventType.CONFERENCE_RECORDING_SAVED)
                        .payload(
                            ConferenceRecordingSaved.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .channels(ConferenceRecordingSaved.Payload.Channels.SINGLE)
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .format(ConferenceRecordingSaved.Payload.Format.MP3)
                                .publicRecordingUrls(
                                    ConferenceRecordingSaved.Payload.PublicRecordingUrls.builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .recordingEndedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingId("4577f9a2-cf0e-44f3-ac57-9f95fb03fa47")
                                .recordingStartedAt(
                                    OffsetDateTime.parse("2021-05-11T10:17:03.692107Z")
                                )
                                .recordingUrls(
                                    ConferenceRecordingSaved.Payload.RecordingUrls.builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .build()
                        )
                        .recordType(ConferenceRecordingSaved.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedConferenceRecordingSavedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceRecordingSavedWebhookEvent),
                jacksonTypeRef<ConferenceRecordingSavedWebhookEvent>(),
            )

        assertThat(roundtrippedConferenceRecordingSavedWebhookEvent)
            .isEqualTo(conferenceRecordingSavedWebhookEvent)
    }
}
