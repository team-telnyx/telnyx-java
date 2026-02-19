// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WebhookDeliveryServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookDeliveryService = client.webhookDeliveries()

        val webhookDelivery =
            webhookDeliveryService.retrieve("C9C0797E-901D-4349-A33C-C2C8F31A92C2")

        webhookDelivery.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val webhookDeliveryService = client.webhookDeliveries()

        val page = webhookDeliveryService.list()

        page.response().validate()
    }
}
