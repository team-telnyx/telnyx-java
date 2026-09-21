// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallCreateParamsTest {

    @Test
    fun create() {
        CallCreateParams.builder()
            .connectionId("1234567890")
            .from("+13120001234")
            .to("+13121230000")
            .method(CallCreateParams.Method.POST)
            .texml("<Response><Say>Hello</Say></Response>")
            .url("https://example.com/instructions.xml")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CallCreateParams.builder()
                .connectionId("1234567890")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("1234567890")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            CallCreateParams.builder()
                .connectionId("1234567890")
                .from("+13120001234")
                .to("+13121230000")
                .method(CallCreateParams.Method.POST)
                .texml("<Response><Say>Hello</Say></Response>")
                .url("https://example.com/instructions.xml")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
        assertThat(body.method()).contains(CallCreateParams.Method.POST)
        assertThat(body.texml()).contains("<Response><Say>Hello</Say></Response>")
        assertThat(body.url()).contains("https://example.com/instructions.xml")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CallCreateParams.builder()
                .connectionId("1234567890")
                .from("+13120001234")
                .to("+13121230000")
                .build()

        val body = params._body()

        assertThat(body.from()).isEqualTo("+13120001234")
        assertThat(body.to()).isEqualTo("+13121230000")
    }
}
