// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.messaging.rcs

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.messaging.rcs.agents.AgentListParams
import com.telnyx.api.models.messaging.rcs.agents.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AgentServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.messaging().rcs().agents()

        val rcsAgentResponseFuture = agentServiceAsync.retrieve("id")

        val rcsAgentResponse = rcsAgentResponseFuture.get()
        rcsAgentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.messaging().rcs().agents()

        val rcsAgentResponseFuture =
            agentServiceAsync.update(
                AgentUpdateParams.builder()
                    .id("id")
                    .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                    .webhookFailoverUrl("http://example.com")
                    .webhookUrl("http://example.com")
                    .build()
            )

        val rcsAgentResponse = rcsAgentResponseFuture.get()
        rcsAgentResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val agentServiceAsync = client.messaging().rcs().agents()

        val agentsFuture =
            agentServiceAsync.list(
                AgentListParams.builder()
                    .page(AgentListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val agents = agentsFuture.get()
        agents.validate()
    }
}
