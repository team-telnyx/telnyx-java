// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.CreateAiTestMetricRequest
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricGenerateMetricsParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricListParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricRetrieveGenerateMetricsProgressParams
import com.telnyx.sdk.models.ai.tests.testframework.v1.metrics.MetricUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MetricServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val aiTestMetric =
            metricService.create(
                CreateAiTestMetricRequest.builder()
                    .name("Escalates on refund denial")
                    .addToNewAgents(false)
                    .addAgent(1259L)
                    .assistantId("assistant_id")
                    .audioEnabled(true)
                    .description(
                        "Returns a score for whether the assistant escalates when the caller's refund is denied."
                    )
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("continuous_qualitative")
                    .observabilityEnabled(true)
                    .prompt("Score the assistant's escalation behaviour between 0.0 and 1.0.")
                    .samplingEnabled(true)
                    .simulationEnabled(true)
                    .type("llm_judge")
                    .build()
            )

        aiTestMetric.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val aiTestMetric = metricService.retrieve(0L)

        aiTestMetric.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val aiTestMetric =
            metricService.update(
                MetricUpdateParams.builder()
                    .id(0L)
                    .addToNewAgents(true)
                    .addAgent(0L)
                    .audioEnabled(true)
                    .description("description")
                    .displayOrder(0L)
                    .addEnumValue("string")
                    .evalType("eval_type")
                    .name("Escalates on refund denial")
                    .observabilityEnabled(true)
                    .prompt(
                        "Score the assistant's escalation behaviour between 0.0 and 1.0, considering tone."
                    )
                    .samplingEnabled(true)
                    .simulationEnabled(true)
                    .type("type")
                    .build()
            )

        aiTestMetric.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val aiTestMetrics =
            metricService.list(
                MetricListParams.builder().agentId(0L).assistantId("assistant_id").build()
            )

        aiTestMetrics.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val metric = metricService.delete(0L)

        metric.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun bulkCreate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val aiTestMetrics =
            metricService.bulkCreate(
                listOf(
                    CreateAiTestMetricRequest.builder()
                        .name("Greets within 5 seconds")
                        .addToNewAgents(false)
                        .addAgent(1259L)
                        .assistantId("assistant_id")
                        .audioEnabled(true)
                        .description(
                            "Returns whether the assistant greeted the caller within five seconds."
                        )
                        .displayOrder(0L)
                        .addEnumValue("string")
                        .evalType("continuous_qualitative")
                        .observabilityEnabled(true)
                        .prompt("Score whether the greeting was timely and natural.")
                        .samplingEnabled(true)
                        .simulationEnabled(true)
                        .type("llm_judge")
                        .build()
                )
            )

        aiTestMetrics.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun generateMetrics() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val scenarioGenerationResponse =
            metricService.generateMetrics(
                MetricGenerateMetricsParams.builder()
                    .agentId(1259L)
                    .numMetrics(5L)
                    .addScenario(9512L)
                    .build()
            )

        scenarioGenerationResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveGenerateMetricsProgress() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val metricService = client.ai().tests().testFramework().v1().metrics()

        val response =
            metricService.retrieveGenerateMetricsProgress(
                MetricRetrieveGenerateMetricsProgressParams.builder()
                    .progressId("progress_id")
                    .build()
            )

        response.validate()
    }
}
