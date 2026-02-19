// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.networks.NetworkCreate
import com.telnyx.sdk.models.networks.NetworkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class NetworkServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val network =
            networkService.create(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val network = networkService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val network =
            networkService.update(
                NetworkUpdateParams.builder()
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .networkCreate(
                        NetworkCreate.builder()
                            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .createdAt("2018-02-02T22:25:27.521Z")
                            .recordType("sample_record_type")
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
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val page = networkService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val network = networkService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listInterfaces() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val networkService = client.networks()

        val page = networkService.listInterfaces("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        page.response().validate()
    }
}
