// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts.supportingdocuments

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SupportingDocumentCreateParamsTest {

    @Test
    fun create() {
        SupportingDocumentCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addDocument(
                SupportingDocumentCreateParams.Document.builder()
                    .documentId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .type(SupportingDocumentCreateParams.Document.Type.LOA)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SupportingDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            SupportingDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addDocument(
                    SupportingDocumentCreateParams.Document.builder()
                        .documentId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .type(SupportingDocumentCreateParams.Document.Type.LOA)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.documents().getOrNull())
            .containsExactly(
                SupportingDocumentCreateParams.Document.builder()
                    .documentId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .type(SupportingDocumentCreateParams.Document.Type.LOA)
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SupportingDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
