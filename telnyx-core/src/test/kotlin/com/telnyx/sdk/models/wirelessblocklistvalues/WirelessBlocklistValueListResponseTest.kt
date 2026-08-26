// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wirelessblocklistvalues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistValueListResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse.builder()
                .dataOfCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.WirelessCountry.builder()
                            .countryCode("US")
                            .build()
                    )
                )
                .build()

        assertThat(wirelessBlocklistValueListResponse.data())
            .isEqualTo(
                WirelessBlocklistValueListResponse.Data.ofCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.WirelessCountry.builder()
                            .countryCode("US")
                            .build()
                    )
                )
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse.builder()
                .dataOfCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.WirelessCountry.builder()
                            .countryCode("US")
                            .build()
                    )
                )
                .build()

        val roundtrippedWirelessBlocklistValueListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistValueListResponse),
                jacksonTypeRef<WirelessBlocklistValueListResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistValueListResponse)
            .isEqualTo(wirelessBlocklistValueListResponse)
    }
}
