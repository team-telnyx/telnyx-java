// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants.tests.testsuites

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.RunListParams
import com.telnyx.api.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RunServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.ai().assistants().tests().testSuites().runs()

        val paginatedTestRunList =
            runService.list(
                RunListParams.builder()
                    .suiteName("suite_name")
                    .page(RunListParams.Page.builder().number(1L).size(1L).build())
                    .status("status")
                    .testSuiteRunId("test_suite_run_id")
                    .build()
            )

        paginatedTestRunList.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun trigger() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val runService = client.ai().assistants().tests().testSuites().runs()

        val testRunResponses =
            runService.trigger(
                RunTriggerParams.builder()
                    .suiteName("suite_name")
                    .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
                    .build()
            )

        testRunResponses.forEach { it.validate() }
    }
}
