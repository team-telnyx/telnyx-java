// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdditionalDocumentListResponseTest {

    @Test
    fun create() {
        val additionalDocumentListResponse =
            AdditionalDocumentListResponse.builder()
                .addData(
                    AdditionalDocumentListResponse.Data.builder()
                        .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                        .contentType("text/plain")
                        .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                        .documentType(AdditionalDocumentListResponse.Data.DocumentType.LOA)
                        .filename("file.txt")
                        .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                        .recordType("porting_additional_document")
                        .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        assertThat(additionalDocumentListResponse.data().getOrNull())
            .containsExactly(
                AdditionalDocumentListResponse.Data.builder()
                    .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                    .contentType("text/plain")
                    .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                    .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                    .documentType(AdditionalDocumentListResponse.Data.DocumentType.LOA)
                    .filename("file.txt")
                    .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                    .recordType("porting_additional_document")
                    .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                    .build()
            )
        assertThat(additionalDocumentListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(25L)
                    .totalPages(1L)
                    .totalResults(1L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val additionalDocumentListResponse =
            AdditionalDocumentListResponse.builder()
                .addData(
                    AdditionalDocumentListResponse.Data.builder()
                        .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                        .contentType("text/plain")
                        .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                        .documentType(AdditionalDocumentListResponse.Data.DocumentType.LOA)
                        .filename("file.txt")
                        .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                        .recordType("porting_additional_document")
                        .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(25L)
                        .totalPages(1L)
                        .totalResults(1L)
                        .build()
                )
                .build()

        val roundtrippedAdditionalDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(additionalDocumentListResponse),
                jacksonTypeRef<AdditionalDocumentListResponse>(),
            )

        assertThat(roundtrippedAdditionalDocumentListResponse)
            .isEqualTo(additionalDocumentListResponse)
    }
}
