// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ConferenceUpdateParticipantParamsTest {

    @Test
    fun create() {
        ConferenceUpdateParticipantParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .participantId("participant_id")
            .beepEnabled(ConferenceUpdateParticipantParams.BeepEnabled.NEVER)
            .endConferenceOnExit(true)
            .softEndConferenceOnExit(false)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ConferenceUpdateParticipantParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .participantId("participant_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("participant_id")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ConferenceUpdateParticipantParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .participantId("participant_id")
                .beepEnabled(ConferenceUpdateParticipantParams.BeepEnabled.NEVER)
                .endConferenceOnExit(true)
                .softEndConferenceOnExit(false)
                .build()

        val body = params._body()

        assertThat(body.beepEnabled()).contains(ConferenceUpdateParticipantParams.BeepEnabled.NEVER)
        assertThat(body.endConferenceOnExit()).contains(true)
        assertThat(body.softEndConferenceOnExit()).contains(false)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ConferenceUpdateParticipantParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .participantId("participant_id")
                .build()

        val body = params._body()
    }
}
