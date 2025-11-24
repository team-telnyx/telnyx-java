// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadJsonResponseTest {

    @Test
    fun create() {
        val documentUploadJsonResponse =
            DocumentUploadJsonResponse.builder()
                .data(
                    DocServiceDocument.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
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
                .build()

        assertThat(documentUploadJsonResponse.data())
            .contains(
                DocServiceDocument.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
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
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val documentUploadJsonResponse =
            DocumentUploadJsonResponse.builder()
                .data(
                    DocServiceDocument.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
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
                .build()

        val roundtrippedDocumentUploadJsonResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(documentUploadJsonResponse),
                jacksonTypeRef<DocumentUploadJsonResponse>(),
            )

        assertThat(roundtrippedDocumentUploadJsonResponse).isEqualTo(documentUploadJsonResponse)
    }
}
