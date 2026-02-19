// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoomParticipantServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomParticipantService = client.roomParticipants()

        val roomParticipant =
            roomParticipantService.retrieve("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        roomParticipant.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomParticipantService = client.roomParticipants()

        val page = roomParticipantService.list()

        page.response().validate()
    }
}
