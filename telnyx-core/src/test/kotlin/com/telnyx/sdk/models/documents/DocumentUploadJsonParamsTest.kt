// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documents

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentUploadJsonParamsTest {

    @Test
    fun create() {
        DocumentUploadJsonParams.builder()
            .customerReference("MY REF 001")
            .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
            .filename("test-document.pdf")
            .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
            .build()
    }

    @Test
    fun body() {
        val params =
            DocumentUploadJsonParams.builder()
                .customerReference("MY REF 001")
                .file("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
                .filename("test-document.pdf")
                .url("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
                .build()

        val body = params._body()

        assertThat(body.customerReference()).contains("MY REF 001")
        assertThat(body.file()).contains("ZXhhbXBsZSBvZiBlbmNvZGVkIGNvbnRlbnQ=")
        assertThat(body.filename()).contains("test-document.pdf")
        assertThat(body.url())
            .contains("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = DocumentUploadJsonParams.builder().build()

        val body = params._body()
    }
}
