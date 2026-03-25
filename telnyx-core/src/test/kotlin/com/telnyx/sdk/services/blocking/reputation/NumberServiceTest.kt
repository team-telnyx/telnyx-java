// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.reputation

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.reputation.numbers.NumberRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.reputation().numbers()

        val number =
            numberService.retrieve(
                NumberRetrieveParams.builder().phoneNumber("+16035551234").fresh(true).build()
            )

        number.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.reputation().numbers()

        val page = numberService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val numberService = client.reputation().numbers()

        numberService.delete("+16035551234")
    }
}
