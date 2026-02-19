// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunRetrieveParams
import com.telnyx.sdk.models.ai.assistants.tests.runs.RunTriggerParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RunServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().assistants().tests().runs()

        val testRunResponseFuture =
            runServiceAsync.retrieve(
                RunRetrieveParams.builder().testId("test_id").runId("run_id").build()
            )

        val testRunResponse = testRunResponseFuture.get()
        testRunResponse.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().assistants().tests().runs()

        val pageFuture = runServiceAsync.list("test_id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun trigger() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val runServiceAsync = client.ai().assistants().tests().runs()

        val testRunResponseFuture =
            runServiceAsync.trigger(
                RunTriggerParams.builder()
                    .testId("test_id")
                    .destinationVersionId("123e4567-e89b-12d3-a456-426614174000")
                    .build()
            )

        val testRunResponse = testRunResponseFuture.get()
        testRunResponse.validate()
    }
}
