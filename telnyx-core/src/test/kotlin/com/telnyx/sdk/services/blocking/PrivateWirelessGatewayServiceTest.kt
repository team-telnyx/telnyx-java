// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.privatewirelessgateways.PrivateWirelessGatewayCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PrivateWirelessGatewayServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateWirelessGatewayService = client.privateWirelessGateways()

        val privateWirelessGateway =
            privateWirelessGatewayService.create(
                PrivateWirelessGatewayCreateParams.builder()
                    .name("My private wireless gateway")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .regionCode("dc2")
                    .build()
            )

        privateWirelessGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateWirelessGatewayService = client.privateWirelessGateways()

        val privateWirelessGateway =
            privateWirelessGatewayService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        privateWirelessGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateWirelessGatewayService = client.privateWirelessGateways()

        val page = privateWirelessGatewayService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val privateWirelessGatewayService = client.privateWirelessGateways()

        val privateWirelessGateway =
            privateWirelessGatewayService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        privateWirelessGateway.validate()
    }
}
