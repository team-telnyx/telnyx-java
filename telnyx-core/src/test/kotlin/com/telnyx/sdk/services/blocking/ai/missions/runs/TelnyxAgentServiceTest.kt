// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentLinkParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentListParams
import com.telnyx.sdk.models.ai.missions.runs.telnyxagents.TelnyxAgentUnlinkParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TelnyxAgentServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telnyxAgentService = client.ai().missions().runs().telnyxAgents()

        val telnyxAgents =
            telnyxAgentService.list(
                TelnyxAgentListParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        telnyxAgents.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun link() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telnyxAgentService = client.ai().missions().runs().telnyxAgents()

        val response =
            telnyxAgentService.link(
                TelnyxAgentLinkParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .telnyxAgentId("telnyx_agent_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun unlink() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val telnyxAgentService = client.ai().missions().runs().telnyxAgents()

        telnyxAgentService.unlink(
            TelnyxAgentUnlinkParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .telnyxAgentId("telnyx_agent_id")
                .build()
        )
    }
}
