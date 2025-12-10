// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documentlinks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentLinkListResponseTest {

    @Test
    fun create() {
        val documentLinkListResponse =
            DocumentLinkListResponse.builder()
                .addData(
                    DocumentLinkListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .linkedRecordType("porting_order")
                        .linkedResourceId("132091b4-442b-4a2a-b87f-61e707e46d54")
                        .recordType("document_link")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(documentLinkListResponse.data().getOrNull())
            .containsExactly(
                DocumentLinkListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .linkedRecordType("porting_order")
                    .linkedResourceId("132091b4-442b-4a2a-b87f-61e707e46d54")
                    .recordType("document_link")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(documentLinkListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentLinkListResponse =
            DocumentLinkListResponse.builder()
                .addData(
                    DocumentLinkListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .linkedRecordType("porting_order")
                        .linkedResourceId("132091b4-442b-4a2a-b87f-61e707e46d54")
                        .recordType("document_link")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedDocumentLinkListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentLinkListResponse),
                jacksonTypeRef<DocumentLinkListResponse>(),
            )

        assertThat(roundtrippedDocumentLinkListResponse).isEqualTo(documentLinkListResponse)
    }
}
