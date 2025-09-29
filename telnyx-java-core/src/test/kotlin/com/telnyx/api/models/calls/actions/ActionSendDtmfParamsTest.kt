// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendDtmfParamsTest {

    @Test
    fun create() {
        ActionSendDtmfParams.builder()
            .callControlId("call_control_id")
            .digits("1www2WABCDw9")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .durationMillis(500)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSendDtmfParams.builder()
                .callControlId("call_control_id")
                .digits("1www2WABCDw9")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSendDtmfParams.builder()
                .callControlId("call_control_id")
                .digits("1www2WABCDw9")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .durationMillis(500)
                .build()

        val body = params._body()

        assertThat(body.digits()).isEqualTo("1www2WABCDw9")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.durationMillis()).contains(500)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionSendDtmfParams.builder()
                .callControlId("call_control_id")
                .digits("1www2WABCDw9")
                .build()

        val body = params._body()

        assertThat(body.digits()).isEqualTo("1www2WABCDw9")
    }
}
