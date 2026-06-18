// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.enterprises

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhysicalAddressTest {

    @Test
    fun create() {
        val physicalAddress =
            PhysicalAddress.builder()
                .administrativeArea("IL")
                .city("Chicago")
                .country("US")
                .postalCode("60601")
                .streetAddress("100 Main St")
                .extendedAddress("Suite 504")
                .build()

        assertThat(physicalAddress.administrativeArea()).isEqualTo("IL")
        assertThat(physicalAddress.city()).isEqualTo("Chicago")
        assertThat(physicalAddress.country()).isEqualTo("US")
        assertThat(physicalAddress.postalCode()).isEqualTo("60601")
        assertThat(physicalAddress.streetAddress()).isEqualTo("100 Main St")
        assertThat(physicalAddress.extendedAddress()).contains("Suite 504")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalAddress =
            PhysicalAddress.builder()
                .administrativeArea("IL")
                .city("Chicago")
                .country("US")
                .postalCode("60601")
                .streetAddress("100 Main St")
                .extendedAddress("Suite 504")
                .build()

        val roundtrippedPhysicalAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalAddress),
                jacksonTypeRef<PhysicalAddress>(),
            )

        assertThat(roundtrippedPhysicalAddress).isEqualTo(physicalAddress)
    }
}
