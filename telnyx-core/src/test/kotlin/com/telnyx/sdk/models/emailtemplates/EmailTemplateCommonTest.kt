// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateCommonTest {

    @Test
    fun create() {
        val emailTemplateCommon =
            EmailTemplateCommon.builder()
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
                .build()

        assertThat(emailTemplateCommon.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailTemplateCommon.autoescape()).isEqualTo(true)
        assertThat(emailTemplateCommon.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplateCommon.htmlBody()).contains("html_body")
        assertThat(emailTemplateCommon.name()).isEqualTo("name")
        assertThat(emailTemplateCommon.recordType())
            .isEqualTo(EmailTemplateCommon.RecordType.EMAIL_TEMPLATE)
        assertThat(emailTemplateCommon.strictVariables()).isEqualTo(true)
        assertThat(emailTemplateCommon.textBody()).contains("text_body")
        assertThat(emailTemplateCommon.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplateCommon.variableSchema())
            .contains(
                EmailTemplateCommon.VariableSchema.builder()
                    .putAdditionalProperty(
                        "foo",
                        JsonValue.from(mapOf("required" to true, "default" to "default")),
                    )
                    .build()
            )
        assertThat(emailTemplateCommon.variables()).containsExactly("string")
        assertThat(emailTemplateCommon.variablesMode())
            .isEqualTo(EmailTemplateCommon.VariablesMode.AUTOMATIC)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplateCommon =
            EmailTemplateCommon.builder()
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
                .build()

        val roundtrippedEmailTemplateCommon =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplateCommon),
                jacksonTypeRef<EmailTemplateCommon>(),
            )

        assertThat(roundtrippedEmailTemplateCommon).isEqualTo(emailTemplateCommon)
    }
}
