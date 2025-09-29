// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendSipInfoParamsTest {

    @Test
    fun create() {
        ActionSendSipInfoParams.builder()
            .callControlId("call_control_id")
            .body("{\"key\": \"value\", \"numValue\": 100}")
            .contentType("application/json")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            ActionSendSipInfoParams.builder()
                .callControlId("call_control_id")
                .body("{\"key\": \"value\", \"numValue\": 100}")
                .contentType("application/json")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionSendSipInfoParams.builder()
                .callControlId("call_control_id")
                .body("{\"key\": \"value\", \"numValue\": 100}")
                .contentType("application/json")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .build()

        val body = params._body()

        assertThat(body.body()).isEqualTo("{\"key\": \"value\", \"numValue\": 100}")
        assertThat(body.contentType()).isEqualTo("application/json")
        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ActionSendSipInfoParams.builder()
                .callControlId("call_control_id")
                .body("{\"key\": \"value\", \"numValue\": 100}")
                .contentType("application/json")
                .build()

        val body = params._body()

        assertThat(body.body()).isEqualTo("{\"key\": \"value\", \"numValue\": 100}")
        assertThat(body.contentType()).isEqualTo("application/json")
    }
}
