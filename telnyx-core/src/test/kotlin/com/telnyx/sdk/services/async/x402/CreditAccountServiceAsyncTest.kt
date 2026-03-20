// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createPaymentQuote() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditAccountServiceAsync = client.x402().creditAccount()

        val responseFuture =
            creditAccountServiceAsync.createPaymentQuote(
                CreditAccountCreatePaymentQuoteParams.builder().amountUsd("50.00").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun settlePayment() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditAccountServiceAsync = client.x402().creditAccount()

        val responseFuture =
            creditAccountServiceAsync.settlePayment(
                CreditAccountSettlePaymentParams.builder()
                    .headerPaymentSignature("PAYMENT-SIGNATURE")
                    .id("quote_abc123")
                    .bodyPaymentSignature("0xabc123...")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
