// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.machinepayments

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MachinePaymentAccountCreditParamsTest {

    @Test
    fun create() {
        MachinePaymentAccountCreditParams.builder().amountUsd("10.00").build()
    }

    @Test
    fun body() {
        val params = MachinePaymentAccountCreditParams.builder().amountUsd("10.00").build()

        val body = params._body()

        assertThat(body.amountUsd()).isEqualTo("10.00")
    }
}
