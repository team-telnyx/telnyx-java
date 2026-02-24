// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val privateWirelessGatewayServiceAsync = client.privateWirelessGateways()

        val privateWirelessGatewayFuture =
            privateWirelessGatewayServiceAsync.create(
                PrivateWirelessGatewayCreateParams.builder()
                    .name("My private wireless gateway")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .regionCode("dc2")
                    .build()
            )

        val privateWirelessGateway = privateWirelessGatewayFuture.get()
        privateWirelessGateway.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val privateWirelessGatewayServiceAsync = client.privateWirelessGateways()

        val privateWirelessGatewayFuture =
            privateWirelessGatewayServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val privateWirelessGateway = privateWirelessGatewayFuture.get()
        privateWirelessGateway.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val privateWirelessGatewayServiceAsync = client.privateWirelessGateways()

        val pageFuture = privateWirelessGatewayServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val privateWirelessGatewayServiceAsync = client.privateWirelessGateways()

        val privateWirelessGatewayFuture =
            privateWirelessGatewayServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val privateWirelessGateway = privateWirelessGatewayFuture.get()
        privateWirelessGateway.validate()
    }
}
