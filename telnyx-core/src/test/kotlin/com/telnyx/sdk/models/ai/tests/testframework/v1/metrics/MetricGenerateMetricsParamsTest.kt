// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.metrics

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MetricGenerateMetricsParamsTest {

    @Test
    fun create() {
        MetricGenerateMetricsParams.builder()
            .agentId(1259L)
            .numMetrics(5L)
            .addScenario(9512L)
            .build()
    }

    @Test
    fun body() {
        val params =
            MetricGenerateMetricsParams.builder()
                .agentId(1259L)
                .numMetrics(5L)
                .addScenario(9512L)
                .build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo(1259L)
        assertThat(body.numMetrics()).isEqualTo(5L)
        assertThat(body.scenarios().getOrNull()).containsExactly(9512L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MetricGenerateMetricsParams.builder().agentId(1259L).numMetrics(5L).build()

        val body = params._body()

        assertThat(body.agentId()).isEqualTo(1259L)
        assertThat(body.numMetrics()).isEqualTo(5L)
    }
}
