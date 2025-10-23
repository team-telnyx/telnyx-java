// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.additionaldocuments

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AdditionalDocumentListParamsTest {

    @Test
    fun create() {
        AdditionalDocumentListParams.builder()
            .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter(
                AdditionalDocumentListParams.Filter.builder()
                    .addDocumentType(AdditionalDocumentListParams.Filter.DocumentType.LOA)
                    .build()
            )
            .page(AdditionalDocumentListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                AdditionalDocumentListParams.Sort.builder()
                    .value(AdditionalDocumentListParams.Sort.Value_.CREATED_AT)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AdditionalDocumentListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AdditionalDocumentListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(
                    AdditionalDocumentListParams.Filter.builder()
                        .addDocumentType(AdditionalDocumentListParams.Filter.DocumentType.LOA)
                        .build()
                )
                .page(AdditionalDocumentListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    AdditionalDocumentListParams.Sort.builder()
                        .value(AdditionalDocumentListParams.Sort.Value_.CREATED_AT)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[document_type]", listOf("loa").joinToString(","))
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AdditionalDocumentListParams.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
