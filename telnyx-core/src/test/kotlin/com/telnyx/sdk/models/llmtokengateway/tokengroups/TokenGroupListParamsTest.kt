// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.llmtokengateway.tokengroups

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TokenGroupListParamsTest {

    @Test
    fun create() {
        TokenGroupListParams.builder()
            .pageNumber(1L)
            .pageSize(1L)
            .pageSnapshot("page[snapshot]")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TokenGroupListParams.builder()
                .pageNumber(1L)
                .pageSize(1L)
                .pageSnapshot("page[snapshot]")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("page[snapshot]", "page[snapshot]")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TokenGroupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
