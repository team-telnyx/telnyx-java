// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calendarconnections

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MeetingSessionAssistantTest {

    @Test
    fun create() {
        val meetingSessionAssistant =
            MeetingSessionAssistant.builder()
                .id("id")
                .audioGate(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
                .leaveOnEnd(true)
                .dynamicVariables(
                    MeetingSessionAssistant.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(meetingSessionAssistant.id()).isEqualTo("id")
        assertThat(meetingSessionAssistant.audioGate())
            .isEqualTo(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
        assertThat(meetingSessionAssistant.leaveOnEnd()).isEqualTo(true)
        assertThat(meetingSessionAssistant.dynamicVariables())
            .contains(
                MeetingSessionAssistant.DynamicVariables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val meetingSessionAssistant =
            MeetingSessionAssistant.builder()
                .id("id")
                .audioGate(MeetingSessionAssistant.AudioGate.HALF_DUPLEX)
                .leaveOnEnd(true)
                .dynamicVariables(
                    MeetingSessionAssistant.DynamicVariables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedMeetingSessionAssistant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(meetingSessionAssistant),
                jacksonTypeRef<MeetingSessionAssistant>(),
            )

        assertThat(roundtrippedMeetingSessionAssistant).isEqualTo(meetingSessionAssistant)
    }
}
