// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreateQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettleParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditAccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createQuote() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val creditAccountService = client.x402().creditAccount()

        val response =
            creditAccountService.createQuote(
                CreditAccountCreateQuoteParams.builder().amountUsd("50.00").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun settle() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val creditAccountService = client.x402().creditAccount()

        val response =
            creditAccountService.settle(
                CreditAccountSettleParams.builder()
                    .headerPaymentSignature("PAYMENT-SIGNATURE")
                    .id("quote_abc123")
                    .paymentSignature("0xabc123...")
                    .build()
            )

        response.validate()
    }
}
