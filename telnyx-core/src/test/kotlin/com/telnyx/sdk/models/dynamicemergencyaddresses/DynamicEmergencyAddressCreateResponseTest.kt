// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressCreateResponseTest {

    @Test
    fun create() {
        val dynamicEmergencyAddressCreateResponse =
            DynamicEmergencyAddressCreateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(dynamicEmergencyAddressCreateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyAddressCreateResponse =
            DynamicEmergencyAddressCreateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedDynamicEmergencyAddressCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyAddressCreateResponse),
                jacksonTypeRef<DynamicEmergencyAddressCreateResponse>(),
            )

        assertThat(roundtrippedDynamicEmergencyAddressCreateResponse)
            .isEqualTo(dynamicEmergencyAddressCreateResponse)
    }
}
