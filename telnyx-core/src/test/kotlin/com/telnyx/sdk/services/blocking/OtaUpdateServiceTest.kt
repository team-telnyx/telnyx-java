// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OtaUpdateServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val otaUpdateService = client.otaUpdates()

        val otaUpdate = otaUpdateService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        otaUpdate.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val otaUpdateService = client.otaUpdates()

        val page = otaUpdateService.list()

        page.response().validate()
    }
}
