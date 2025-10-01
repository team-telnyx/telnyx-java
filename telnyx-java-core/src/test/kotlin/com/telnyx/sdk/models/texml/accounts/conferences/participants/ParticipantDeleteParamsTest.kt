// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantDeleteParamsTest {

    @Test
    fun create() {
        ParticipantDeleteParams.builder()
            .accountSid("account_sid")
            .conferenceSid("conference_sid")
            .callSidOrParticipantLabel("call_sid_or_participant_label")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantDeleteParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .callSidOrParticipantLabel("call_sid_or_participant_label")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("conference_sid")
        assertThat(params._pathParam(2)).isEqualTo("call_sid_or_participant_label")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
