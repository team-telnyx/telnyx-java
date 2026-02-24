// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardOrderServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val simCardOrderFuture =
            simCardOrderServiceAsync.create(
                SimCardOrderCreateParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(23L)
                    .build()
            )

        val simCardOrder = simCardOrderFuture.get()
        simCardOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val simCardOrderFuture =
            simCardOrderServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val simCardOrder = simCardOrderFuture.get()
        simCardOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val simCardOrderServiceAsync = client.simCardOrders()

        val pageFuture = simCardOrderServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
