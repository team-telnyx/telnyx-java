// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NoiseSuppressionEngineServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val noiseSuppressionEngineServiceAsync = client.noiseSuppressionEngines()

        val noiseSuppressionEnginesFuture = noiseSuppressionEngineServiceAsync.list()

        val noiseSuppressionEngines = noiseSuppressionEnginesFuture.get()
        noiseSuppressionEngines.validate()
    }
}
