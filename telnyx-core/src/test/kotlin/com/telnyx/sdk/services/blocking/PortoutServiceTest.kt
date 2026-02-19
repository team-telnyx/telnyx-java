// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PortoutServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portoutService = client.portouts()

        val portout = portoutService.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        portout.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portoutService = client.portouts()

        val page = portoutService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRejectionCodes() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portoutService = client.portouts()

        val response =
            portoutService.listRejectionCodes(
                PortoutListRejectionCodesParams.builder()
                    .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                    .filter(PortoutListRejectionCodesParams.Filter.builder().code(1002L).build())
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStatus() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val portoutService = client.portouts()

        val response =
            portoutService.updateStatus(
                PortoutUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                    .reason("I do not recognize this transaction")
                    .hostMessaging(false)
                    .build()
            )

        response.validate()
    }
}
