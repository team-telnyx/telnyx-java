// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.notificationevents.NotificationEventListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NotificationEventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val notificationEventServiceAsync = client.notificationEvents()

        val notificationEventsFuture =
            notificationEventServiceAsync.list(
                NotificationEventListParams.builder()
                    .page(NotificationEventListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val notificationEvents = notificationEventsFuture.get()
        notificationEvents.validate()
    }
}
