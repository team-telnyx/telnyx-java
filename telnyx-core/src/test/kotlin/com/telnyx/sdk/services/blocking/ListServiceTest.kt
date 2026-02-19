// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ListServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.list()

        val response = listService.retrieveAll()

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveByZone() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val listService = client.list()

        val response = listService.retrieveByZone("channel_zone_id")

        response.validate()
    }
}
