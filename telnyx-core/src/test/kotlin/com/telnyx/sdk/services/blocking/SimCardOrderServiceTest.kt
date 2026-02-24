// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.simcardorders.SimCardOrderCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SimCardOrderServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardOrderService = client.simCardOrders()

        val simCardOrder =
            simCardOrderService.create(
                SimCardOrderCreateParams.builder()
                    .addressId("1293384261075731499")
                    .quantity(23L)
                    .build()
            )

        simCardOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardOrderService = client.simCardOrders()

        val simCardOrder = simCardOrderService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        simCardOrder.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val simCardOrderService = client.simCardOrders()

        val page = simCardOrderService.list()

        page.response().validate()
    }
}
