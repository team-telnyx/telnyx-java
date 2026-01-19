// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.mcpservers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class McpServerListParamsTest {

    @Test
    fun create() {
        McpServerListParams.builder().pageNumber(1L).pageSize(1L).type("type").url("url").build()
    }

    @Test
    fun queryParams() {
        val params =
            McpServerListParams.builder()
                .pageNumber(1L)
                .pageSize(1L)
                .type("type")
                .url("url")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("type", "type")
                    .put("url", "url")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = McpServerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
