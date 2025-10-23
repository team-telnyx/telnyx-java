// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionsParticipantsRequestTest {

    @Test
    fun create() {
        val actionsParticipantsRequest =
            ActionsParticipantsRequest.builder()
                .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                .build()

        assertThat(actionsParticipantsRequest.exclude().getOrNull())
            .containsExactly("7b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(actionsParticipantsRequest.participants())
            .contains(
                ActionsParticipantsRequest.Participants.ofUnionMember0(
                    ActionsParticipantsRequest.Participants.UnionMember0.ALL
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionsParticipantsRequest =
            ActionsParticipantsRequest.builder()
                .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                .build()

        val roundtrippedActionsParticipantsRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionsParticipantsRequest),
                jacksonTypeRef<ActionsParticipantsRequest>(),
            )

        assertThat(roundtrippedActionsParticipantsRequest).isEqualTo(actionsParticipantsRequest)
    }
}
