// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantParticipantsResponseTest {

    @Test
    fun create() {
        val participantParticipantsResponse =
            ParticipantParticipantsResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantParticipantsResponse.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        assertThat(participantParticipantsResponse.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(participantParticipantsResponse.callSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantParticipantsResponse.coaching()).contains(false)
        assertThat(participantParticipantsResponse.coachingCallSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantParticipantsResponse.endConferenceOnExit()).contains(false)
        assertThat(participantParticipantsResponse.hold()).contains(false)
        assertThat(participantParticipantsResponse.muted()).contains(false)
        assertThat(participantParticipantsResponse.status())
            .contains(ParticipantParticipantsResponse.Status.COMPLETED)
        assertThat(participantParticipantsResponse.uri())
            .contains(
                "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantParticipantsResponse =
            ParticipantParticipantsResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantParticipantsResponse.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        val roundtrippedParticipantParticipantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantParticipantsResponse),
                jacksonTypeRef<ParticipantParticipantsResponse>(),
            )

        assertThat(roundtrippedParticipantParticipantsResponse)
            .isEqualTo(participantParticipantsResponse)
    }
}
