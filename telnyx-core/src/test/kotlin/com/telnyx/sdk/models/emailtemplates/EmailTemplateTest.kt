// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .htmlBody("html_body")
                .name("name")
                .recordType(EmailTemplate.RecordType.EMAIL_TEMPLATE)
                .subject("subject")
                .textBody("text_body")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVariable("string")
                .build()

        assertThat(emailTemplate.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailTemplate.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplate.htmlBody()).contains("html_body")
        assertThat(emailTemplate.name()).isEqualTo("name")
        assertThat(emailTemplate.recordType()).isEqualTo(EmailTemplate.RecordType.EMAIL_TEMPLATE)
        assertThat(emailTemplate.subject()).contains("subject")
        assertThat(emailTemplate.textBody()).contains("text_body")
        assertThat(emailTemplate.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailTemplate.variables()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplate =
            EmailTemplate.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .htmlBody("html_body")
                .name("name")
                .recordType(EmailTemplate.RecordType.EMAIL_TEMPLATE)
                .subject("subject")
                .textBody("text_body")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .addVariable("string")
                .build()

        val roundtrippedEmailTemplate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplate),
                jacksonTypeRef<EmailTemplate>(),
            )

        assertThat(roundtrippedEmailTemplate).isEqualTo(emailTemplate)
    }
}
