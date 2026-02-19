// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.porting

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.porting().events()

        val eventFuture = eventServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val event = eventFuture.get()
        event.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.porting().events()

        val pageFuture = eventServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun republish() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val eventServiceAsync = client.porting().events()

        val future = eventServiceAsync.republish("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
