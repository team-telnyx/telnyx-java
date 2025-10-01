// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartNoiseSuppressionParamsTest {

    @Test
    fun create() {
        ActionStartNoiseSuppressionParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .direction(ActionStartNoiseSuppressionParams.Direction.BOTH)
            .noiseSuppressionEngine(ActionStartNoiseSuppressionParams.NoiseSuppressionEngine.A)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionStartNoiseSuppressionParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStartNoiseSuppressionParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .direction(ActionStartNoiseSuppressionParams.Direction.BOTH)
                .noiseSuppressionEngine(ActionStartNoiseSuppressionParams.NoiseSuppressionEngine.A)
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.direction()).contains(ActionStartNoiseSuppressionParams.Direction.BOTH)
        assertThat(body.noiseSuppressionEngine())
            .contains(ActionStartNoiseSuppressionParams.NoiseSuppressionEngine.A)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionStartNoiseSuppressionParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
