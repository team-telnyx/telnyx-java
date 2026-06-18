// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewayFuture =
            publicInternetGatewayServiceAsync.create(
                PublicInternetGatewayCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .publicIp("127.0.0.1")
                    .regionCode("ashburn-va")
                    .build()
            )

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewayFuture =
            publicInternetGatewayServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val pageFuture = publicInternetGatewayServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewayFuture =
            publicInternetGatewayServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }
}
