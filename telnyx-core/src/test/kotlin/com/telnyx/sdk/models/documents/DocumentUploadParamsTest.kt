// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadParamsTest {

    @Test
    fun create() {
        DocumentUploadParams.builder()
            .document(
                DocumentUploadParams.Document.DocServiceDocumentUploadUrl.builder()
                    .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                    .customerReference("MY REF 001")
                    .filename("test-document.pdf")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentUploadParams.builder()
                .document(
                    DocumentUploadParams.Document.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DocumentUploadParams.Document.ofDocServiceDocumentUploadUrl(
                    DocumentUploadParams.Document.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .build()
                )
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUploadParams.builder()
                .document(
                    DocumentUploadParams.Document.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DocumentUploadParams.Document.ofDocServiceDocumentUploadUrl(
                    DocumentUploadParams.Document.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .build()
                )
            )
    }
}
