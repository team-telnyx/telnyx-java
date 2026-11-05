// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgentGatewayDeleteParamsTest {

    @Test
    fun create() {
        AgentGatewayDeleteParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AgentGatewayDeleteParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
