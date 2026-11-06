// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.agentgateways

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.agentgateways.keys.KeyCreateParams
import com.telnyx.sdk.models.agentgateways.keys.KeyDeleteParams
import com.telnyx.sdk.models.agentgateways.keys.KeyListParams
import com.telnyx.sdk.models.agentgateways.keys.KeyUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class KeyServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.agentGateways().keys()

        val key =
            keyService.create(
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

        key.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.agentGateways().keys()

        val agentGatewayKeyResponse =
            keyService.update(
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

        agentGatewayKeyResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.agentGateways().keys()

        val keys =
            keyService.list(
                KeyListParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .teamId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        keys.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val keyService = client.agentGateways().keys()

        val agentGatewayKeyResponse =
            keyService.delete(
                KeyDeleteParams.builder()
                    .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                    .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                    .build()
            )

        agentGatewayKeyResponse.validate()
    }
}
