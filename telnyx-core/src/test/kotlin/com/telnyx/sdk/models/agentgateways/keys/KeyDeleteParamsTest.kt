// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.keys

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class KeyDeleteParamsTest {

    @Test
    fun create() {
        KeyDeleteParams.builder()
            .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
            .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            KeyDeleteParams.builder()
                .instanceId("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
                .keyId("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ecffdf4b-93ea-4a7b-8295-51dfd2077996")
        assertThat(params._pathParam(1))
            .isEqualTo("5f1c3a0e9b7d4c2a8e6f0b1d3c5a7e9f2b4d6c8a0e1f3a5c7e9b1d3f5a7c9e0b")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
