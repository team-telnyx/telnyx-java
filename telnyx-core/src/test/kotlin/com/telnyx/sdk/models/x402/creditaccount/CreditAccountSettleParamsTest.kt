// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.x402.creditaccount

import com.telnyx.sdk.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreditAccountSettleParamsTest {

    @Test
    fun create() {
        CreditAccountSettleParams.builder()
            .headerPaymentSignature("PAYMENT-SIGNATURE")
            .id("quote_abc123")
            .bodyPaymentSignature("0xabc123...")
            .build()
    }

    @Test
    fun headers() {
        val params =
            CreditAccountSettleParams.builder()
                .headerPaymentSignature("PAYMENT-SIGNATURE")
                .id("quote_abc123")
                .bodyPaymentSignature("0xabc123...")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(Headers.builder().put("PAYMENT-SIGNATURE", "PAYMENT-SIGNATURE").build())
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = CreditAccountSettleParams.builder().id("quote_abc123").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            CreditAccountSettleParams.builder()
                .headerPaymentSignature("PAYMENT-SIGNATURE")
                .id("quote_abc123")
                .bodyPaymentSignature("0xabc123...")
                .build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("quote_abc123")
        assertThat(body.bodyPaymentSignature()).contains("0xabc123...")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CreditAccountSettleParams.builder().id("quote_abc123").build()

        val body = params._body()

        assertThat(body.id()).isEqualTo("quote_abc123")
    }
}
