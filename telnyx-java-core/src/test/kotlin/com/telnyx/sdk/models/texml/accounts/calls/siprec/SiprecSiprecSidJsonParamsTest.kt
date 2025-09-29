// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls.siprec

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SiprecSiprecSidJsonParamsTest {

    @Test
    fun create() {
        SiprecSiprecSidJsonParams.builder()
            .accountSid("account_sid")
            .callSid("call_sid")
            .siprecSid("siprec_sid")
            .status(SiprecSiprecSidJsonParams.Status.STOPPED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SiprecSiprecSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .siprecSid("siprec_sid")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        assertThat(params._pathParam(2)).isEqualTo("siprec_sid")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SiprecSiprecSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .siprecSid("siprec_sid")
                .status(SiprecSiprecSidJsonParams.Status.STOPPED)
                .build()

        val body = params._body()

        assertThat(body.status()).contains(SiprecSiprecSidJsonParams.Status.STOPPED)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SiprecSiprecSidJsonParams.builder()
                .accountSid("account_sid")
                .callSid("call_sid")
                .siprecSid("siprec_sid")
                .build()

        val body = params._body()
    }
}
