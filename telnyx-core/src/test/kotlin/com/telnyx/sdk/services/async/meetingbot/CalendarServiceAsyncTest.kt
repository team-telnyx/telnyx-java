// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.meetingbot

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.meetingbot.calendar.CalendarRetrieveOAuthCallbackParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveOAuthCallback() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val calendarServiceAsync = client.meetingBot().calendar()

        val responseFuture =
            calendarServiceAsync.retrieveOAuthCallback(
                CalendarRetrieveOAuthCallbackParams.builder()
                    .code("code")
                    .error("error")
                    .state("state")
                    .build()
            )

        val response = responseFuture.get()
    }
}
