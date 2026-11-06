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
                GuardrailCreateParams.Settings.builder()
                    .putAdditionalProperty("patterns", JsonValue.from("bar"))
                    .build()
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
                    GuardrailCreateParams.Settings.builder()
                        .putAdditionalProperty("patterns", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.modes()).containsExactly(GuardrailCreateParams.Mode.BEFORE_REQUEST)
        assertThat(body.name()).isEqualTo("mask-pii")
        assertThat(body.type()).isEqualTo(GuardrailCreateParams.Type.CONTENT_FILTER)
        assertThat(body.alwaysOn()).contains(true)
        assertThat(body.settings())
            .contains(
                GuardrailCreateParams.Settings.builder()
                    .putAdditionalProperty("patterns", JsonValue.from("bar"))
                    .build()
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
