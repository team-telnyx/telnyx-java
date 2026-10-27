// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resultServiceAsync = client.ai().tests().testFramework().v1().results()

        val testRunResultFuture = resultServiceAsync.retrieve(0L)

        val testRunResult = testRunResultFuture.get()
        testRunResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resultServiceAsync = client.ai().tests().testFramework().v1().results()

        val resultsFuture =
            resultServiceAsync.list(
                ResultListParams.builder()
                    .agentId(0L)
                    .page(1L)
                    .pageSize(1L)
                    .scenarios("scenarios")
                    .search("search")
                    .build()
            )

        val results = resultsFuture.get()
        results.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resultServiceAsync = client.ai().tests().testFramework().v1().results()

        val resultFuture = resultServiceAsync.delete(0L)

        val result = resultFuture.get()
        result.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerun() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val resultServiceAsync = client.ai().tests().testFramework().v1().results()

        val testRunResultFuture = resultServiceAsync.rerun(0L)

        val testRunResult = testRunResultFuture.get()
        testRunResult.validate()
    }
}
