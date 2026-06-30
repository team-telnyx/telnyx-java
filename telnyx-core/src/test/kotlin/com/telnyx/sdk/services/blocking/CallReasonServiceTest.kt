// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallReasonServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callReasonService = client.callReasons()

        val page = callReasonService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun validate() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callReasonService = client.callReasons()

        val response =
            callReasonService.validate(listOf("Appointment reminders", "Billing inquiries"))

        response.validate()
    }
}
