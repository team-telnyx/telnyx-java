// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.portouts.supportingdocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportingDocumentListResponseTest {

    @Test
    fun create() {
        val supportingDocumentListResponse =
            SupportingDocumentListResponse.builder()
                .addData(
                    SupportingDocumentListResponse.Data.builder()
                        .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("supporting_document")
                        .type(SupportingDocumentListResponse.Data.Type.LOA)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(supportingDocumentListResponse.data().getOrNull())
            .containsExactly(
                SupportingDocumentListResponse.Data.builder()
                    .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                    .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .recordType("supporting_document")
                    .type(SupportingDocumentListResponse.Data.Type.LOA)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supportingDocumentListResponse =
            SupportingDocumentListResponse.builder()
                .addData(
                    SupportingDocumentListResponse.Data.builder()
                        .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("supporting_document")
                        .type(SupportingDocumentListResponse.Data.Type.LOA)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedSupportingDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supportingDocumentListResponse),
                jacksonTypeRef<SupportingDocumentListResponse>(),
            )

        assertThat(roundtrippedSupportingDocumentListResponse)
            .isEqualTo(supportingDocumentListResponse)
    }
}
