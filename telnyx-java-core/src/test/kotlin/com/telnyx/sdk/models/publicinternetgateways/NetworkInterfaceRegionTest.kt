// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkInterfaceRegionTest {

    @Test
    fun create() {
        val networkInterfaceRegion =
            NetworkInterfaceRegion.builder().regionCode("ashburn-va").build()

        assertThat(networkInterfaceRegion.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkInterfaceRegion =
            NetworkInterfaceRegion.builder().regionCode("ashburn-va").build()

        val roundtrippedNetworkInterfaceRegion =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkInterfaceRegion),
                jacksonTypeRef<NetworkInterfaceRegion>(),
            )

        assertThat(roundtrippedNetworkInterfaceRegion).isEqualTo(networkInterfaceRegion)
    }
}
