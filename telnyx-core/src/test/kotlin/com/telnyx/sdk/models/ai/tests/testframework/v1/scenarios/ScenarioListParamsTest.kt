// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioListParamsTest {

    @Test
    fun create() {
        ScenarioListParams.builder()
            .agentId(0L)
            .assistantId("assistant_id")
            .page(1L)
            .pageSize(1L)
            .tags("tags")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ScenarioListParams.builder()
                .agentId(0L)
                .assistantId("assistant_id")
                .page(1L)
                .pageSize(1L)
                .tags("tags")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("agent_id", "0")
                    .put("assistant_id", "assistant_id")
                    .put("page", "1")
                    .put("page_size", "1")
                    .put("tags", "tags")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ScenarioListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
