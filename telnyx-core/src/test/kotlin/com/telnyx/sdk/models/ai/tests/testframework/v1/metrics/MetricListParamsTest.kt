// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricListParamsTest {

    @Test
    fun create() {
        MetricListParams.builder().agentId(0L).assistantId("assistant_id").build()
    }

    @Test
    fun queryParams() {
        val params = MetricListParams.builder().agentId(0L).assistantId("assistant_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("agent_id", "0")
                    .put("assistant_id", "assistant_id")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MetricListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
