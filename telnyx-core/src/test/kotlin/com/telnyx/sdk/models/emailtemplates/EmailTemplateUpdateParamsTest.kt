// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateUpdateParamsTest {

    @Test
    fun create() {
        EmailTemplateUpdateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .updateEmailTemplateRequest(
                UpdateEmailTemplateRequest.builder()
                    .autoescape(true)
                    .htmlBody("html_body")
                    .name("name")
                    .strictVariables(true)
                    .subject("Welcome aboard, {{first_name}}!")
                    .textBody("text_body")
                    .variableSchema(
                        UpdateEmailTemplateRequest.VariableSchema.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("required" to true, "default" to "default")),
                            )
                            .build()
                    )
                    .addVariable("string")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EmailTemplateUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updateEmailTemplateRequest(UpdateEmailTemplateRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EmailTemplateUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updateEmailTemplateRequest(
                    UpdateEmailTemplateRequest.builder()
                        .autoescape(true)
                        .htmlBody("html_body")
                        .name("name")
                        .strictVariables(true)
                        .subject("Welcome aboard, {{first_name}}!")
                        .textBody("text_body")
                        .variableSchema(
                            UpdateEmailTemplateRequest.VariableSchema.builder()
                                .putAdditionalProperty(
                                    "foo",
                                    JsonValue.from(
                                        mapOf("required" to true, "default" to "default")
                                    ),
                                )
                                .build()
                        )
                        .addVariable("string")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                UpdateEmailTemplateRequest.builder()
                    .autoescape(true)
                    .htmlBody("html_body")
                    .name("name")
                    .strictVariables(true)
                    .subject("Welcome aboard, {{first_name}}!")
                    .textBody("text_body")
                    .variableSchema(
                        UpdateEmailTemplateRequest.VariableSchema.builder()
                            .putAdditionalProperty(
                                "foo",
                                JsonValue.from(mapOf("required" to true, "default" to "default")),
                            )
                            .build()
                    )
                    .addVariable("string")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EmailTemplateUpdateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .updateEmailTemplateRequest(UpdateEmailTemplateRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateEmailTemplateRequest.builder().build())
    }
}
