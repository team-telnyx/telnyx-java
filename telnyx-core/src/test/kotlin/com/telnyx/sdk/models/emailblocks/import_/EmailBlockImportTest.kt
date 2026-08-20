// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailblocks.import_

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EmailBlockImportTest {

    @Test
    fun create() {
        val emailBlockImport =
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

        assertThat(emailBlockImport.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(emailBlockImport.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlockImport.recordType())
            .isEqualTo(EmailBlockImport.RecordType.EMAIL_BLOCK_IMPORT)
        assertThat(emailBlockImport.status()).isEqualTo(EmailBlockImport.Status.PENDING)
        assertThat(emailBlockImport.total()).isEqualTo(0L)
        assertThat(emailBlockImport.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlockImport.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(emailBlockImport.createdCount()).contains(0L)
        assertThat(emailBlockImport.errorCount()).contains(0L)
        assertThat(emailBlockImport.errors())
            .contains(
                EmailBlockImport.Errors.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(emailBlockImport.existingCount()).contains(0L)
        assertThat(emailBlockImport.failureReason()).contains("failure_reason")
        assertThat(emailBlockImport.processedRows()).contains(0L)
        assertThat(emailBlockImport.provider()).contains(EmailBlockImport.Provider.SENDGRID)
        assertThat(emailBlockImport.skippedCount()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val emailBlockImport =
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

        val roundtrippedEmailBlockImport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(emailBlockImport),
                jacksonTypeRef<EmailBlockImport>(),
            )

        assertThat(roundtrippedEmailBlockImport).isEqualTo(emailBlockImport)
    }
}
