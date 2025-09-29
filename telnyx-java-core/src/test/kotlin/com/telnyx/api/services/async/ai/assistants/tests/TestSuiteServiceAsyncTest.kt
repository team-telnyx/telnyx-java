// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.ai.assistants.tests

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestSuiteServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testSuiteServiceAsync = client.ai().assistants().tests().testSuites()

        val testSuitesFuture = testSuiteServiceAsync.list()

        val testSuites = testSuitesFuture.get()
        testSuites.validate()
    }
}
