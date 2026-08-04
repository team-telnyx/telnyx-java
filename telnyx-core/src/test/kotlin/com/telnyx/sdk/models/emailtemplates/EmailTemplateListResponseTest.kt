// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailtemplates

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.emailinboxes.threads.EmailPaginationMeta
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailTemplateListResponseTest {

    @Test
    fun create() {
        val emailTemplateListResponse =
            EmailTemplateListResponse.builder()
                .addData(
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
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        assertThat(emailTemplateListResponse.data())
            .containsExactly(
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
        assertThat(emailTemplateListResponse.meta())
            .isEqualTo(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailTemplateListResponse =
            EmailTemplateListResponse.builder()
                .addData(
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
                .meta(EmailPaginationMeta.builder().pageSize(1L).pageCursor("page_cursor").build())
                .build()

        val roundtrippedEmailTemplateListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailTemplateListResponse),
                jacksonTypeRef<EmailTemplateListResponse>(),
            )

        assertThat(roundtrippedEmailTemplateListResponse).isEqualTo(emailTemplateListResponse)
    }
}
