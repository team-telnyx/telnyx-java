// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateEmailTemplateRequestTest {

    @Test
    fun create() {
        val updateEmailTemplateRequest =
            UpdateEmailTemplateRequest.builder()
                .autoescape(true)
                .htmlBody("html_body")
                .name("name")
                .strictVariables(true)
                .subject("subject")
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

        assertThat(updateEmailTemplateRequest.autoescape()).contains(true)
        assertThat(updateEmailTemplateRequest.htmlBody()).contains("html_body")
        assertThat(updateEmailTemplateRequest.name()).contains("name")
        assertThat(updateEmailTemplateRequest.strictVariables()).contains(true)
        assertThat(updateEmailTemplateRequest.subject()).contains("subject")
        assertThat(updateEmailTemplateRequest.textBody()).contains("text_body")
        assertThat(updateEmailTemplateRequest.variableSchema())
            .contains(
                UpdateEmailTemplateRequest.VariableSchema.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("required" to true, "default" to "default")),
                    )
                    .build()
            )
        assertThat(updateEmailTemplateRequest.variables().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateEmailTemplateRequest =
            UpdateEmailTemplateRequest.builder()
                .autoescape(true)
                .htmlBody("html_body")
                .name("name")
                .strictVariables(true)
                .subject("subject")
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

        val roundtrippedUpdateEmailTemplateRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateEmailTemplateRequest),
                jacksonTypeRef<UpdateEmailTemplateRequest>(),
            )

        assertThat(roundtrippedUpdateEmailTemplateRequest).isEqualTo(updateEmailTemplateRequest)
    }
}
