// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.assistants.tests.testsuites

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val runService = client.ai().assistants().tests().testSuites().runs()

        val page = runService.list("suite_name")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun trigger() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
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
