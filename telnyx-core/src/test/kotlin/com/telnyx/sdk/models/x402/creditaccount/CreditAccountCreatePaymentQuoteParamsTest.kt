// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountCreatePaymentQuoteParamsTest {

    @Test
    fun create() {
        CreditAccountCreatePaymentQuoteParams.builder().amountUsd("50.00").build()
    }

    @Test
    fun body() {
        val params = CreditAccountCreatePaymentQuoteParams.builder().amountUsd("50.00").build()

        val body = params._body()

        assertThat(body.amountUsd()).isEqualTo("50.00")
    }
}
