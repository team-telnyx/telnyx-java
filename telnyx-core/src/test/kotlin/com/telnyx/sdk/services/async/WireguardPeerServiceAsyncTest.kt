// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerListParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerPatch
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class WireguardPeerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.create(
                WireguardPeerCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .lastSeen("2018-02-02T22:25:27.521Z")
                    .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .build()
            )

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.update(
                WireguardPeerUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .wireguardPeerPatch(
                        WireguardPeerPatch.builder()
                            .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                            .build()
                    )
                    .build()
            )

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeersFuture =
            wireguardPeerServiceAsync.list(
                WireguardPeerListParams.builder()
                    .filter(
                        WireguardPeerListParams.Filter.builder()
                            .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                            .build()
                    )
                    .page(WireguardPeerListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val wireguardPeers = wireguardPeersFuture.get()
        wireguardPeers.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveConfig() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val responseFuture =
            wireguardPeerServiceAsync.retrieveConfig("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
    }
}
