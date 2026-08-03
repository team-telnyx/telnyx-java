// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations.batch

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateParamsTest {

    @Test
    fun create() {
        BatchCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .addEmail("user@example.com")
            .addEmail("admin@example.org")
            .webhookUrl("https://example.com/webhooks/email-validation")
            .build()
    }

    @Test
    fun headers() {
        val params =
            BatchCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .addEmail("user@example.com")
                .addEmail("admin@example.org")
                .webhookUrl("https://example.com/webhooks/email-validation")
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
        val params =
            BatchCreateParams.builder()
                .addEmail("user@example.com")
                .addEmail("admin@example.org")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            BatchCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .addEmail("user@example.com")
                .addEmail("admin@example.org")
                .webhookUrl("https://example.com/webhooks/email-validation")
                .build()

        val body = params._body()

        assertThat(body.emails()).containsExactly("user@example.com", "admin@example.org")
        assertThat(body.webhookUrl()).contains("https://example.com/webhooks/email-validation")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            BatchCreateParams.builder()
                .addEmail("user@example.com")
                .addEmail("admin@example.org")
                .build()

        val body = params._body()

        assertThat(body.emails()).containsExactly("user@example.com", "admin@example.org")
    }
}
