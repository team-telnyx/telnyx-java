// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantUpdateResponseTest {

    @Test
    fun create() {
        val participantUpdateResponse =
            ParticipantUpdateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .callSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("coaching_call_sid")
                .coachingCallSidLegacy("coaching_call_sid_legacy")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantUpdateResponse.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        assertThat(participantUpdateResponse.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(participantUpdateResponse.apiVersion()).contains("v2/texml")
        assertThat(participantUpdateResponse.callSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantUpdateResponse.callSidLegacy())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantUpdateResponse.coaching()).contains(false)
        assertThat(participantUpdateResponse.coachingCallSid()).contains("coaching_call_sid")
        assertThat(participantUpdateResponse.coachingCallSidLegacy())
            .contains("coaching_call_sid_legacy")
        assertThat(participantUpdateResponse.dateCreated())
            .contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(participantUpdateResponse.dateUpdated())
            .contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(participantUpdateResponse.endConferenceOnExit()).contains(false)
        assertThat(participantUpdateResponse.hold()).contains(false)
        assertThat(participantUpdateResponse.muted()).contains(false)
        assertThat(participantUpdateResponse.status())
            .contains(ParticipantUpdateResponse.Status.COMPLETED)
        assertThat(participantUpdateResponse.uri())
            .contains(
                "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantUpdateResponse =
            ParticipantUpdateResponse.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .callSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("coaching_call_sid")
                .coachingCallSidLegacy("coaching_call_sid_legacy")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantUpdateResponse.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        val roundtrippedParticipantUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantUpdateResponse),
                jacksonTypeRef<ParticipantUpdateResponse>(),
            )

        assertThat(roundtrippedParticipantUpdateResponse).isEqualTo(participantUpdateResponse)
    }
}
