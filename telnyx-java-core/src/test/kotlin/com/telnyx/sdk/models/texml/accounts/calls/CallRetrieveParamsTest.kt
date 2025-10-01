// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.texml.accounts.calls

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRetrieveParamsTest {

    @Test
    fun create() {
        CallRetrieveParams.builder().accountSid("account_sid").callSid("call_sid").build()
    }

    @Test
    fun pathParams() {
        val params =
            CallRetrieveParams.builder().accountSid("account_sid").callSid("call_sid").build()

        assertThat(params._pathParam(0)).isEqualTo("account_sid")
        assertThat(params._pathParam(1)).isEqualTo("call_sid")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}
