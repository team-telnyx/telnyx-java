// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.x402

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountCreatePaymentQuoteParams
import com.telnyx.sdk.models.x402.creditaccount.CreditAccountSettlePaymentParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CreditAccountServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun createPaymentQuote() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val creditAccountService = client.x402().creditAccount()

        val response =
            creditAccountService.createPaymentQuote(
                CreditAccountCreatePaymentQuoteParams.builder().amountUsd("50.00").build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun settlePayment() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val creditAccountService = client.x402().creditAccount()

        val response =
            creditAccountService.settlePayment(
                CreditAccountSettlePaymentParams.builder()
                    .headerPaymentSignature("PAYMENT-SIGNATURE")
                    .id("quote_abc123")
                    .bodyPaymentSignature("0xabc123...")
                    .build()
            )

        response.validate()
    }
}
