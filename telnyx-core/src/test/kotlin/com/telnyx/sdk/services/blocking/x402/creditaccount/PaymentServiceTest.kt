// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402.creditaccount

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PaymentServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val paymentService = client.x402().creditAccount().payments()

        val payment = paymentService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        payment.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val paymentService = client.x402().creditAccount().payments()

        val page = paymentService.list()

        page.response().validate()
    }
}
