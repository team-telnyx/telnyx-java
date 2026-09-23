// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateRenderResponseTest {

    @Test
    fun create() {
        val emailTemplateRenderResponse =
            EmailTemplateRenderResponse.builder()
                .data(
                    EmailTemplateRenderResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .autoescape(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .htmlBody("html_body")
                        .name("name")
                        .recordType(EmailTemplate.RecordType.EMAIL_TEMPLATE)
                        .strictVariables(true)
                        .subject("subject")
                        .textBody("text_body")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .variableSchema(
                            EmailTemplate.VariableSchema.builder()
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

        assertThat(emailTemplateRenderResponse.data())
            .isEqualTo(
                EmailTemplateRenderResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .autoescape(true)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .htmlBody("html_body")
                    .name("name")
                    .recordType(EmailTemplate.RecordType.EMAIL_TEMPLATE)
                    .strictVariables(true)
                    .subject("subject")
                    .textBody("text_body")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .variableSchema(
                        EmailTemplate.VariableSchema.builder()
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
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplateRenderResponse =
            EmailTemplateRenderResponse.builder()
                .data(
                    EmailTemplateRenderResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .autoescape(true)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .htmlBody("html_body")
                        .name("name")
                        .recordType(EmailTemplate.RecordType.EMAIL_TEMPLATE)
                        .strictVariables(true)
                        .subject("subject")
                        .textBody("text_body")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .variableSchema(
                            EmailTemplate.VariableSchema.builder()
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

        val roundtrippedEmailTemplateRenderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplateRenderResponse),
                jacksonTypeRef<EmailTemplateRenderResponse>(),
            )

        assertThat(roundtrippedEmailTemplateRenderResponse).isEqualTo(emailTemplateRenderResponse)
    }
}
