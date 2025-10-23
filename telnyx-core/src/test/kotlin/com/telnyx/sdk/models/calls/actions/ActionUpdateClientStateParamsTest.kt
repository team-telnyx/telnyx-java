// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUpdateClientStateParamsTest {

    @Test
    fun create() {
        ActionUpdateClientStateParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionUpdateClientStateParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionUpdateClientStateParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .build()

        val body = params._body()

        assertThat(body.clientState()).isEqualTo("aGF2ZSBhIG5pY2UgZGF5ID1d")
    }
}
