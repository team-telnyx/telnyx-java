// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateCreateParamsTest {

    @Test
    fun create() {
        EmailTemplateCreateParams.builder()
            .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
            .name("Welcome Email")
            .autoescape(true)
            .htmlBody("<h1>Hello {{ first_name }}</h1>")
            .strictVariables(true)
            .subject("Welcome, {{ first_name }}!")
            .textBody("Hello {{ first_name }}")
            .variableSchema(
                EmailTemplateCreateParams.VariableSchema.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("required" to true, "default" to "default")),
                    )
                    .build()
            )
            .addVariable("string")
            .build()
    }

    @Test
    fun headers() {
        val params =
            EmailTemplateCreateParams.builder()
                .idempotencyKey("8e03978e-40d5-43e8-bc93-6894a57f9326")
                .name("Welcome Email")
                .autoescape(true)
                .htmlBody("<h1>Hello {{ first_name }}</h1>")
                .strictVariables(true)
                .subject("Welcome, {{ first_name }}!")
                .textBody("Hello {{ first_name }}")
                .variableSchema(
                    EmailTemplateCreateParams.VariableSchema.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("required" to true, "default" to "default")),
                        )
                        .build()
                )
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
                .autoescape(true)
                .htmlBody("<h1>Hello {{ first_name }}</h1>")
                .strictVariables(true)
                .subject("Welcome, {{ first_name }}!")
                .textBody("Hello {{ first_name }}")
                .variableSchema(
                    EmailTemplateCreateParams.VariableSchema.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("required" to true, "default" to "default")),
                        )
                        .build()
                )
                .addVariable("string")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Welcome Email")
        assertThat(body.autoescape()).contains(true)
        assertThat(body.htmlBody()).contains("<h1>Hello {{ first_name }}</h1>")
        assertThat(body.strictVariables()).contains(true)
        assertThat(body.subject()).contains("Welcome, {{ first_name }}!")
        assertThat(body.textBody()).contains("Hello {{ first_name }}")
        assertThat(body.variableSchema())
            .contains(
                EmailTemplateCreateParams.VariableSchema.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("required" to true, "default" to "default")),
                    )
                    .build()
            )
        assertThat(body.variables().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = EmailTemplateCreateParams.builder().name("Welcome Email").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("Welcome Email")
    }
}
