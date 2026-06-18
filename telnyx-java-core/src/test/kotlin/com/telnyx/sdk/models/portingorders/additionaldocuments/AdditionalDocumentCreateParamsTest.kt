// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdditionalDocumentCreateParamsTest {

    @Test
    fun create() {
        AdditionalDocumentCreateParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addAdditionalDocument(
                AdditionalDocumentCreateParams.AdditionalDocument.builder()
                    .documentId("22771a52-c43a-4539-80db-9dd9ec36e237")
                    .documentType(
                        AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.LOA
                    )
                    .build()
            )
            .addAdditionalDocument(
                AdditionalDocumentCreateParams.AdditionalDocument.builder()
                    .documentId("d91474e6-4ebc-4ec1-b379-c596eeb405d6")
                    .documentType(
                        AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.INVOICE
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AdditionalDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AdditionalDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addAdditionalDocument(
                    AdditionalDocumentCreateParams.AdditionalDocument.builder()
                        .documentId("22771a52-c43a-4539-80db-9dd9ec36e237")
                        .documentType(
                            AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.LOA
                        )
                        .build()
                )
                .addAdditionalDocument(
                    AdditionalDocumentCreateParams.AdditionalDocument.builder()
                        .documentId("d91474e6-4ebc-4ec1-b379-c596eeb405d6")
                        .documentType(
                            AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.INVOICE
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.additionalDocuments().getOrNull())
            .containsExactly(
                AdditionalDocumentCreateParams.AdditionalDocument.builder()
                    .documentId("22771a52-c43a-4539-80db-9dd9ec36e237")
                    .documentType(
                        AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.LOA
                    )
                    .build(),
                AdditionalDocumentCreateParams.AdditionalDocument.builder()
                    .documentId("d91474e6-4ebc-4ec1-b379-c596eeb405d6")
                    .documentType(
                        AdditionalDocumentCreateParams.AdditionalDocument.DocumentType.INVOICE
                    )
                    .build(),
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AdditionalDocumentCreateParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val body = params._body()
    }
}
