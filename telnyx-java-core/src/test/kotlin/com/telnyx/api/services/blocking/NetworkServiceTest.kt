// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.networks.InterfaceStatus
import com.telnyx.api.models.networks.NetworkCreate
import com.telnyx.api.models.networks.NetworkListInterfacesParams
import com.telnyx.api.models.networks.NetworkListParams
import com.telnyx.api.models.networks.NetworkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NetworkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val network =
            networkService.create(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("network")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val network = networkService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val network =
            networkService.update(
                NetworkUpdateParams.builder()
                    .pathId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .networkCreate(
                        NetworkCreate.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .createdAt("2018-02-02T22:25:27.521Z")
                            .recordType("network")
                            .updatedAt("2018-02-02T22:25:27.521Z")
                            .name("test network")
                            .build()
                    )
                    .build()
            )

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val networks =
            networkService.list(
                NetworkListParams.builder()
                    .filter(NetworkListParams.Filter.builder().name("test network").build())
                    .page(NetworkListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        networks.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val network = networkService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listInterfaces() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkService = client.networks()

        val response =
            networkService.listInterfaces(
                NetworkListInterfacesParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .filter(
                        NetworkListInterfacesParams.Filter.builder()
                            .name("test interface")
                            .status(InterfaceStatus.PROVISIONED)
                            .type("wireguard_interface")
                            .build()
                    )
                    .page(NetworkListInterfacesParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        response.validate()
    }
}
