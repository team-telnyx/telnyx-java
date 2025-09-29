// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRejectParamsTest {

    @Test
    fun create() {
        ActionRejectParams.builder()
            .callControlId("call_control_id")
            .cause(ActionRejectParams.Cause.USER_BUSY)
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionRejectParams.builder()
                .callControlId("call_control_id")
                .cause(ActionRejectParams.Cause.USER_BUSY)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionRejectParams.builder()
                .callControlId("call_control_id")
                .cause(ActionRejectParams.Cause.USER_BUSY)
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.cause()).isEqualTo(ActionRejectParams.Cause.USER_BUSY)
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionRejectParams.builder()
                .callControlId("call_control_id")
                .cause(ActionRejectParams.Cause.USER_BUSY)
                .build()

        val body = params._body()

        assertThat(body.cause()).isEqualTo(ActionRejectParams.Cause.USER_BUSY)
    }
}
