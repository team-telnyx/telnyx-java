// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerPatch
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WireguardPeerServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
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
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val pageFuture = wireguardPeerServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val wireguardPeerFuture =
            wireguardPeerServiceAsync.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val wireguardPeer = wireguardPeerFuture.get()
        wireguardPeer.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieveConfig() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val wireguardPeerServiceAsync = client.wireguardPeers()

        val responseFuture =
            wireguardPeerServiceAsync.retrieveConfig("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        val response = responseFuture.get()
    }
}
