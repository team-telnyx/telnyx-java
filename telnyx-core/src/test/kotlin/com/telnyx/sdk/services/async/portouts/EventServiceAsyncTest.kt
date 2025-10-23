// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.portouts

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portouts.events.EventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventServiceAsync = client.portouts().events()

        val eventFuture = eventServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val event = eventFuture.get()
        event.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventServiceAsync = client.portouts().events()

        val eventsFuture =
            eventServiceAsync.list(
                EventListParams.builder()
                    .filter(
                        EventListParams.Filter.builder()
                            .createdAt(
                                EventListParams.Filter.CreatedAt.builder()
                                    .gte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .lte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .build()
                            )
                            .eventType(EventListParams.Filter.EventType.PORTOUT_STATUS_CHANGED)
                            .portoutId("34dc46a9-53ed-4e01-9454-26227ea13326")
                            .build()
                    )
                    .page(EventListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val events = eventsFuture.get()
        events.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun republish() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventServiceAsync = client.portouts().events()

        val future = eventServiceAsync.republish("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val response = future.get()
    }
}
