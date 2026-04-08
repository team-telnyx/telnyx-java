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
                .administrativeArea("Illinois")
                .city("Chicago")
                .country("United States")
                .postalCode("60601")
                .streetAddress("123 Main St")
                .extendedAddress("Suite 400")
                .build()

        assertThat(physicalAddress.administrativeArea()).isEqualTo("Illinois")
        assertThat(physicalAddress.city()).isEqualTo("Chicago")
        assertThat(physicalAddress.country()).isEqualTo("United States")
        assertThat(physicalAddress.postalCode()).isEqualTo("60601")
        assertThat(physicalAddress.streetAddress()).isEqualTo("123 Main St")
        assertThat(physicalAddress.extendedAddress()).contains("Suite 400")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val physicalAddress =
            PhysicalAddress.builder()
                .administrativeArea("Illinois")
                .city("Chicago")
                .country("United States")
                .postalCode("60601")
                .streetAddress("123 Main St")
                .extendedAddress("Suite 400")
                .build()

        val roundtrippedPhysicalAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(physicalAddress),
                jacksonTypeRef<PhysicalAddress>(),
            )

        assertThat(roundtrippedPhysicalAddress).isEqualTo(physicalAddress)
    }
}
