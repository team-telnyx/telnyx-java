// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms.sessions

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.rooms.sessions.actions.ActionKickParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionMuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionUnmuteParams
import com.telnyx.sdk.models.rooms.sessions.actions.ActionsParticipantsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun end() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.rooms().sessions().actions()

        val responseFuture = actionServiceAsync.end("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun kick() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.rooms().sessions().actions()

        val responseFuture =
            actionServiceAsync.kick(
                ActionKickParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(
                                ActionsParticipantsRequest.Participants.AllParticipants.ALL
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun mute() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.rooms().sessions().actions()

        val responseFuture =
            actionServiceAsync.mute(
                ActionMuteParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(
                                ActionsParticipantsRequest.Participants.AllParticipants.ALL
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unmute() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.rooms().sessions().actions()

        val responseFuture =
            actionServiceAsync.unmute(
                ActionUnmuteParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .actionsParticipantsRequest(
                        ActionsParticipantsRequest.builder()
                            .addExclude("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .participants(
                                ActionsParticipantsRequest.Participants.AllParticipants.ALL
                            )
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
