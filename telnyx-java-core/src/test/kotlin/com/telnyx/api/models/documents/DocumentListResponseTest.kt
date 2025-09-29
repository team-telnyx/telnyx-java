// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentListResponseTest {

    @Test
    fun create() {
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    DocServiceDocument.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .contentType("application/pdf")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .recordType("document")
                        .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                        .size(
                            DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build()
                        )
                        .status(DocServiceDocument.Status.PENDING)
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

        assertThat(documentListResponse.data().getOrNull())
            .containsExactly(
                DocServiceDocument.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .contentType("application/pdf")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .customerReference("MY REF 001")
                    .filename("test-document.pdf")
                    .recordType("document")
                    .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                    .size(DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build())
                    .status(DocServiceDocument.Status.PENDING)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(documentListResponse.meta())
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
        val documentListResponse =
            DocumentListResponse.builder()
                .addData(
                    DocServiceDocument.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .contentType("application/pdf")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .recordType("document")
                        .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                        .size(
                            DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build()
                        )
                        .status(DocServiceDocument.Status.PENDING)
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

        val roundtrippedDocumentListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentListResponse),
                jacksonTypeRef<DocumentListResponse>(),
            )

        assertThat(roundtrippedDocumentListResponse).isEqualTo(documentListResponse)
    }
}
