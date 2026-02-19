// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.assistants.tests

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TestSuiteServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val testSuiteServiceAsync = client.ai().assistants().tests().testSuites()

        val testSuitesFuture = testSuiteServiceAsync.list()

        val testSuites = testSuitesFuture.get()
        testSuites.validate()
    }
}
