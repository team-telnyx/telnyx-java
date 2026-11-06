// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.apis

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ApiDeleteParamsTest {

    @Test
    fun create() {
        ApiDeleteParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ApiDeleteParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .apiId("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("dbe53cc0-bf7e-4f7a-8d84-752d19890eb3")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
