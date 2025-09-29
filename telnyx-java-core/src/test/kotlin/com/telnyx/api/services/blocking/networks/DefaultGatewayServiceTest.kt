// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.networks

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.networks.InterfaceStatus
import com.telnyx.api.models.networks.defaultgateway.DefaultGatewayCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DefaultGatewayServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val defaultGatewayService = client.networks().defaultGateway()

        val defaultGateway =
            defaultGatewayService.create(
                DefaultGatewayCreateParams.builder()
                    .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )

        defaultGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val defaultGatewayService = client.networks().defaultGateway()

        val defaultGateway = defaultGatewayService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        defaultGateway.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val defaultGatewayService = client.networks().defaultGateway()

        val defaultGateway = defaultGatewayService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        defaultGateway.validate()
    }
}
