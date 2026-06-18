// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListParamsTest {

    @Test
    fun create() {
        ToolListParams.builder()
            .filterName("filter[name]")
            .filterType("filter[type]")
            .pageNumber(1L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ToolListParams.builder()
                .filterName("filter[name]")
                .filterType("filter[type]")
                .pageNumber(1L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "filter[name]")
                    .put("filter[type]", "filter[type]")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ToolListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
