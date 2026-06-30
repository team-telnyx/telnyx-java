// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingOrderEndUserLocationTest {

    @Test
    fun create() {
        val portingOrderEndUserLocation =
            PortingOrderEndUserLocation.builder()
                .administrativeArea("TX")
                .countryCode("US")
                .extendedAddress("14th Floor")
                .locality("Austin")
                .postalCode("78701")
                .streetAddress("600 Congress Avenue")
                .build()

        assertThat(portingOrderEndUserLocation.administrativeArea()).contains("TX")
        assertThat(portingOrderEndUserLocation.countryCode()).contains("US")
        assertThat(portingOrderEndUserLocation.extendedAddress()).contains("14th Floor")
        assertThat(portingOrderEndUserLocation.locality()).contains("Austin")
        assertThat(portingOrderEndUserLocation.postalCode()).contains("78701")
        assertThat(portingOrderEndUserLocation.streetAddress()).contains("600 Congress Avenue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingOrderEndUserLocation =
            PortingOrderEndUserLocation.builder()
                .administrativeArea("TX")
                .countryCode("US")
                .extendedAddress("14th Floor")
                .locality("Austin")
                .postalCode("78701")
                .streetAddress("600 Congress Avenue")
                .build()

        val roundtrippedPortingOrderEndUserLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingOrderEndUserLocation),
                jacksonTypeRef<PortingOrderEndUserLocation>(),
            )

        assertThat(roundtrippedPortingOrderEndUserLocation).isEqualTo(portingOrderEndUserLocation)
    }
}
