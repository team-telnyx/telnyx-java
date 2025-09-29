// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portingorders.additionaldocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdditionalDocumentCreateResponseTest {

    @Test
    fun create() {
        val additionalDocumentCreateResponse =
            AdditionalDocumentCreateResponse.builder()
                .addData(
                    AdditionalDocumentCreateResponse.Data.builder()
                        .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                        .contentType("text/plain")
                        .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                        .documentType(AdditionalDocumentCreateResponse.Data.DocumentType.LOA)
                        .filename("file.txt")
                        .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                        .recordType("porting_additional_document")
                        .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .build()
                )
                .build()

        assertThat(additionalDocumentCreateResponse.data().getOrNull())
            .containsExactly(
                AdditionalDocumentCreateResponse.Data.builder()
                    .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                    .contentType("text/plain")
                    .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                    .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                    .documentType(AdditionalDocumentCreateResponse.Data.DocumentType.LOA)
                    .filename("file.txt")
                    .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                    .recordType("porting_additional_document")
                    .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val additionalDocumentCreateResponse =
            AdditionalDocumentCreateResponse.builder()
                .addData(
                    AdditionalDocumentCreateResponse.Data.builder()
                        .id("2acd1061-33cb-49b8-8014-beb6dc3fedbf")
                        .contentType("text/plain")
                        .createdAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .documentId("40bc547a-7f96-4cd5-926a-da4842671e88")
                        .documentType(AdditionalDocumentCreateResponse.Data.DocumentType.LOA)
                        .filename("file.txt")
                        .portingOrderId("9d7b3b8e-4e67-4837-9c44-d110cd2c82a1")
                        .recordType("porting_additional_document")
                        .updatedAt(OffsetDateTime.parse("2023-06-01T10:00:00.00000Z"))
                        .build()
                )
                .build()

        val roundtrippedAdditionalDocumentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(additionalDocumentCreateResponse),
                jacksonTypeRef<AdditionalDocumentCreateResponse>(),
            )

        assertThat(roundtrippedAdditionalDocumentCreateResponse)
            .isEqualTo(additionalDocumentCreateResponse)
    }
}
