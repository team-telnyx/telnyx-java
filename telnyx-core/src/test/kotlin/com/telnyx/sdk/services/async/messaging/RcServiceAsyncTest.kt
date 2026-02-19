// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.messaging

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RcServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun inviteTestNumber() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
