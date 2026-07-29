// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateCreateParamsTest {

    @Test
    fun create() {
        EmailTemplateCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .name("Welcome Email")
            .htmlBody("<h1>Hello {{ first_name }}</h1>")
            .subject("Welcome, {{ first_name }}!")
            .textBody("Hello {{ first_name }}")
            .addVariable("string")
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmailTemplateCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .name("Welcome Email")
                .htmlBody("<h1>Hello {{ first_name }}</h1>")
                .subject("Welcome, {{ first_name }}!")
                .textBody("Hello {{ first_name }}")
                .addVariable("string")
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
        val params = EmailTemplateCreateParams.builder().name("Welcome Email").build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(com.telnyx.sdk.core.http.Headers.builder().build())
    }

    @Test
    fun body() {
        val params =
            EmailTemplateCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .name("Welcome Email")
                .htmlBody("<h1>Hello {{ first_name }}</h1>")
                .subject("Welcome, {{ first_name }}!")
                .textBody("Hello {{ first_name }}")
                .addVariable("string")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Welcome Email")
        assertThat(body.htmlBody()).contains("<h1>Hello {{ first_name }}</h1>")
        assertThat(body.subject()).contains("Welcome, {{ first_name }}!")
        assertThat(body.textBody()).contains("Hello {{ first_name }}")
        assertThat(body.variables().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailTemplateCreateParams.builder().name("Welcome Email").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Welcome Email")
    }
}
