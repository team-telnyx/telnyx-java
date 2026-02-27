// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerCreateParams
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerPatch
import com.telnyx.sdk.models.wireguardpeers.WireguardPeerUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class WireguardPeerServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        val wireguardPeer =
            wireguardPeerService.create(
                WireguardPeerCreateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .lastSeen("2018-02-02T22:25:27.521Z")
                    .privateKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                    .build()
            )

        wireguardPeer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        val wireguardPeer = wireguardPeerService.retrieve("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wireguardPeer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        val wireguardPeer =
            wireguardPeerService.update(
                WireguardPeerUpdateParams.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .wireguardPeerPatch(
                        WireguardPeerPatch.builder()
                            .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                            .build()
                    )
                    .build()
            )

        wireguardPeer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        val page = wireguardPeerService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        val wireguardPeer = wireguardPeerService.delete("6a09cdc3-8948-47f0-aa62-74ac943d6c58")

        wireguardPeer.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConfig() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val wireguardPeerService = client.wireguardPeers()

        wireguardPeerService.retrieveConfig("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }
}
