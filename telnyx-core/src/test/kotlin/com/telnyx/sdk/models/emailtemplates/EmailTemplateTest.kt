// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateTest {

    @Test
    fun create() {
        val emailTemplate =
            EmailTemplate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autoescape(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .htmlBody("html_body")
                .name("name")
                .recordType(EmailTemplateCommon.RecordType.EMAIL_TEMPLATE)
                .strictVariables(true)
                .textBody("text_body")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .variableSchema(
                    EmailTemplateCommon.VariableSchema.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("required" to true, "default" to "default")),
                        )
                        .build()
                )
                .addVariable("string")
                .variablesMode(EmailTemplateCommon.VariablesMode.AUTOMATIC)
                .subject("subject")
                .build()

        assertThat(emailTemplate.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailTemplate.autoescape()).isEqualTo(true)
        assertThat(emailTemplate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplate.htmlBody()).contains("html_body")
        assertThat(emailTemplate.name()).isEqualTo("name")
        assertThat(emailTemplate.recordType())
            .isEqualTo(EmailTemplateCommon.RecordType.EMAIL_TEMPLATE)
        assertThat(emailTemplate.strictVariables()).isEqualTo(true)
        assertThat(emailTemplate.textBody()).contains("text_body")
        assertThat(emailTemplate.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplate.variableSchema())
            .contains(
                EmailTemplateCommon.VariableSchema.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("required" to true, "default" to "default")),
                    )
                    .build()
            )
        assertThat(emailTemplate.variables()).containsExactly("string")
        assertThat(emailTemplate.variablesMode())
            .isEqualTo(EmailTemplateCommon.VariablesMode.AUTOMATIC)
        assertThat(emailTemplate.subject()).contains("subject")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplate =
            EmailTemplate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .autoescape(true)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .htmlBody("html_body")
                .name("name")
                .recordType(EmailTemplateCommon.RecordType.EMAIL_TEMPLATE)
                .strictVariables(true)
                .textBody("text_body")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .variableSchema(
                    EmailTemplateCommon.VariableSchema.builder()
                        .putAdditionalProperty(
                            "foo",
                            JsonValue.from(mapOf("required" to true, "default" to "default")),
                        )
                        .build()
                )
                .addVariable("string")
                .variablesMode(EmailTemplateCommon.VariablesMode.AUTOMATIC)
                .subject("subject")
                .build()

        val roundtrippedEmailTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplate),
                jacksonTypeRef<EmailTemplate>(),
            )

        assertThat(roundtrippedEmailTemplate).isEqualTo(emailTemplate)
    }
}
