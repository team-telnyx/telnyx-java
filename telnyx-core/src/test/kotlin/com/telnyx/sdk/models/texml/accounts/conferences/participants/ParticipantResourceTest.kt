// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantResourceTest {

    @Test
    fun create() {
        val participantResource =
            ParticipantResource.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .callSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coachingCallSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantResource.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        assertThat(participantResource.accountSid())
            .contains("4e71926f-8f13-450e-b91c-23c2ef786aa6")
        assertThat(participantResource.apiVersion()).contains("v2/texml")
        assertThat(participantResource.callSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantResource.callSidLegacy())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantResource.coaching()).contains(false)
        assertThat(participantResource.coachingCallSid())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantResource.coachingCallSidLegacy())
            .contains("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
        assertThat(participantResource.conferenceSid())
            .contains("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
        assertThat(participantResource.dateCreated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(participantResource.dateUpdated()).contains("Fri, 27 Oct 2023 07:41:58 +0000")
        assertThat(participantResource.endConferenceOnExit()).contains(false)
        assertThat(participantResource.hold()).contains(false)
        assertThat(participantResource.muted()).contains(false)
        assertThat(participantResource.status()).contains(ParticipantResource.Status.COMPLETED)
        assertThat(participantResource.uri())
            .contains(
                "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantResource =
            ParticipantResource.builder()
                .accountSid("4e71926f-8f13-450e-b91c-23c2ef786aa6")
                .apiVersion("v2/texml")
                .callSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .callSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coaching(false)
                .coachingCallSid("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .coachingCallSidLegacy("v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ")
                .conferenceSid("cd5a70f4-759b-4d5e-9c06-88c00f16f3c1")
                .dateCreated("Fri, 27 Oct 2023 07:41:58 +0000")
                .dateUpdated("Fri, 27 Oct 2023 07:41:58 +0000")
                .endConferenceOnExit(false)
                .hold(false)
                .muted(false)
                .status(ParticipantResource.Status.COMPLETED)
                .uri(
                    "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                )
                .build()

        val roundtrippedParticipantResource =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantResource),
                jacksonTypeRef<ParticipantResource>(),
            )

        assertThat(roundtrippedParticipantResource).isEqualTo(participantResource)
    }
}
