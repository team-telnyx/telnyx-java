// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NoiseSuppressionEngineServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val noiseSuppressionEngineService = client.noiseSuppressionEngines()

        val noiseSuppressionEngines = noiseSuppressionEngineService.list()

        noiseSuppressionEngines.validate()
    }
}
