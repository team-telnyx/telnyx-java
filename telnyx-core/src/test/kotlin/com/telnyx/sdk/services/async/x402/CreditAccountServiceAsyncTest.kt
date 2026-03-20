// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.x402

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditAccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createQuote() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditAccountServiceAsync = client.x402().creditAccount()

        val responseFuture =
            creditAccountServiceAsync.createQuote(
                CreditAccountCreateQuoteParams.builder().amountUsd("50.00").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun settle() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val creditAccountServiceAsync = client.x402().creditAccount()

        val responseFuture =
            creditAccountServiceAsync.settle(
                CreditAccountSettleParams.builder()
                    .headerPaymentSignature("PAYMENT-SIGNATURE")
                    .id("quote_abc123")
                    .bodyPaymentSignature("0xabc123...")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
