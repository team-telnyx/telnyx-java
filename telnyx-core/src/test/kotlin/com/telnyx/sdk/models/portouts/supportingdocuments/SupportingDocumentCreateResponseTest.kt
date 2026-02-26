// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.supportingdocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportingDocumentCreateResponseTest {

    @Test
    fun create() {
        val supportingDocumentCreateResponse =
            SupportingDocumentCreateResponse.builder()
                .addData(
                    PortOutSupportingDocument.builder()
                        .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("supporting_document")
                        .type(PortOutSupportingDocument.Type.LOA)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(supportingDocumentCreateResponse.data().getOrNull())
            .containsExactly(
                PortOutSupportingDocument.builder()
                    .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                    .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .recordType("supporting_document")
                    .type(PortOutSupportingDocument.Type.LOA)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val supportingDocumentCreateResponse =
            SupportingDocumentCreateResponse.builder()
                .addData(
                    PortOutSupportingDocument.builder()
                        .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                        .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .recordType("supporting_document")
                        .type(PortOutSupportingDocument.Type.LOA)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedSupportingDocumentCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(supportingDocumentCreateResponse),
                jacksonTypeRef<SupportingDocumentCreateResponse>(),
            )

        assertThat(roundtrippedSupportingDocumentCreateResponse)
            .isEqualTo(supportingDocumentCreateResponse)
    }
}
