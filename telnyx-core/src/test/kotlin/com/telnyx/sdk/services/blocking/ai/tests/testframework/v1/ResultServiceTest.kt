// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.tests.testframework.v1.results.ResultListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ResultServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val resultService = client.ai().tests().testFramework().v1().results()

        val testRunResult = resultService.retrieve(0L)

        testRunResult.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val resultService = client.ai().tests().testFramework().v1().results()

        val results =
            resultService.list(
                ResultListParams.builder()
                    .agentId(0L)
                    .page(1L)
                    .pageSize(1L)
                    .scenarios("scenarios")
                    .search("search")
                    .build()
            )

        results.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val resultService = client.ai().tests().testFramework().v1().results()

        val result = resultService.delete(0L)

        result.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun rerun() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val resultService = client.ai().tests().testFramework().v1().results()

        val testRunResult = resultService.rerun(0L)

        testRunResult.validate()
    }
}
