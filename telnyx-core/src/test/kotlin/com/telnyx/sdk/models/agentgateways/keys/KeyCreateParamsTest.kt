// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyCreateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            KeyCreateParams.builder().instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996").build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.budgetResetsEvery()).contains("30d")
        assertThat(body.expiresIn()).contains("30d")
        assertThat(body.maxBudget()).contains(20.0)
        assertThat(body.maxParallelRequests()).contains(4L)
        assertThat(body.models().getOrNull()).containsExactly("GLM-5.3-Flash")
        assertThat(body.name()).contains("support-agent")
        assertThat(body.requestsPerMinute()).contains(60L)
        assertThat(body.teamId()).contains("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
        assertThat(body.tokensPerMinute()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            KeyCreateParams.builder().instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996").build()

        val body = params._body()
    }
}
