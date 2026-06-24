// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingAdditionalDocumentTest {

    @Test
    fun create() {
        val portingAdditionalDocument =
            PortingAdditionalDocument.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .contentType("text/plain")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                .documentType(PortingAdditionalDocument.DocumentType.LOA)
                .filename("file.txt")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_additional_document")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        assertThat(portingAdditionalDocument.id()).contains("eef3340b-8903-4466-b445-89b697315a3a")
        assertThat(portingAdditionalDocument.contentType()).contains("text/plain")
        assertThat(portingAdditionalDocument.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingAdditionalDocument.documentId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingAdditionalDocument.documentType())
            .contains(PortingAdditionalDocument.DocumentType.LOA)
        assertThat(portingAdditionalDocument.filename()).contains("file.txt")
        assertThat(portingAdditionalDocument.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingAdditionalDocument.recordType()).contains("porting_additional_document")
        assertThat(portingAdditionalDocument.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingAdditionalDocument =
            PortingAdditionalDocument.builder()
                .id("eef3340b-8903-4466-b445-89b697315a3a")
                .contentType("text/plain")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .documentId("f1486bae-f067-460c-ad43-73a92848f902")
                .documentType(PortingAdditionalDocument.DocumentType.LOA)
                .filename("file.txt")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_additional_document")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .build()

        val roundtrippedPortingAdditionalDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingAdditionalDocument),
                jacksonTypeRef<PortingAdditionalDocument>(),
            )

        assertThat(roundtrippedPortingAdditionalDocument).isEqualTo(portingAdditionalDocument)
    }
}
