// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging10dlc.campaign

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OsrServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun getAttributes() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val osrService = client.messaging10dlc().campaign().osr()

        val response = osrService.getAttributes("campaignId")

        response.validate()
    }
}
