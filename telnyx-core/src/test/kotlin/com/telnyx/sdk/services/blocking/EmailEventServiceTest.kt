// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.emailevents.EmailEventRetrieveStatsParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class EmailEventServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailEventService = client.emailEvents()

        val page = emailEventService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveStats() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val emailEventService = client.emailEvents()

        val response =
            emailEventService.retrieveStats(
                EmailEventRetrieveStatsParams.builder()
                    .from(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .to(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        response.validate()
    }
}
