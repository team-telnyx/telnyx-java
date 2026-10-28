// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricRetrieveGenerateMetricsProgressResponseTest {

    @Test
    fun create() {
        val metricRetrieveGenerateMetricsProgressResponse =
            MetricRetrieveGenerateMetricsProgressResponse.builder()
                .agentId(1259L)
                .currentStep("Completed")
                .error(null)
                .addMetric(
                    MetricRetrieveGenerateMetricsProgressResponse.Metric.builder()
                        .agent(1259L)
                        .description("Checks whether the assistant greets the caller.")
                        .evalType("continuous_qualitative")
                        .name("Greeting quality")
                        .addScenario(0L)
                        .build()
                )
                .status(MetricRetrieveGenerateMetricsProgressResponse.Status.COMPLETED)
                .build()

        assertThat(metricRetrieveGenerateMetricsProgressResponse.agentId()).isEqualTo(1259L)
        assertThat(metricRetrieveGenerateMetricsProgressResponse.currentStep())
            .isEqualTo("Completed")
        assertThat(metricRetrieveGenerateMetricsProgressResponse.error()).isEmpty
        assertThat(metricRetrieveGenerateMetricsProgressResponse.metrics())
            .containsExactly(
                MetricRetrieveGenerateMetricsProgressResponse.Metric.builder()
                    .agent(1259L)
                    .description("Checks whether the assistant greets the caller.")
                    .evalType("continuous_qualitative")
                    .name("Greeting quality")
                    .addScenario(0L)
                    .build()
            )
        assertThat(metricRetrieveGenerateMetricsProgressResponse.status())
            .isEqualTo(MetricRetrieveGenerateMetricsProgressResponse.Status.COMPLETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val metricRetrieveGenerateMetricsProgressResponse =
            MetricRetrieveGenerateMetricsProgressResponse.builder()
                .agentId(1259L)
                .currentStep("Completed")
                .error(null)
                .addMetric(
                    MetricRetrieveGenerateMetricsProgressResponse.Metric.builder()
                        .agent(1259L)
                        .description("Checks whether the assistant greets the caller.")
                        .evalType("continuous_qualitative")
                        .name("Greeting quality")
                        .addScenario(0L)
                        .build()
                )
                .status(MetricRetrieveGenerateMetricsProgressResponse.Status.COMPLETED)
                .build()

        val roundtrippedMetricRetrieveGenerateMetricsProgressResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(metricRetrieveGenerateMetricsProgressResponse),
                jacksonTypeRef<MetricRetrieveGenerateMetricsProgressResponse>(),
            )

        assertThat(roundtrippedMetricRetrieveGenerateMetricsProgressResponse)
            .isEqualTo(metricRetrieveGenerateMetricsProgressResponse)
    }
}
