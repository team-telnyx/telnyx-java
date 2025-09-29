// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.porting

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.porting.events.EventListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EventServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.porting().events()

        val event = eventService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        event.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.porting().events()

        val events =
            eventService.list(
                EventListParams.builder()
                    .filter(
                        EventListParams.Filter.builder()
                            .createdAt(
                                EventListParams.Filter.CreatedAt.builder()
                                    .gte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .lte(OffsetDateTime.parse("2021-01-01T00:00:00Z"))
                                    .build()
                            )
                            .portingOrderId("34dc46a9-53ed-4e01-9454-26227ea13326")
                            .type(EventListParams.Filter.Type.PORTING_ORDER_DELETED)
                            .build()
                    )
                    .page(EventListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        events.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun republish() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val eventService = client.porting().events()

        eventService.republish("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
    }
}
