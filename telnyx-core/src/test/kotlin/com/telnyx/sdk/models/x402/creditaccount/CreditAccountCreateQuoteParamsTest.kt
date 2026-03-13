// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountCreateQuoteParamsTest {

    @Test
    fun create() {
        CreditAccountCreateQuoteParams.builder().amountUsd("50.00").build()
    }

    @Test
    fun body() {
        val params = CreditAccountCreateQuoteParams.builder().amountUsd("50.00").build()

        val body = params._body()

        assertThat(body.amountUsd()).isEqualTo("50.00")
    }
}
