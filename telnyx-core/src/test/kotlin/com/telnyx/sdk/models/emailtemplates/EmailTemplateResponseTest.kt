// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateResponseTest {

    @Test
    fun create() {
        val emailTemplateResponse =
            EmailTemplateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(emailTemplateResponse.data())
            .isEqualTo(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplateResponse =
            EmailTemplateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedEmailTemplateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplateResponse),
                jacksonTypeRef<EmailTemplateResponse>(),
            )

        assertThat(roundtrippedEmailTemplateResponse).isEqualTo(emailTemplateResponse)
    }
}
