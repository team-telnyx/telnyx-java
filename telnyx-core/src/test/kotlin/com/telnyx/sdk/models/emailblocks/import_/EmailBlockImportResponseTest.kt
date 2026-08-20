// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks.import_

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockImportResponseTest {

    @Test
    fun create() {
        val emailBlockImportResponse =
            EmailBlockImportResponse.builder()
                .data(
                    EmailBlockImport.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(EmailBlockImport.RecordType.EMAIL_BLOCK_IMPORT)
                        .status(EmailBlockImport.Status.PENDING)
                        .total(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdCount(0L)
                        .errorCount(0L)
                        .errors(
                            EmailBlockImport.Errors.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .existingCount(0L)
                        .failureReason("failure_reason")
                        .processedRows(0L)
                        .provider(EmailBlockImport.Provider.SENDGRID)
                        .skippedCount(0L)
                        .build()
                )
                .build()

        assertThat(emailBlockImportResponse.data())
            .isEqualTo(
                EmailBlockImport.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .recordType(EmailBlockImport.RecordType.EMAIL_BLOCK_IMPORT)
                    .status(EmailBlockImport.Status.PENDING)
                    .total(0L)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .createdCount(0L)
                    .errorCount(0L)
                    .errors(
                        EmailBlockImport.Errors.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .existingCount(0L)
                    .failureReason("failure_reason")
                    .processedRows(0L)
                    .provider(EmailBlockImport.Provider.SENDGRID)
                    .skippedCount(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockImportResponse =
            EmailBlockImportResponse.builder()
                .data(
                    EmailBlockImport.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .recordType(EmailBlockImport.RecordType.EMAIL_BLOCK_IMPORT)
                        .status(EmailBlockImport.Status.PENDING)
                        .total(0L)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .createdCount(0L)
                        .errorCount(0L)
                        .errors(
                            EmailBlockImport.Errors.builder()
                                .putAdditionalProperty("foo", JsonValue.from("string"))
                                .build()
                        )
                        .existingCount(0L)
                        .failureReason("failure_reason")
                        .processedRows(0L)
                        .provider(EmailBlockImport.Provider.SENDGRID)
                        .skippedCount(0L)
                        .build()
                )
                .build()

        val roundtrippedEmailBlockImportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockImportResponse),
                jacksonTypeRef<EmailBlockImportResponse>(),
            )

        assertThat(roundtrippedEmailBlockImportResponse).isEqualTo(emailBlockImportResponse)
    }
}
