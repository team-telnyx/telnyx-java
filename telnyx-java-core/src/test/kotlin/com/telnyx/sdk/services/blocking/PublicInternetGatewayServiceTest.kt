// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayCreateParams
import com.telnyx.sdk.models.publicinternetgateways.PublicInternetGatewayListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PublicInternetGatewayServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayService = client.publicInternetGateways()

        val publicInternetGateway =
            publicInternetGatewayService.create(
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

        publicInternetGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayService = client.publicInternetGateways()

        val publicInternetGateway =
            publicInternetGatewayService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        publicInternetGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayService = client.publicInternetGateways()

        val publicInternetGateways =
            publicInternetGatewayService.list(
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

        publicInternetGateways.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val publicInternetGatewayService = client.publicInternetGateways()

        val publicInternetGateway =
            publicInternetGatewayService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        publicInternetGateway.validate()
    }
}
