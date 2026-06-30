// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantUpdateParamsTest {

    @Test
    fun create() {
        ParticipantUpdateParams.builder()
            .accountSid("account_sid")
            .conferenceSid("conference_sid")
            .callSidOrParticipantLabel("call_sid_or_participant_label")
            .announceMethod(ParticipantUpdateParams.AnnounceMethod.GET)
            .announceUrl("https://www.example.com/announce.xml")
            .beepOnExit(false)
            .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
            .coaching(false)
            .endConferenceOnExit(false)
            .hold(true)
            .holdMethod(ParticipantUpdateParams.HoldMethod.POST)
            .holdUrl("https://www.example.com/hold-music.xml")
            .muted(true)
            .waitUrl("https://www.example.com/wait_music.mp3")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ParticipantUpdateParams.builder()
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

    @Test
    fun body() {
        val params =
            ParticipantUpdateParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .callSidOrParticipantLabel("call_sid_or_participant_label")
                .announceMethod(ParticipantUpdateParams.AnnounceMethod.GET)
                .announceUrl("https://www.example.com/announce.xml")
                .beepOnExit(false)
                .callSidToCoach("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .endConferenceOnExit(false)
                .hold(true)
                .holdMethod(ParticipantUpdateParams.HoldMethod.POST)
                .holdUrl("https://www.example.com/hold-music.xml")
                .muted(true)
                .waitUrl("https://www.example.com/wait_music.mp3")
                .build()

        val body = params._body()

        assertThat(body.announceMethod()).contains(ParticipantUpdateParams.AnnounceMethod.GET)
        assertThat(body.announceUrl()).contains("https://www.example.com/announce.xml")
        assertThat(body.beepOnExit()).contains(false)
        assertThat(body.callSidToCoach())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(body.coaching()).contains(false)
        assertThat(body.endConferenceOnExit()).contains(false)
        assertThat(body.hold()).contains(true)
        assertThat(body.holdMethod()).contains(ParticipantUpdateParams.HoldMethod.POST)
        assertThat(body.holdUrl()).contains("https://www.example.com/hold-music.xml")
        assertThat(body.muted()).contains(true)
        assertThat(body.waitUrl()).contains("https://www.example.com/wait_music.mp3")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ParticipantUpdateParams.builder()
                .accountSid("account_sid")
                .conferenceSid("conference_sid")
                .callSidOrParticipantLabel("call_sid_or_participant_label")
                .build()

        val body = params._body()
    }
}
