// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class OtaUpdateServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val otaUpdateServiceAsync = client.otaUpdates()

        val otaUpdateFuture = otaUpdateServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val otaUpdate = otaUpdateFuture.get()
        otaUpdate.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val otaUpdateServiceAsync = client.otaUpdates()

        val pageFuture = otaUpdateServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
