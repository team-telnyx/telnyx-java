// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherParamsTest {

    @Test
    fun create() {
        ActionGatherParams.builder()
            .callControlId("call_control_id")
            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
            .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
            .gatherId("my_gather_id")
            .initialTimeoutMillis(10000)
            .interDigitTimeoutMillis(10000)
            .maximumDigits(10)
            .minimumDigits(1)
            .terminatingDigit("#")
            .timeoutMillis(60000)
            .validDigits("123")
            .build()
    }

    @Test
    fun pathParams() {
        val params = ActionGatherParams.builder().callControlId("call_control_id").build()

        assertThat(params._pathParam(0)).isEqualTo("call_control_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            ActionGatherParams.builder()
                .callControlId("call_control_id")
                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                .commandId("891510ac-f3e4-11e8-af5b-de00688a4901")
                .gatherId("my_gather_id")
                .initialTimeoutMillis(10000)
                .interDigitTimeoutMillis(10000)
                .maximumDigits(10)
                .minimumDigits(1)
                .terminatingDigit("#")
                .timeoutMillis(60000)
                .validDigits("123")
                .build()

        val body = params._body()

        assertThat(body.clientState()).contains("aGF2ZSBhIG5pY2UgZGF5ID1d")
        assertThat(body.commandId()).contains("891510ac-f3e4-11e8-af5b-de00688a4901")
        assertThat(body.gatherId()).contains("my_gather_id")
        assertThat(body.initialTimeoutMillis()).contains(10000)
        assertThat(body.interDigitTimeoutMillis()).contains(10000)
        assertThat(body.maximumDigits()).contains(10)
        assertThat(body.minimumDigits()).contains(1)
        assertThat(body.terminatingDigit()).contains("#")
        assertThat(body.timeoutMillis()).contains(60000)
        assertThat(body.validDigits()).contains("123")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ActionGatherParams.builder().callControlId("call_control_id").build()

        val body = params._body()
    }
}
