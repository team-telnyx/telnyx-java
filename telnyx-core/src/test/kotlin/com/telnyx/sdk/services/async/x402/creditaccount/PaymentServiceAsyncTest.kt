// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402.creditaccount

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val paymentServiceAsync = client.x402().creditAccount().payments()

        val paymentFuture = paymentServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val payment = paymentFuture.get()
        payment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val paymentServiceAsync = client.x402().creditAccount().payments()

        val pageFuture = paymentServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
