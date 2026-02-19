// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class GlobalIpHealthCheckTypeServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val globalIpHealthCheckTypeService = client.globalIpHealthCheckTypes()

        val globalIpHealthCheckTypes = globalIpHealthCheckTypeService.list()

        globalIpHealthCheckTypes.validate()
    }
}
