// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.async

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.api.models.networks.InterfaceStatus
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.api.models.publicinternetgateways.PublicInternetGatewayListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PublicInternetGatewayServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
                    .regionCode("ashburn-va")
                    .publicIp("127.0.0.1")
                    .build()
            )

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewayFuture =
            publicInternetGatewayServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewaysFuture =
            publicInternetGatewayServiceAsync.list(
                PublicInternetGatewayListParams.builder()
                    .filter(
                        PublicInternetGatewayListParams.Filter.builder()
                            .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .build()
                    )
                    .page(
                        PublicInternetGatewayListParams.Page.builder().number(1L).size(1L).build()
                    )
                    .build()
            )

        val publicInternetGateways = publicInternetGatewaysFuture.get()
        publicInternetGateways.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayServiceAsync = client.publicInternetGateways()

        val publicInternetGatewayFuture =
            publicInternetGatewayServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val publicInternetGateway = publicInternetGatewayFuture.get()
        publicInternetGateway.validate()
    }
}
