// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiListParamsTest {

    @Test
    fun create() {
        ApiListParams.builder().instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a").build()
    }

    @Test
    fun pathParams() {
        val params =
            ApiListParams.builder().instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a").build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
