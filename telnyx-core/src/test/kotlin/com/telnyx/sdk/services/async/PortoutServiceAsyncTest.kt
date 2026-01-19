// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.portouts.PortoutListRejectionCodesParams
import com.telnyx.sdk.models.portouts.PortoutUpdateStatusParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PortoutServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val portoutFuture = portoutServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

        val portout = portoutFuture.get()
        portout.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val pageFuture = portoutServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listRejectionCodes() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val responseFuture =
            portoutServiceAsync.listRejectionCodes(
                PortoutListRejectionCodesParams.builder()
                    .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                    .filter(PortoutListRejectionCodesParams.Filter.builder().code(1002L).build())
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val portoutServiceAsync = client.portouts()

        val responseFuture =
            portoutServiceAsync.updateStatus(
                PortoutUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .status(PortoutUpdateStatusParams.Status.AUTHORIZED)
                    .reason("I do not recognize this transaction")
                    .hostMessaging(false)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
