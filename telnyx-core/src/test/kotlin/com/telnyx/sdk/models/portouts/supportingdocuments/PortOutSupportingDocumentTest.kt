// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.supportingdocuments

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortOutSupportingDocumentTest {

    @Test
    fun create() {
        val portOutSupportingDocument =
            PortOutSupportingDocument.builder()
                .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                .createdAt("2018-02-02T22:25:27.521Z")
                .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .recordType("supporting_document")
                .type(PortOutSupportingDocument.Type.LOA)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(portOutSupportingDocument.id()).isEqualTo("5a16902a-2ee9-4882-a247-420fc6627b62")
        assertThat(portOutSupportingDocument.createdAt()).isEqualTo("2018-02-02T22:25:27.521Z")
        assertThat(portOutSupportingDocument.documentId())
            .isEqualTo("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
        assertThat(portOutSupportingDocument.portoutId())
            .isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(portOutSupportingDocument.recordType()).isEqualTo("supporting_document")
        assertThat(portOutSupportingDocument.type()).isEqualTo(PortOutSupportingDocument.Type.LOA)
        assertThat(portOutSupportingDocument.updatedAt()).isEqualTo("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portOutSupportingDocument =
            PortOutSupportingDocument.builder()
                .id("5a16902a-2ee9-4882-a247-420fc6627b62")
                .createdAt("2018-02-02T22:25:27.521Z")
                .documentId("f1c5e079-9d82-4f50-95bc-ae2f6b8d84d7")
                .portoutId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .recordType("supporting_document")
                .type(PortOutSupportingDocument.Type.LOA)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedPortOutSupportingDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portOutSupportingDocument),
                jacksonTypeRef<PortOutSupportingDocument>(),
            )

        assertThat(roundtrippedPortOutSupportingDocument).isEqualTo(portOutSupportingDocument)
    }
}
