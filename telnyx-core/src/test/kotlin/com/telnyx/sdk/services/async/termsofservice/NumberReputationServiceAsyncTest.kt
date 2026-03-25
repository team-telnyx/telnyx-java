// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.termsofservice

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberReputationServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun agree() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val numberReputationServiceAsync = client.termsOfService().numberReputation()

        val future = numberReputationServiceAsync.agree()

        val response = future.get()
    }
}
