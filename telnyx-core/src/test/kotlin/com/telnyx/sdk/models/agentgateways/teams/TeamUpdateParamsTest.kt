// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamUpdateParamsTest {

    @Test
    fun create() {
        TeamUpdateParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
            .blocked(true)
            .budgetResetsEvery("30d")
            .maxBudget(100.0)
            .addModel("x")
            .name("x")
            .requestsPerMinute(1L)
            .tokensPerMinute(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TeamUpdateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        assertThat(params._pathParam(1)).isEqualTo("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TeamUpdateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                .blocked(true)
                .budgetResetsEvery("30d")
                .maxBudget(100.0)
                .addModel("x")
                .name("x")
                .requestsPerMinute(1L)
                .tokensPerMinute(1L)
                .build()

        val body = params._body()

        assertThat(body.blocked()).contains(true)
        assertThat(body.budgetResetsEvery()).contains("30d")
        assertThat(body.maxBudget()).contains(100.0)
        assertThat(body.models().getOrNull()).containsExactly("x")
        assertThat(body.name()).contains("x")
        assertThat(body.requestsPerMinute()).contains(1L)
        assertThat(body.tokensPerMinute()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TeamUpdateParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                .build()

        val body = params._body()
    }
}
