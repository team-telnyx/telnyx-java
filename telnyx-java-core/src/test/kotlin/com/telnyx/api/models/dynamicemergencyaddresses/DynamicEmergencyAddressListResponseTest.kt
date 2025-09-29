// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.Metadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressListResponseTest {

    @Test
    fun create() {
        val dynamicEmergencyAddressListResponse =
            DynamicEmergencyAddressListResponse.builder()
                .addData(
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
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        assertThat(dynamicEmergencyAddressListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(dynamicEmergencyAddressListResponse.meta())
            .contains(
                Metadata.builder()
                    .pageNumber(3.0)
                    .pageSize(1.0)
                    .totalPages(13.0)
                    .totalResults(13.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyAddressListResponse =
            DynamicEmergencyAddressListResponse.builder()
                .addData(
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
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        val roundtrippedDynamicEmergencyAddressListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyAddressListResponse),
                jacksonTypeRef<DynamicEmergencyAddressListResponse>(),
            )

        assertThat(roundtrippedDynamicEmergencyAddressListResponse)
            .isEqualTo(dynamicEmergencyAddressListResponse)
    }
}
