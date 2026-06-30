// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.documentlinks

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DocumentLinkListParamsTest {

    @Test
    fun create() {
        DocumentLinkListParams.builder()
            .filter(
                DocumentLinkListParams.Filter.builder()
                    .linkedRecordType("porting_order")
                    .linkedResourceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DocumentLinkListParams.builder()
                .filter(
                    DocumentLinkListParams.Filter.builder()
                        .linkedRecordType("porting_order")
                        .linkedResourceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[linked_record_type]", "porting_order")
                    .put("filter[linked_resource_id]", "6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DocumentLinkListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
