// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.recordings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingRecordingSidJsonParamsTest {

    @Test
    fun create() {
        RecordingRecordingSidJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(RecordingRecordingSidJsonParams.Status.PAUSED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RecordingRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
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
            RecordingRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(RecordingRecordingSidJsonParams.Status.PAUSED)
                .build()

        val body = params._body()

        assertThat(body.status()).contains(RecordingRecordingSidJsonParams.Status.PAUSED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RecordingRecordingSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .recordingSid("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
