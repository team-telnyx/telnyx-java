// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocServiceDocumentTest {

    @Test
    fun create() {
        val docServiceDocument =
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

        assertThat(docServiceDocument.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(docServiceDocument.avScanStatus())
            .contains(DocServiceDocument.AvScanStatus.SCANNED)
        assertThat(docServiceDocument.contentType()).contains("application/pdf")
        assertThat(docServiceDocument.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(docServiceDocument.customerReference()).contains("MY REF 001")
        assertThat(docServiceDocument.filename()).contains("test-document.pdf")
        assertThat(docServiceDocument.recordType()).contains("document")
        assertThat(docServiceDocument.sha256())
            .contains("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
        assertThat(docServiceDocument.size())
            .contains(DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build())
        assertThat(docServiceDocument.status()).contains(DocServiceDocument.Status.PENDING)
        assertThat(docServiceDocument.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val docServiceDocument =
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

        val roundtrippedDocServiceDocument =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(docServiceDocument),
                jacksonTypeRef<DocServiceDocument>(),
            )

        assertThat(roundtrippedDocServiceDocument).isEqualTo(docServiceDocument)
    }
}
