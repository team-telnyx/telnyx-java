// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.rooms

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.rooms.sessions.SessionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SessionServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.rooms().sessions()

        val sessionFuture =
            sessionServiceAsync.retrieve(
                SessionRetrieveParams.builder()
                    .roomSessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .includeParticipants(true)
                    .build()
            )

        val session = sessionFuture.get()
        session.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list0() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.rooms().sessions()

        val pageFuture = sessionServiceAsync.list0()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list1() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.rooms().sessions()

        val pageFuture = sessionServiceAsync.list1("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveParticipants() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val sessionServiceAsync = client.rooms().sessions()

        val pageFuture =
            sessionServiceAsync.retrieveParticipants("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val page = pageFuture.get()
        page.response().validate()
    }
}
