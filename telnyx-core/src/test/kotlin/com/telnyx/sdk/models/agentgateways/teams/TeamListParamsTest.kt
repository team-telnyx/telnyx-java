// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.teams

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TeamListParamsTest {

    @Test
    fun create() {
        TeamListParams.builder().instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996").build()
    }

    @Test
    fun pathParams() {
        val params =
            TeamListParams.builder().instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996").build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
