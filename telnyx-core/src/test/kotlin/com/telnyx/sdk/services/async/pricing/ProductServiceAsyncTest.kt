// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.pricing

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProductServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.pricing().products()

        val pageFuture = productServiceAsync.retrieve("slug")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val productServiceAsync = client.pricing().products()

        val pageFuture = productServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
