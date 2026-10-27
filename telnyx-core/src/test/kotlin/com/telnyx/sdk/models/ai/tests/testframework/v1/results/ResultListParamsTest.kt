// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.results

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ResultListParamsTest {

    @Test
    fun create() {
        ResultListParams.builder()
            .agentId(0L)
            .page(1L)
            .pageSize(1L)
            .scenarios("scenarios")
            .search("search")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ResultListParams.builder()
                .agentId(0L)
                .page(1L)
                .pageSize(1L)
                .scenarios("scenarios")
                .search("search")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("agent_id", "0")
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("scenarios", "scenarios")
                    .put("search", "search")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ResultListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
