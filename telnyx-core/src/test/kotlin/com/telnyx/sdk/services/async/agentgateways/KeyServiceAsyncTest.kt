// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.agentgateways.keys.KeyCreateParams
import com.telnyx.sdk.models.agentgateways.keys.KeyDeleteParams
import com.telnyx.sdk.models.agentgateways.keys.KeyListParams
import com.telnyx.sdk.models.agentgateways.keys.KeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.agentGateways().keys()

        val keyFuture =
            keyServiceAsync.create(
                KeyCreateParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .budgetResetsEvery("30d")
                    .expiresIn("30d")
                    .maxBudget(20.0)
                    .maxParallelRequests(4L)
                    .addModel("GLM-5.3-Flash")
                    .name("support-agent")
                    .requestsPerMinute(60L)
                    .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                    .tokensPerMinute(1L)
                    .build()
            )

        val key = keyFuture.get()
        key.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.agentGateways().keys()

        val agentGatewayKeyResponseFuture =
            keyServiceAsync.update(
                KeyUpdateParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                    .blocked(true)
                    .budgetResetsEvery("30d")
                    .expiresIn("30d")
                    .maxBudget(0.0)
                    .maxParallelRequests(1L)
                    .addModel("x")
                    .name("x")
                    .requestsPerMinute(1L)
                    .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .tokensPerMinute(1L)
                    .build()
            )

        val agentGatewayKeyResponse = agentGatewayKeyResponseFuture.get()
        agentGatewayKeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.agentGateways().keys()

        val keysFuture =
            keyServiceAsync.list(
                KeyListParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val keys = keysFuture.get()
        keys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val keyServiceAsync = client.agentGateways().keys()

        val agentGatewayKeyResponseFuture =
            keyServiceAsync.delete(
                KeyDeleteParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                    .build()
            )

        val agentGatewayKeyResponse = agentGatewayKeyResponseFuture.get()
        agentGatewayKeyResponse.validate()
    }
}
