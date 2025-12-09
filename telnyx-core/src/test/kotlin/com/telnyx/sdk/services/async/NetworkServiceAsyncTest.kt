// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.networks.NetworkCreate
import com.telnyx.sdk.models.networks.NetworkUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class NetworkServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val networkFuture =
            networkServiceAsync.create(
                NetworkCreate.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test network")
                    .build()
            )

        val network = networkFuture.get()
        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val networkFuture = networkServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val network = networkFuture.get()
        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val networkFuture =
            networkServiceAsync.update(
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

        val network = networkFuture.get()
        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val pageFuture = networkServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val networkFuture = networkServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val network = networkFuture.get()
        network.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun listInterfaces() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val networkServiceAsync = client.networks()

        val pageFuture = networkServiceAsync.listInterfaces("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val page = pageFuture.get()
        page.response().validate()
    }
}
