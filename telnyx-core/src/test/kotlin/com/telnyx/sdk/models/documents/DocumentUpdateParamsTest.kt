// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUpdateParamsTest {

    @Test
    fun create() {
        DocumentUpdateParams.builder()
            .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .docServiceDocument(
                DocServiceDocument.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("document")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
                    .contentType("application/pdf")
                    .customerReference("MY REF 001")
                    .filename("test-document.pdf")
                    .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                    .size(DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build())
                    .status(DocServiceDocument.Status.PENDING)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            DocumentUpdateParams.builder()
                .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .docServiceDocument(DocServiceDocument.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            DocumentUpdateParams.builder()
                .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .docServiceDocument(
                    DocServiceDocument.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("document")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
                        .contentType("application/pdf")
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                        .size(
                            DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build()
                        )
                        .status(DocServiceDocument.Status.PENDING)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DocServiceDocument.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("document")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .avScanStatus(DocServiceDocument.AvScanStatus.SCANNED)
                    .contentType("application/pdf")
                    .customerReference("MY REF 001")
                    .filename("test-document.pdf")
                    .sha256("08a96c641c3a74e44eb59afb61a24f2cb9f4d7188748e76ba4bb5edfa3cb7d1c")
                    .size(DocServiceDocument.Size.builder().amount(123456L).unit("bytes").build())
                    .status(DocServiceDocument.Status.PENDING)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUpdateParams.builder()
                .documentId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .docServiceDocument(DocServiceDocument.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(DocServiceDocument.builder().build())
    }
}
