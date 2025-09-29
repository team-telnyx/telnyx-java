// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.ai.assistants.tests

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class TestSuiteServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val testSuiteService = client.ai().assistants().tests().testSuites()

        val testSuites = testSuiteService.list()

        testSuites.validate()
    }
}
