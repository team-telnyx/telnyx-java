// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ttsintegrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ttsintegrations.actions.ActionTestConnectionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun disable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.ttsIntegrations().actions()

        val communityTtsEngineFuture = actionServiceAsync.disable("id")

        val communityTtsEngine = communityTtsEngineFuture.get()
        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun enable() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.ttsIntegrations().actions()

        val communityTtsEngineFuture = actionServiceAsync.enable("id")

        val communityTtsEngine = communityTtsEngineFuture.get()
        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun refreshVoices() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.ttsIntegrations().actions()

        val communityTtsEngineFuture = actionServiceAsync.refreshVoices("id")

        val communityTtsEngine = communityTtsEngineFuture.get()
        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun requestReview() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.ttsIntegrations().actions()

        val communityTtsEngineFuture = actionServiceAsync.requestReview("id")

        val communityTtsEngine = communityTtsEngineFuture.get()
        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun testConnection() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.ttsIntegrations().actions()

        val communityTtsConformanceRunFuture =
            actionServiceAsync.testConnection(
                ActionTestConnectionParams.builder()
                    .id("id")
                    .apiKeyRef("acme-engine-key")
                    .voiceId("alpha")
                    .build()
            )

        val communityTtsConformanceRun = communityTtsConformanceRunFuture.get()
        communityTtsConformanceRun.validate()
    }
}
