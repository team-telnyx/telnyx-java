// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.telnyx.sdk.models.calls.CustomSipHeader
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionHangupParamsTest {

    @Test
    fun create() {
        ActionHangupParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
            .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionHangupParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionHangupParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .addCustomHeader(CustomSipHeader.builder().name("head_1").value("val_1").build())
                .addCustomHeader(CustomSipHeader.builder().name("head_2").value("val_2").build())
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.customHeaders().getOrNull())
            .containsExactly(
                CustomSipHeader.builder().name("head_1").value("val_1").build(),
                CustomSipHeader.builder().name("head_2").value("val_2").build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionHangupParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
