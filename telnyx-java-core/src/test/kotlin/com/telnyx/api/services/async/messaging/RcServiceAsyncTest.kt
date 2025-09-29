// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async.messaging

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.api.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.api.models.messaging.rcs.RcRetrieveCapabilitiesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RcServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun inviteTestNumber() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcServiceAsync = client.messaging().rcs()

        val responseFuture =
            rcServiceAsync.inviteTestNumber(
                RcInviteTestNumberParams.builder().id("id").phoneNumber("phone_number").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBulkCapabilities() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcServiceAsync = client.messaging().rcs()

        val responseFuture =
            rcServiceAsync.listBulkCapabilities(
                RcListBulkCapabilitiesParams.builder()
                    .agentId("TestAgent")
                    .addPhoneNumber("+13125551234")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCapabilities() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcServiceAsync = client.messaging().rcs()

        val responseFuture =
            rcServiceAsync.retrieveCapabilities(
                RcRetrieveCapabilitiesParams.builder()
                    .agentId("agent_id")
                    .phoneNumber("phone_number")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
