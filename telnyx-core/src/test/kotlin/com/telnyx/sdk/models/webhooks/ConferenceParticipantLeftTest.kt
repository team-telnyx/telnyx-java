// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceParticipantLeftTest {

    @Test
    fun create() {
        val conferenceParticipantLeft =
            ConferenceParticipantLeft.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferenceParticipantLeft.EventType.CONFERENCE_PARTICIPANT_LEFT)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    ConferenceParticipantLeft.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .build()
                )
                .recordType(ConferenceParticipantLeft.RecordType.EVENT)
                .build()

        assertThat(conferenceParticipantLeft.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(conferenceParticipantLeft.eventType())
            .contains(ConferenceParticipantLeft.EventType.CONFERENCE_PARTICIPANT_LEFT)
        assertThat(conferenceParticipantLeft.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(conferenceParticipantLeft.payload())
            .contains(
                ConferenceParticipantLeft.Payload.builder()
                    .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .build()
            )
        assertThat(conferenceParticipantLeft.recordType())
            .contains(ConferenceParticipantLeft.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceParticipantLeft =
            ConferenceParticipantLeft.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(ConferenceParticipantLeft.EventType.CONFERENCE_PARTICIPANT_LEFT)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    ConferenceParticipantLeft.Payload.builder()
                        .callControlId("v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg")
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .conferenceId("428c31b6-abf3-3bc1-b7f4-5013ef9657c1")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .build()
                )
                .recordType(ConferenceParticipantLeft.RecordType.EVENT)
                .build()

        val roundtrippedConferenceParticipantLeft =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceParticipantLeft),
                jacksonTypeRef<ConferenceParticipantLeft>(),
            )

        assertThat(roundtrippedConferenceParticipantLeft).isEqualTo(conferenceParticipantLeft)
    }
}
