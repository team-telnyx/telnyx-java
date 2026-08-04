// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.emailvalidations.batch

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BatchCreateResponseTest {

    @Test
    fun create() {
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .data(
                    BatchCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .duplicatesRemoved(0L)
                        .recordType(BatchCreateResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                        .status(EmailValidationBatchStatus.PENDING)
                        .total(0L)
                        .webhookUrl("https://example.com")
                        .build()
                )
                .build()

        assertThat(batchCreateResponse.data())
            .isEqualTo(
                BatchCreateResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .duplicatesRemoved(0L)
                    .recordType(BatchCreateResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                    .status(EmailValidationBatchStatus.PENDING)
                    .total(0L)
                    .webhookUrl("https://example.com")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val batchCreateResponse =
            BatchCreateResponse.builder()
                .data(
                    BatchCreateResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .duplicatesRemoved(0L)
                        .recordType(BatchCreateResponse.Data.RecordType.EMAIL_VALIDATION_BATCH)
                        .status(EmailValidationBatchStatus.PENDING)
                        .total(0L)
                        .webhookUrl("https://example.com")
                        .build()
                )
                .build()

        val roundtrippedBatchCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(batchCreateResponse),
                jacksonTypeRef<BatchCreateResponse>(),
            )

        assertThat(roundtrippedBatchCreateResponse).isEqualTo(batchCreateResponse)
    }
}
