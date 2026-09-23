// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.machinepayments.MachinePaymentAccountCreditParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MachinePaymentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun accountCredit() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val machinePaymentServiceAsync = client.machinePayments()

        val responseFuture =
            machinePaymentServiceAsync.accountCredit(
                MachinePaymentAccountCreditParams.builder().amountUsd("10.00").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
