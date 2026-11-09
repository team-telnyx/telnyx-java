// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailDeleteParamsTest {

    @Test
    fun create() {
        GuardrailDeleteParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GuardrailDeleteParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("9645e556-6532-4341-8cab-21b58cdef529")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
