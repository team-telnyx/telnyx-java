// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TelnyxAgentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telnyxAgentServiceAsync = client.ai().missions().runs().telnyxAgents()

        val telnyxAgentsFuture =
            telnyxAgentServiceAsync.list(
                TelnyxAgentListParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val telnyxAgents = telnyxAgentsFuture.get()
        telnyxAgents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun link() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telnyxAgentServiceAsync = client.ai().missions().runs().telnyxAgents()

        val responseFuture =
            telnyxAgentServiceAsync.link(
                TelnyxAgentLinkParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .telnyxAgentId("telnyx_agent_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun unlink() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val telnyxAgentServiceAsync = client.ai().missions().runs().telnyxAgents()

        val future =
            telnyxAgentServiceAsync.unlink(
                TelnyxAgentUnlinkParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .telnyxAgentId("telnyx_agent_id")
                    .build()
            )

        val response = future.get()
    }
}
