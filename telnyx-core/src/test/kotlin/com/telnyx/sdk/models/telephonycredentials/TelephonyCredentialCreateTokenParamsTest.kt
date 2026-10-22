// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.telephonycredentials

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelephonyCredentialCreateTokenParamsTest {

    @Test
    fun create() {
        TelephonyCredentialCreateTokenParams.builder()
            .id("id")
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .build()
    }

    @Test
    fun pathParams() {
        val params = TelephonyCredentialCreateTokenParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            TelephonyCredentialCreateTokenParams.builder()
                .id("id")
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                com.telnyx.sdk.core.http.Headers.builder()
                    .put("Idempotency-Key", "8e03978e-40d5-43e8-bc93-6894a57f9326")
                    .build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = TelephonyCredentialCreateTokenParams.builder().id("id").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }
}
