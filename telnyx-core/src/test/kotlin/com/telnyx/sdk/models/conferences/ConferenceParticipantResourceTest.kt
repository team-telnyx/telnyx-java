// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceParticipantResourceTest {

    @Test
    fun create() {
        val conferenceParticipantResource =
            ConferenceParticipantResource.builder()
                .data(
                    ConferenceParticipant.builder()
                        .id("id")
                        .callControlId("call_control_id")
                        .callLegId("call_leg_id")
                        .conferenceId("conference_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endConferenceOnExit(true)
                        .label("label")
                        .muted(true)
                        .onHold(true)
                        .softEndConferenceOnExit(true)
                        .status(ConferenceParticipant.Status.JOINING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addWhisperCallControlId("string")
                        .build()
                )
                .build()

        assertThat(conferenceParticipantResource.data())
            .contains(
                ConferenceParticipant.builder()
                    .id("id")
                    .callControlId("call_control_id")
                    .callLegId("call_leg_id")
                    .conferenceId("conference_id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .endConferenceOnExit(true)
                    .label("label")
                    .muted(true)
                    .onHold(true)
                    .softEndConferenceOnExit(true)
                    .status(ConferenceParticipant.Status.JOINING)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .addWhisperCallControlId("string")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceParticipantResource =
            ConferenceParticipantResource.builder()
                .data(
                    ConferenceParticipant.builder()
                        .id("id")
                        .callControlId("call_control_id")
                        .callLegId("call_leg_id")
                        .conferenceId("conference_id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .endConferenceOnExit(true)
                        .label("label")
                        .muted(true)
                        .onHold(true)
                        .softEndConferenceOnExit(true)
                        .status(ConferenceParticipant.Status.JOINING)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .addWhisperCallControlId("string")
                        .build()
                )
                .build()

        val roundtrippedConferenceParticipantResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceParticipantResource),
                jacksonTypeRef<ConferenceParticipantResource>(),
            )

        assertThat(roundtrippedConferenceParticipantResource)
            .isEqualTo(conferenceParticipantResource)
    }
}
