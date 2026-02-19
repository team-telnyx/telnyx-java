// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.networks.InterfaceStatus
import com.telnyx.sdk.models.wireguardinterfaces.WireguardInterfaceCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WireguardInterfaceServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardInterfaceService = client.wireguardInterfaces()

        val wireguardInterface =
            wireguardInterfaceService.create(
                WireguardInterfaceCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .regionCode("ashburn-va")
                    .enableSipTrunking(false)
                    .endpoint("203.0.113.0:51871")
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .build()
            )

        wireguardInterface.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardInterfaceService = client.wireguardInterfaces()

        val wireguardInterface =
            wireguardInterfaceService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wireguardInterface.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardInterfaceService = client.wireguardInterfaces()

        val page = wireguardInterfaceService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardInterfaceService = client.wireguardInterfaces()

        val wireguardInterface =
            wireguardInterfaceService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wireguardInterface.validate()
    }
}
