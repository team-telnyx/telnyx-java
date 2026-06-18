// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.portouts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.portouts().events()

        val event = eventService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        event.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.portouts().events()

        val page = eventService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun republish() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val eventService = client.portouts().events()

        eventService.republish("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
