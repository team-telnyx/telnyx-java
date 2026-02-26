// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceParticipantTest {

    @Test
    fun create() {
        val conferenceParticipant =
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

        assertThat(conferenceParticipant.id()).contains("id")
        assertThat(conferenceParticipant.callControlId()).contains("call_control_id")
        assertThat(conferenceParticipant.callLegId()).contains("call_leg_id")
        assertThat(conferenceParticipant.conferenceId()).contains("conference_id")
        assertThat(conferenceParticipant.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conferenceParticipant.endConferenceOnExit()).contains(true)
        assertThat(conferenceParticipant.label()).contains("label")
        assertThat(conferenceParticipant.muted()).contains(true)
        assertThat(conferenceParticipant.onHold()).contains(true)
        assertThat(conferenceParticipant.softEndConferenceOnExit()).contains(true)
        assertThat(conferenceParticipant.status()).contains(ConferenceParticipant.Status.JOINING)
        assertThat(conferenceParticipant.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(conferenceParticipant.whisperCallControlIds().getOrNull())
            .containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val conferenceParticipant =
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

        val roundtrippedConferenceParticipant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(conferenceParticipant),
                jacksonTypeRef<ConferenceParticipant>(),
            )

        assertThat(roundtrippedConferenceParticipant).isEqualTo(conferenceParticipant)
    }
}
