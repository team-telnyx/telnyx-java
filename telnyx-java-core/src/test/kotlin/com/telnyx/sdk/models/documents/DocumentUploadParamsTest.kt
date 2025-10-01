// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import com.telnyx.sdk.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadParamsTest {

    @Test
    fun create() {
        DocumentUploadParams.builder()
            .body(
                DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
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
                .body(
                    DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .customerReference("MY REF 001")
                        .filename("test-document.pdf")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "body" to
                            MultipartField.of(
                                DocumentUploadParams.Body.ofDocServiceDocumentUploadUrl(
                                    DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
                                        .url(
                                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                                        )
                                        .customerReference("MY REF 001")
                                        .filename("test-document.pdf")
                                        .build()
                                )
                            )
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            DocumentUploadParams.builder()
                .body(
                    DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
                        .url(
                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "body" to
                            MultipartField.of(
                                DocumentUploadParams.Body.ofDocServiceDocumentUploadUrl(
                                    DocumentUploadParams.Body.DocServiceDocumentUploadUrl.builder()
                                        .url(
                                            "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf"
                                        )
                                        .build()
                                )
                            )
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
