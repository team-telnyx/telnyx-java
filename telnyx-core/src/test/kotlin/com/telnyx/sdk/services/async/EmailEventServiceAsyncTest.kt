// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.emailevents.EmailEventListParams
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailEventServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailEventServiceAsync = client.emailEvents()

        val emailEventsFuture =
            emailEventServiceAsync.list(
                EmailEventListParams.builder()
                    .emailId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .eventType("string")
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .pageCursor("page_cursor")
                    .pageSize(1L)
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val emailEvents = emailEventsFuture.get()
        emailEvents.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStats() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val emailEventServiceAsync = client.emailEvents()

        val responseFuture =
            emailEventServiceAsync.retrieveStats(
                EmailEventRetrieveStatsParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
