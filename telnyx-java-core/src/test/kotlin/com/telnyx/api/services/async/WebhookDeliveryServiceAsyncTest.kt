// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.webhookdeliveries.WebhookDeliveryListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WebhookDeliveryServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookDeliveryServiceAsync = client.webhookDeliveries()

        val webhookDeliveryFuture =
            webhookDeliveryServiceAsync.retrieve("C9C0797E-901D-4349-A33C-C2C8F31A92C2")

        val webhookDelivery = webhookDeliveryFuture.get()
        webhookDelivery.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val webhookDeliveryServiceAsync = client.webhookDeliveries()

        val webhookDeliveriesFuture =
            webhookDeliveryServiceAsync.list(
                WebhookDeliveryListParams.builder()
                    .filter(
                        WebhookDeliveryListParams.Filter.builder()
                            .attempts(
                                WebhookDeliveryListParams.Filter.Attempts.builder()
                                    .contains("https://fallback.example.com/webhooks")
                                    .build()
                            )
                            .eventType("call_initiated,call.initiated")
                            .finishedAt(
                                WebhookDeliveryListParams.Filter.FinishedAt.builder()
                                    .gte("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .startedAt(
                                WebhookDeliveryListParams.Filter.StartedAt.builder()
                                    .gte("2019-03-29T11:10:00Z")
                                    .lte("2019-03-29T11:10:00Z")
                                    .build()
                            )
                            .status(
                                WebhookDeliveryListParams.Filter.Status.builder()
                                    .eq(WebhookDeliveryListParams.Filter.Status.Eq.DELIVERED)
                                    .build()
                            )
                            .webhook(
                                WebhookDeliveryListParams.Filter.Webhook.builder()
                                    .contains("call.initiated")
                                    .build()
                            )
                            .build()
                    )
                    .page(WebhookDeliveryListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val webhookDeliveries = webhookDeliveriesFuture.get()
        webhookDeliveries.validate()
    }
}
