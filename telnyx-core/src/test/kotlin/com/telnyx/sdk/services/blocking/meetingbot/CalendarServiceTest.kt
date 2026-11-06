// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.meetingbot

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.meetingbot.calendar.CalendarRetrieveOAuthCallbackParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CalendarServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveOAuthCallback() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val calendarService = client.meetingBot().calendar()

        calendarService.retrieveOAuthCallback(
            CalendarRetrieveOAuthCallbackParams.builder()
                .code("code")
                .error("error")
                .state("state")
                .build()
        )
    }
}
