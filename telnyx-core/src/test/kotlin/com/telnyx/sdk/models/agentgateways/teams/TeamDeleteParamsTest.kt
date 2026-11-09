// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamDeleteParamsTest {

    @Test
    fun create() {
        TeamDeleteParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TeamDeleteParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .teamId("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        assertThat(params._pathParam(1)).isEqualTo("0b6c5d4e-3f2a-4b1c-9d8e-7f6a5b4c3d2e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
