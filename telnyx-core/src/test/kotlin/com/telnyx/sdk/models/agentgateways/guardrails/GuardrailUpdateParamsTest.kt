// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailUpdateParamsTest {

    @Test
    fun create() {
        GuardrailUpdateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
            .alwaysOn(true)
            .addMode(GuardrailUpdateParams.Mode.BEFORE_REQUEST)
            .name("name")
            .settings(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GuardrailUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        assertThat(params._pathParam(1)).isEqualTo("9645e556-6532-4341-8cab-21b58cdef529")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GuardrailUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                .alwaysOn(true)
                .addMode(GuardrailUpdateParams.Mode.BEFORE_REQUEST)
                .name("name")
                .settings(JsonValue.from(mapOf<String, Any>()))
                .build()

        val body = params._body()

        assertThat(body.alwaysOn()).contains(true)
        assertThat(body.modes().getOrNull())
            .containsExactly(GuardrailUpdateParams.Mode.BEFORE_REQUEST)
        assertThat(body.name()).contains("name")
        assertThat(body._settings()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GuardrailUpdateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .guardrailId("9645e556-6532-4341-8cab-21b58cdef529")
                .build()

        val body = params._body()
    }
}
