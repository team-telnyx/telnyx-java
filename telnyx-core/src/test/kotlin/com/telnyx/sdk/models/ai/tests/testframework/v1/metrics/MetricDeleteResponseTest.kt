// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricDeleteResponseTest {

    @Test
    fun create() {
        val metricDeleteResponse = MetricDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricDeleteResponse = MetricDeleteResponse.builder().build()

        val roundtrippedMetricDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricDeleteResponse),
                jacksonTypeRef<MetricDeleteResponse>(),
            )

        assertThat(roundtrippedMetricDeleteResponse).isEqualTo(metricDeleteResponse)
    }
}
