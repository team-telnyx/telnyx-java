// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.texml.accounts.conferences.participants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ParticipantRetrieveParticipantsResponseTest {

    @Test
    fun create() {
        val participantRetrieveParticipantsResponse =
            ParticipantRetrieveParticipantsResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
                )
                .nextPageUri("next_page_uri")
                .page(0L)
                .pageSize(20L)
                .addParticipant(
                    ParticipantRetrieveParticipantsResponse.Participant.builder()
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
                        .status(
                            ParticipantRetrieveParticipantsResponse.Participant.Status.COMPLETED
                        )
                        .uri(
                            "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
                )
                .build()

        assertThat(participantRetrieveParticipantsResponse.end()).contains(0L)
        assertThat(participantRetrieveParticipantsResponse.firstPageUri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
            )
        assertThat(participantRetrieveParticipantsResponse.nextPageUri()).contains("next_page_uri")
        assertThat(participantRetrieveParticipantsResponse.page()).contains(0L)
        assertThat(participantRetrieveParticipantsResponse.pageSize()).contains(20L)
        assertThat(participantRetrieveParticipantsResponse.participants().getOrNull())
            .containsExactly(
                ParticipantRetrieveParticipantsResponse.Participant.builder()
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
                    .status(ParticipantRetrieveParticipantsResponse.Participant.Status.COMPLETED)
                    .uri(
                        "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                    )
                    .build()
            )
        assertThat(participantRetrieveParticipantsResponse.start()).contains(0L)
        assertThat(participantRetrieveParticipantsResponse.uri())
            .contains(
                "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val participantRetrieveParticipantsResponse =
            ParticipantRetrieveParticipantsResponse.builder()
                .end(0L)
                .firstPageUri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
                )
                .nextPageUri("next_page_uri")
                .page(0L)
                .pageSize(20L)
                .addParticipant(
                    ParticipantRetrieveParticipantsResponse.Participant.builder()
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
                        .status(
                            ParticipantRetrieveParticipantsResponse.Participant.Status.COMPLETED
                        )
                        .uri(
                            "/v2/texml/Accounts/4e71926f-8f13-450e-b91c-23c2ef786aa6/Conferences/cd5a70f4-759b-4d5e-9c06-88c00f16f3c1/Participants/v3:9X2vxPDFY2RHSJ1EdMS0RHRksMTg7ldNxdjWbVr9zBjbGjGsSe-aiQ.json"
                        )
                        .build()
                )
                .start(0L)
                .uri(
                    "/v2/texml/Accounts/61bf923e-5e4d-4595-a110-56190ea18a1b/Conferences/6dc6cc1a-1ba1-4351-86b8-4c22c95cd98f/Participants.json?page=0&pagesize=20"
                )
                .build()

        val roundtrippedParticipantRetrieveParticipantsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(participantRetrieveParticipantsResponse),
                jacksonTypeRef<ParticipantRetrieveParticipantsResponse>(),
            )

        assertThat(roundtrippedParticipantRetrieveParticipantsResponse)
            .isEqualTo(participantRetrieveParticipantsResponse)
    }
}
