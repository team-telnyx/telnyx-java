// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.payment

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PaymentCreateStoredPaymentTransactionParamsTest {

    @Test
    fun create() {
        PaymentCreateStoredPaymentTransactionParams.builder().amount("120.00").build()
    }

    @Test
    fun body() {
        val params = PaymentCreateStoredPaymentTransactionParams.builder().amount("120.00").build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo("120.00")
    }
}
