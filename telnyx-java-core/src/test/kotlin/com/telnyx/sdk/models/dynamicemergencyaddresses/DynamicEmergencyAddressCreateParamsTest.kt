// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyaddresses

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressCreateParamsTest {

    @Test
    fun create() {
        DynamicEmergencyAddressCreateParams.builder()
            .dynamicEmergencyAddress(
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
    }

    @Test
    fun body() {
        val params =
            DynamicEmergencyAddressCreateParams.builder()
                .dynamicEmergencyAddress(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            DynamicEmergencyAddressCreateParams.builder()
                .dynamicEmergencyAddress(
                    DynamicEmergencyAddress.builder()
                        .administrativeArea("TX")
                        .countryCode(DynamicEmergencyAddress.CountryCode.US)
                        .houseNumber("house_number")
                        .locality("Austin")
                        .postalCode("78701")
                        .streetName("Congress")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DynamicEmergencyAddress.builder()
                    .administrativeArea("TX")
                    .countryCode(DynamicEmergencyAddress.CountryCode.US)
                    .houseNumber("house_number")
                    .locality("Austin")
                    .postalCode("78701")
                    .streetName("Congress")
                    .build()
            )
    }
}
