// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamCreateParamsTest {

    @Test
    fun create() {
        TeamCreateParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .name("support")
            .budgetResetsEvery("30d")
            .maxBudget(50.0)
            .addModel("GLM-5.3-Flash")
            .addModel("Qwen3.8-27B-nothink")
            .requestsPerMinute(120L)
            .tokensPerMinute(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TeamCreateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .name("support")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TeamCreateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .name("support")
                .budgetResetsEvery("30d")
                .maxBudget(50.0)
                .addModel("GLM-5.3-Flash")
                .addModel("Qwen3.8-27B-nothink")
                .requestsPerMinute(120L)
                .tokensPerMinute(1L)
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("support")
        assertThat(body.budgetResetsEvery()).contains("30d")
        assertThat(body.maxBudget()).contains(50.0)
        assertThat(body.models().getOrNull())
            .containsExactly("GLM-5.3-Flash", "Qwen3.8-27B-nothink")
        assertThat(body.requestsPerMinute()).contains(120L)
        assertThat(body.tokensPerMinute()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TeamCreateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .name("support")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("support")
    }
}
