// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressTest {

    @Test
    fun create() {
        val dynamicEmergencyAddress =
            DynamicEmergencyAddress.builder()
                .administrativeArea("TX")
                .countryCode(DynamicEmergencyAddress.CountryCode.US)
                .houseNumber("house_number")
                .locality("Austin")
                .postalCode("78701")
                .streetName("Congress")
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f1")
                .createdAt("2018-02-02T22:25:27.521Z")
                .extendedAddress("extended_address")
                .houseSuffix("house_suffix")
                .recordType("dynamic_emergency_address")
                .sipGeolocationId("XYZ123")
                .status(DynamicEmergencyAddress.Status.PENDING)
                .streetPostDirectional("street_post_directional")
                .streetPreDirectional("street_pre_directional")
                .streetSuffix("St")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(dynamicEmergencyAddress.administrativeArea()).isEqualTo("TX")
        assertThat(dynamicEmergencyAddress.countryCode())
            .isEqualTo(DynamicEmergencyAddress.CountryCode.US)
        assertThat(dynamicEmergencyAddress.houseNumber()).isEqualTo("house_number")
        assertThat(dynamicEmergencyAddress.locality()).isEqualTo("Austin")
        assertThat(dynamicEmergencyAddress.postalCode()).isEqualTo("78701")
        assertThat(dynamicEmergencyAddress.streetName()).isEqualTo("Congress")
        assertThat(dynamicEmergencyAddress.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f1")
        assertThat(dynamicEmergencyAddress.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(dynamicEmergencyAddress.extendedAddress()).contains("extended_address")
        assertThat(dynamicEmergencyAddress.houseSuffix()).contains("house_suffix")
        assertThat(dynamicEmergencyAddress.recordType()).contains("dynamic_emergency_address")
        assertThat(dynamicEmergencyAddress.sipGeolocationId()).contains("XYZ123")
        assertThat(dynamicEmergencyAddress.status())
            .contains(DynamicEmergencyAddress.Status.PENDING)
        assertThat(dynamicEmergencyAddress.streetPostDirectional())
            .contains("street_post_directional")
        assertThat(dynamicEmergencyAddress.streetPreDirectional())
            .contains("street_pre_directional")
        assertThat(dynamicEmergencyAddress.streetSuffix()).contains("St")
        assertThat(dynamicEmergencyAddress.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyAddress =
            DynamicEmergencyAddress.builder()
                .administrativeArea("TX")
                .countryCode(DynamicEmergencyAddress.CountryCode.US)
                .houseNumber("house_number")
                .locality("Austin")
                .postalCode("78701")
                .streetName("Congress")
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f1")
                .createdAt("2018-02-02T22:25:27.521Z")
                .extendedAddress("extended_address")
                .houseSuffix("house_suffix")
                .recordType("dynamic_emergency_address")
                .sipGeolocationId("XYZ123")
                .status(DynamicEmergencyAddress.Status.PENDING)
                .streetPostDirectional("street_post_directional")
                .streetPreDirectional("street_pre_directional")
                .streetSuffix("St")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedDynamicEmergencyAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyAddress),
                jacksonTypeRef<DynamicEmergencyAddress>(),
            )

        assertThat(roundtrippedDynamicEmergencyAddress).isEqualTo(dynamicEmergencyAddress)
    }
}
