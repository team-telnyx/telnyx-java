// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStoredPaymentTransaction() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val paymentServiceAsync = client.payment()

        val responseFuture =
            paymentServiceAsync.createStoredPaymentTransaction(
                PaymentCreateStoredPaymentTransactionParams.builder().amount("120.00").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
