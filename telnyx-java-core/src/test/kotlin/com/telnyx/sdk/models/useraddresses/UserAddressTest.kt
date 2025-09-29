// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddressTest {

    @Test
    fun create() {
        val userAddress =
            UserAddress.builder()
                .id("c3527e69-dc5a-4b3e-8f44-99d209f83c1d")
                .administrativeArea("TX")
                .borough("Guadalajara")
                .businessName("Toy-O'Kon")
                .countryCode("US")
                .createdAt("2018-02-02T22:25:27.521Z")
                .customerReference("MY REF 001")
                .extendedAddress("14th Floor")
                .firstName("Alfred")
                .lastName("Foster")
                .locality("Austin")
                .neighborhood("Ciudad de los deportes")
                .phoneNumber("+12125559000")
                .postalCode("78701")
                .recordType("user_address")
                .streetAddress("600 Congress Avenue")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(userAddress.id()).contains("c3527e69-dc5a-4b3e-8f44-99d209f83c1d")
        assertThat(userAddress.administrativeArea()).contains("TX")
        assertThat(userAddress.borough()).contains("Guadalajara")
        assertThat(userAddress.businessName()).contains("Toy-O'Kon")
        assertThat(userAddress.countryCode()).contains("US")
        assertThat(userAddress.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(userAddress.customerReference()).contains("MY REF 001")
        assertThat(userAddress.extendedAddress()).contains("14th Floor")
        assertThat(userAddress.firstName()).contains("Alfred")
        assertThat(userAddress.lastName()).contains("Foster")
        assertThat(userAddress.locality()).contains("Austin")
        assertThat(userAddress.neighborhood()).contains("Ciudad de los deportes")
        assertThat(userAddress.phoneNumber()).contains("+12125559000")
        assertThat(userAddress.postalCode()).contains("78701")
        assertThat(userAddress.recordType()).contains("user_address")
        assertThat(userAddress.streetAddress()).contains("600 Congress Avenue")
        assertThat(userAddress.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userAddress =
            UserAddress.builder()
                .id("c3527e69-dc5a-4b3e-8f44-99d209f83c1d")
                .administrativeArea("TX")
                .borough("Guadalajara")
                .businessName("Toy-O'Kon")
                .countryCode("US")
                .createdAt("2018-02-02T22:25:27.521Z")
                .customerReference("MY REF 001")
                .extendedAddress("14th Floor")
                .firstName("Alfred")
                .lastName("Foster")
                .locality("Austin")
                .neighborhood("Ciudad de los deportes")
                .phoneNumber("+12125559000")
                .postalCode("78701")
                .recordType("user_address")
                .streetAddress("600 Congress Avenue")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedUserAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userAddress),
                jacksonTypeRef<UserAddress>(),
            )

        assertThat(roundtrippedUserAddress).isEqualTo(userAddress)
    }
}
