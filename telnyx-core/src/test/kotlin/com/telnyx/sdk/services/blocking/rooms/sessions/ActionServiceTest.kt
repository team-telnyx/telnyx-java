// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms.sessions

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionsParticipantsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.rooms().sessions().actions()

        val response = actionService.end("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun kick() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.rooms().sessions().actions()

        val response =
            actionService.kick(
                ActionKickParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun mute() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.rooms().sessions().actions()

        val response =
            actionService.mute(
                ActionMuteParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unmute() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.rooms().sessions().actions()

        val response =
            actionService.unmute(
                ActionUnmuteParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(ActionsParticipantsRequest.Participants.UnionMember0.ALL)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}
