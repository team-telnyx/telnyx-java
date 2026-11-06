// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            KeyUpdateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        assertThat(params._pathParam(1))
            .isEqualTo("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetResetsEvery()).contains("30d")
        assertThat(body.expiresIn()).contains("30d")
        assertThat(body.maxBudget()).contains(0.0)
        assertThat(body.maxParallelRequests()).contains(1L)
        assertThat(body.models().getOrNull()).containsExactly("x")
        assertThat(body.name()).contains("x")
        assertThat(body.requestsPerMinute()).contains(1L)
        assertThat(body.teamId()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(body.tokensPerMinute()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            KeyUpdateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                .build()

        val body = params._body()
    }
}
