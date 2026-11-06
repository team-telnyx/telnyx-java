// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.policies

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PolicyRetrieveParamsTest {

    @Test
    fun create() {
        PolicyRetrieveParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .name("strict")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PolicyRetrieveParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .name("strict")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("strict")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
