// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceParticipantSpeakEndedWebhookEventTest {

    @Test
    fun create() {
        val conferenceParticipantSpeakEndedWebhookEvent =
            ConferenceParticipantSpeakEndedWebhookEvent.builder()
                .data(
                    ConferenceParticipantSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.EventType
                                .CONFERENCE_PARTICIPANT_SPEAK_ENDED
                        )
                        .payload(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        assertThat(conferenceParticipantSpeakEndedWebhookEvent.data())
            .contains(
                ConferenceParticipantSpeakEndedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(
                        ConferenceParticipantSpeakEndedWebhookEvent.Data.EventType
                            .CONFERENCE_PARTICIPANT_SPEAK_ENDED
                    )
                    .payload(
                        ConferenceParticipantSpeakEndedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                            .build()
                    )
                    .recordType(ConferenceParticipantSpeakEndedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceParticipantSpeakEndedWebhookEvent =
            ConferenceParticipantSpeakEndedWebhookEvent.builder()
                .data(
                    ConferenceParticipantSpeakEndedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.EventType
                                .CONFERENCE_PARTICIPANT_SPEAK_ENDED
                        )
                        .payload(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .creatorCallSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                                .build()
                        )
                        .recordType(
                            ConferenceParticipantSpeakEndedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        val roundtrippedConferenceParticipantSpeakEndedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceParticipantSpeakEndedWebhookEvent),
                jacksonTypeRef<ConferenceParticipantSpeakEndedWebhookEvent>(),
            )

        assertThat(roundtrippedConferenceParticipantSpeakEndedWebhookEvent)
            .isEqualTo(conferenceParticipantSpeakEndedWebhookEvent)
    }
}
