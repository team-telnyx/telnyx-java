// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ttsintegrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ttsintegrations.actions.ActionTestConnectionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.ttsIntegrations().actions()

        val communityTtsEngine = actionService.disable("id")

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.ttsIntegrations().actions()

        val communityTtsEngine = actionService.enable("id")

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refreshVoices() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.ttsIntegrations().actions()

        val communityTtsEngine = actionService.refreshVoices("id")

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestReview() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.ttsIntegrations().actions()

        val communityTtsEngine = actionService.requestReview("id")

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun testConnection() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.ttsIntegrations().actions()

        val communityTtsConformanceRun =
            actionService.testConnection(
                ActionTestConnectionParams.builder()
                    .id("id")
                    .apiKeyRef("acme-engine-key")
                    .voiceId("alpha")
                    .build()
            )

        communityTtsConformanceRun.validate()
    }
}
