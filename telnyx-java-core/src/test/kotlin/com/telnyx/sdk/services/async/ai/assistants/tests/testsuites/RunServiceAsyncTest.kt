// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests.testsuites

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.RunTriggerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().assistants().tests().testSuites().runs()

        val pageFuture = runServiceAsync.list("suite_name")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun trigger() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().assistants().tests().testSuites().runs()

        val testRunResponsesFuture =
            runServiceAsync.trigger(
                RunTriggerParams.builder()
                    .suiteName("suite_name")
                    .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
                    .build()
            )

        val testRunResponses = testRunResponsesFuture.get()
        testRunResponses.forEach { it.validate() }
    }
}
