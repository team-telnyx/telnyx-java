// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.agentgateways.guardrails

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class GuardrailCreateParamsTest {

    @Test
    fun create() {
        GuardrailCreateParams.builder()
            .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
            .addMode(GuardrailCreateParams.Mode.BEFORE_REQUEST)
            .name("mask-pii")
            .type(GuardrailCreateParams.Type.CONTENT_FILTER)
            .alwaysOn(true)
            .settings(
                JsonValue.from(
                    mapOf(
                        "patterns" to
                            listOf(
                                mapOf("name" to "us_ssn", "action" to "mask"),
                                mapOf("name" to "email", "action" to "mask"),
                            )
                    )
                )
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            GuardrailCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .addMode(GuardrailCreateParams.Mode.BEFORE_REQUEST)
                .name("mask-pii")
                .type(GuardrailCreateParams.Type.CONTENT_FILTER)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("32ce035d-3165-4031-b1a7-a7c0c259590a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            GuardrailCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .addMode(GuardrailCreateParams.Mode.BEFORE_REQUEST)
                .name("mask-pii")
                .type(GuardrailCreateParams.Type.CONTENT_FILTER)
                .alwaysOn(true)
                .settings(
                    JsonValue.from(
                        mapOf(
                            "patterns" to
                                listOf(
                                    mapOf("name" to "us_ssn", "action" to "mask"),
                                    mapOf("name" to "email", "action" to "mask"),
                                )
                        )
                    )
                )
                .build()

        val body = params._body()

        assertThat(body.modes()).containsExactly(GuardrailCreateParams.Mode.BEFORE_REQUEST)
        assertThat(body.name()).isEqualTo("mask-pii")
        assertThat(body.type()).isEqualTo(GuardrailCreateParams.Type.CONTENT_FILTER)
        assertThat(body.alwaysOn()).contains(true)
        assertThat(body._settings())
            .isEqualTo(
                JsonValue.from(
                    mapOf(
                        "patterns" to
                            listOf(
                                mapOf("name" to "us_ssn", "action" to "mask"),
                                mapOf("name" to "email", "action" to "mask"),
                            )
                    )
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            GuardrailCreateParams.builder()
                .instanceId("32ce035d-3165-4031-b1a7-a7c0c259590a")
                .addMode(GuardrailCreateParams.Mode.BEFORE_REQUEST)
                .name("mask-pii")
                .type(GuardrailCreateParams.Type.CONTENT_FILTER)
                .build()

        val body = params._body()

        assertThat(body.modes()).containsExactly(GuardrailCreateParams.Mode.BEFORE_REQUEST)
        assertThat(body.name()).isEqualTo("mask-pii")
        assertThat(body.type()).isEqualTo(GuardrailCreateParams.Type.CONTENT_FILTER)
    }
}
