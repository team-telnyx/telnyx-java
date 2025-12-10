// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdditionalDocumentListResponseTest {

    @Test
    fun create() {
        val additionalDocumentListResponse =
            AdditionalDocumentListResponse.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .contentType("text/plain")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                .documentType(AdditionalDocumentListResponse.DocumentType.LOA)
                .filename("file.txt")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_additional_document")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(additionalDocumentListResponse.id())
            .contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(additionalDocumentListResponse.contentType()).contains("text/plain")
        assertThat(additionalDocumentListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(additionalDocumentListResponse.documentId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(additionalDocumentListResponse.documentType())
            .contains(AdditionalDocumentListResponse.DocumentType.LOA)
        assertThat(additionalDocumentListResponse.filename()).contains("file.txt")
        assertThat(additionalDocumentListResponse.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(additionalDocumentListResponse.recordType())
            .contains("porting_additional_document")
        assertThat(additionalDocumentListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val additionalDocumentListResponse =
            AdditionalDocumentListResponse.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .contentType("text/plain")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                .documentType(AdditionalDocumentListResponse.DocumentType.LOA)
                .filename("file.txt")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_additional_document")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
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
