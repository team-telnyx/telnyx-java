// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.templates

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TemplateListParamsTest {

    @Test
    fun create() {
        TemplateListParams.builder()
            .filterCategory(TemplateListParams.FilterCategory.MARKETING)
            .filterSearch("filter[search]")
            .filterStatus("filter[status]")
            .filterWabaId("filter[waba_id]")
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TemplateListParams.builder()
                .filterCategory(TemplateListParams.FilterCategory.MARKETING)
                .filterSearch("filter[search]")
                .filterStatus("filter[status]")
                .filterWabaId("filter[waba_id]")
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[category]", "MARKETING")
                    .put("filter[search]", "filter[search]")
                    .put("filter[status]", "filter[status]")
                    .put("filter[waba_id]", "filter[waba_id]")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TemplateListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
