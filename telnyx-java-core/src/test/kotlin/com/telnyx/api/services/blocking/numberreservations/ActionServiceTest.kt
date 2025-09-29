// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.numberreservations

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class ActionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun extend() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val actionService = client.numberReservations().actions()

        val response = actionService.extend("number_reservation_id")

        response.validate()
    }
}
