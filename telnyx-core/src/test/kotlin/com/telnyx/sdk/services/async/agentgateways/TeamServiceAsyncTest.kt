// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.agentgateways.teams.TeamCreateParams
import com.telnyx.sdk.models.agentgateways.teams.TeamDeleteParams
import com.telnyx.sdk.models.agentgateways.teams.TeamUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TeamServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.agentGateways().teams()

        val agentGatewayTeamResponseFuture =
            teamServiceAsync.create(
                TeamCreateParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .name("support")
                    .budgetResetsEvery("30d")
                    .maxBudget(50.0)
                    .addModel("GLM-5.3-Flash")
                    .addModel("Qwen3.8-27B-nothink")
                    .requestsPerMinute(120L)
                    .tokensPerMinute(1L)
                    .build()
            )

        val agentGatewayTeamResponse = agentGatewayTeamResponseFuture.get()
        agentGatewayTeamResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.agentGateways().teams()

        val agentGatewayTeamResponseFuture =
            teamServiceAsync.update(
                TeamUpdateParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                    .blocked(true)
                    .budgetResetsEvery("30d")
                    .maxBudget(100.0)
                    .addModel("x")
                    .name("x")
                    .requestsPerMinute(1L)
                    .tokensPerMinute(1L)
                    .build()
            )

        val agentGatewayTeamResponse = agentGatewayTeamResponseFuture.get()
        agentGatewayTeamResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.agentGateways().teams()

        val teamsFuture = teamServiceAsync.list("ecffdf4b-93ea-4a7b-8295-51dfd2077996")

        val teams = teamsFuture.get()
        teams.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val teamServiceAsync = client.agentGateways().teams()

        val agentGatewayTeamResponseFuture =
            teamServiceAsync.delete(
                TeamDeleteParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                    .build()
            )

        val agentGatewayTeamResponse = agentGatewayTeamResponseFuture.get()
        agentGatewayTeamResponse.validate()
    }
}
