// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documentlinks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentLinkListResponseTest {

    @Test
    fun create() {
        val documentLinkListResponse =
            DocumentLinkListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .linkedRecordType("porting_order")
                .linkedResourceId("132091b4-442b-4a2a-b87f-61e707e46d54")
                .recordType("document_link")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(documentLinkListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(documentLinkListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(documentLinkListResponse.documentId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(documentLinkListResponse.linkedRecordType()).contains("porting_order")
        assertThat(documentLinkListResponse.linkedResourceId())
            .contains("132091b4-442b-4a2a-b87f-61e707e46d54")
        assertThat(documentLinkListResponse.recordType()).contains("document_link")
        assertThat(documentLinkListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentLinkListResponse =
            DocumentLinkListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .linkedRecordType("porting_order")
                .linkedResourceId("132091b4-442b-4a2a-b87f-61e707e46d54")
                .recordType("document_link")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedDocumentLinkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentLinkListResponse),
                jacksonTypeRef<DocumentLinkListResponse>(),
            )

        assertThat(roundtrippedDocumentLinkListResponse).isEqualTo(documentLinkListResponse)
    }
}
