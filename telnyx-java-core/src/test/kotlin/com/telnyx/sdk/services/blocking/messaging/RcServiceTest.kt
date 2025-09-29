// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.messaging

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaging.rcs.RcInviteTestNumberParams
import com.telnyx.sdk.models.messaging.rcs.RcListBulkCapabilitiesParams
import com.telnyx.sdk.models.messaging.rcs.RcRetrieveCapabilitiesParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RcServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun inviteTestNumber() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcService = client.messaging().rcs()

        val response =
            rcService.inviteTestNumber(
                RcInviteTestNumberParams.builder().id("id").phoneNumber("phone_number").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listBulkCapabilities() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcService = client.messaging().rcs()

        val response =
            rcService.listBulkCapabilities(
                RcListBulkCapabilitiesParams.builder()
                    .agentId("TestAgent")
                    .addPhoneNumber("+13125551234")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveCapabilities() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val rcService = client.messaging().rcs()

        val response =
            rcService.retrieveCapabilities(
                RcRetrieveCapabilitiesParams.builder()
                    .agentId("agent_id")
                    .phoneNumber("phone_number")
                    .build()
            )

        response.validate()
    }
}
