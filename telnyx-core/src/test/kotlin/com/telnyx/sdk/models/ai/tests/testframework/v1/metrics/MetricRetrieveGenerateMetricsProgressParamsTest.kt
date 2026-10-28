// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricRetrieveGenerateMetricsProgressParamsTest {

    @Test
    fun create() {
        MetricRetrieveGenerateMetricsProgressParams.builder().progressId("progress_id").build()
    }

    @Test
    fun queryParams() {
        val params =
            MetricRetrieveGenerateMetricsProgressParams.builder().progressId("progress_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("progress_id", "progress_id").build())
    }
}
