// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.payment.PaymentCreateStoredPaymentTransactionParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createStoredPaymentTransaction() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val paymentService = client.payment()

        val response =
            paymentService.createStoredPaymentTransaction(
                PaymentCreateStoredPaymentTransactionParams.builder().amount("120.00").build()
            )

        response.validate()
    }
}
