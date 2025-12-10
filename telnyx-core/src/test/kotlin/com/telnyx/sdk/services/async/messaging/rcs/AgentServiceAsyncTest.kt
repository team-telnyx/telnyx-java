// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging.rcs

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging.rcs.agents.AgentUpdateParams
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

        val pageFuture = agentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
