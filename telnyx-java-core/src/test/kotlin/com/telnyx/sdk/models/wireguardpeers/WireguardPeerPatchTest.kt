// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerPatchTest {

    @Test
    fun create() {
        val wireguardPeerPatch =
            WireguardPeerPatch.builder()
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .build()

        assertThat(wireguardPeerPatch.publicKey())
            .contains("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wireguardPeerPatch =
            WireguardPeerPatch.builder()
                .publicKey("qF4EqlZq+5JL2IKYY8ij49daYyfKVhevJrcDxdqC8GU=")
                .build()

        val roundtrippedWireguardPeerPatch =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wireguardPeerPatch),
                jacksonTypeRef<WireguardPeerPatch>(),
            )

        assertThat(roundtrippedWireguardPeerPatch).isEqualTo(wireguardPeerPatch)
    }
}
