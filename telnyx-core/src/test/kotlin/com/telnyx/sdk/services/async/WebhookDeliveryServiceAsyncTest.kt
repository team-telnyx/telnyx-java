// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookDeliveryServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookDeliveryServiceAsync = client.webhookDeliveries()

        val webhookDeliveryFuture =
            webhookDeliveryServiceAsync.retrieve("C9C0797E-901D-4349-A33C-C2C8F31A92C2")

        val webhookDelivery = webhookDeliveryFuture.get()
        webhookDelivery.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val webhookDeliveryServiceAsync = client.webhookDeliveries()

        val pageFuture = webhookDeliveryServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
