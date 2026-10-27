// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.testframework

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePersonalities() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val v1Service = client.ai().tests().testFramework().v1()

        val response = v1Service.retrievePersonalities()

        response.forEach { it.validate() }
    }
}
