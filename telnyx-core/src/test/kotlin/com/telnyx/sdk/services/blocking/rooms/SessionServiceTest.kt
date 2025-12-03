// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.rooms

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val session =
            sessionService.retrieve(
                SessionRetrieveParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .includeParticipants(true)
                    .build()
            )

        session.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list0() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val page = sessionService.list0()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list1() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val page = sessionService.list1("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionService = client.rooms().sessions()

        val page = sessionService.retrieveParticipants("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        page.response().validate()
    }
}
