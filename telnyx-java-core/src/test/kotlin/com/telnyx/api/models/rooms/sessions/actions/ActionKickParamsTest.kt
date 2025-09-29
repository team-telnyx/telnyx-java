// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.sessions.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionKickParamsTest {

    @Test
    fun create() {
        ActionKickParams.builder()
            .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
            .actionsParticipantsRequest(
                ActionsParticipantsRequest.builder()
                    .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                    .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionKickParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .actionsParticipantsRequest(ActionsParticipantsRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionKickParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .actionsParticipantsRequest(
                    ActionsParticipantsRequest.builder()
                        .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                        .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                ActionsParticipantsRequest.builder()
                    .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                    .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionKickParams.builder()
                .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .actionsParticipantsRequest(ActionsParticipantsRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(ActionsParticipantsRequest.builder().build())
    }
}
