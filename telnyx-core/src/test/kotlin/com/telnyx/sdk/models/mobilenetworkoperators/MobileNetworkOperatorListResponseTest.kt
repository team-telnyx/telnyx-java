// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilenetworkoperators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileNetworkOperatorListResponseTest {

    @Test
    fun create() {
        val mobileNetworkOperatorListResponse =
            MobileNetworkOperatorListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .countryCode("US")
                .mcc("310")
                .mnc("410")
                .name("AT&T Mobility (USACG)")
                .networkPreferencesEnabled(true)
                .recordType("mobile_network_operator")
                .tadig("USACG")
                .build()

        assertThat(mobileNetworkOperatorListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(mobileNetworkOperatorListResponse.countryCode()).contains("US")
        assertThat(mobileNetworkOperatorListResponse.mcc()).contains("310")
        assertThat(mobileNetworkOperatorListResponse.mnc()).contains("410")
        assertThat(mobileNetworkOperatorListResponse.name()).contains("AT&T Mobility (USACG)")
        assertThat(mobileNetworkOperatorListResponse.networkPreferencesEnabled()).contains(true)
        assertThat(mobileNetworkOperatorListResponse.recordType())
            .contains("mobile_network_operator")
        assertThat(mobileNetworkOperatorListResponse.tadig()).contains("USACG")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mobileNetworkOperatorListResponse =
            MobileNetworkOperatorListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .countryCode("US")
                .mcc("310")
                .mnc("410")
                .name("AT&T Mobility (USACG)")
                .networkPreferencesEnabled(true)
                .recordType("mobile_network_operator")
                .tadig("USACG")
                .build()

        val roundtrippedMobileNetworkOperatorListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileNetworkOperatorListResponse),
                jacksonTypeRef<MobileNetworkOperatorListResponse>(),
            )

        assertThat(roundtrippedMobileNetworkOperatorListResponse)
            .isEqualTo(mobileNetworkOperatorListResponse)
    }
}
