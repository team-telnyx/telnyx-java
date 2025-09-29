// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopForkingParamsTest {

    @Test
    fun create() {
        ActionStopForkingParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .streamType(ActionStopForkingParams.StreamType.DECRYPTED)
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionStopForkingParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionStopForkingParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .streamType(ActionStopForkingParams.StreamType.DECRYPTED)
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.streamType()).contains(ActionStopForkingParams.StreamType.DECRYPTED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionStopForkingParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
