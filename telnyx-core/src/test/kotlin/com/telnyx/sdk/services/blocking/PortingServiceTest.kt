// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listUkCarriers() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portingService = client.porting()

        val response = portingService.listUkCarriers()

        response.validate()
    }
}
