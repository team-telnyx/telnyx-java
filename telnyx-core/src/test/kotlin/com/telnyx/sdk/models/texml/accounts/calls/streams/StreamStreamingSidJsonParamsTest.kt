// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.streams

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamStreamingSidJsonParamsTest {

    @Test
    fun create() {
        StreamStreamingSidJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(StreamStreamingSidJsonParams.Status.STOPPED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            StreamStreamingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        assertThat(params._pathParam(2)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            StreamStreamingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(StreamStreamingSidJsonParams.Status.STOPPED)
                .build()

        val body = params._body()

        assertThat(body.status()).contains(StreamStreamingSidJsonParams.Status.STOPPED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            StreamStreamingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .streamingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
