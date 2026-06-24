// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCreateTest {

    @Test
    fun create() {
        val networkCreate = NetworkCreate.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkCreate = NetworkCreate.builder().build()

        val roundtrippedNetworkCreate =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCreate),
                jacksonTypeRef<NetworkCreate>(),
            )

        assertThat(roundtrippedNetworkCreate).isEqualTo(networkCreate)
    }
}
