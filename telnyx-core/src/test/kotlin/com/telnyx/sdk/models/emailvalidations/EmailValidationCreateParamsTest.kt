// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailValidationCreateParamsTest {

    @Test
    fun create() {
        EmailValidationCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .email("user@example.com")
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmailValidationCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .email("user@example.com")
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
        val params = EmailValidationCreateParams.builder().email("user@example.com").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EmailValidationCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .email("user@example.com")
                .build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("user@example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailValidationCreateParams.builder().email("user@example.com").build()

        val body = params._body()

        assertThat(body.email()).isEqualTo("user@example.com")
    }
}
