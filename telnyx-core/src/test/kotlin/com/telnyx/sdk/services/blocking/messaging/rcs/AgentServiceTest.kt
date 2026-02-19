// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging.rcs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging.rcs.agents.AgentUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AgentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.messaging().rcs().agents()

        val rcsAgentResponse = agentService.retrieve("id")

        rcsAgentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.messaging().rcs().agents()

        val rcsAgentResponse =
            agentService.update(
                AgentUpdateParams.builder()
                    .id("id")
                    .profileId("4001932a-b8a3-42fc-9389-021be6388909")
                    .webhookFailoverUrl("http://example.com")
                    .webhookUrl("http://example.com")
                    .build()
            )

        rcsAgentResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val agentService = client.messaging().rcs().agents()

        val page = agentService.list()

        page.response().validate()
    }
}
