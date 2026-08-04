// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddressesUserAddressTest {

    @Test
    fun create() {
        val userAddressesUserAddress =
            UserAddressesUserAddress.builder()
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

        assertThat(userAddressesUserAddress.id()).contains("c3527e69-dc5a-4b3e-8f44-99d209f83c1d")
        assertThat(userAddressesUserAddress.administrativeArea()).contains("TX")
        assertThat(userAddressesUserAddress.borough()).contains("Guadalajara")
        assertThat(userAddressesUserAddress.businessName()).contains("Toy-O'Kon")
        assertThat(userAddressesUserAddress.countryCode()).contains("US")
        assertThat(userAddressesUserAddress.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(userAddressesUserAddress.customerReference()).contains("MY REF 001")
        assertThat(userAddressesUserAddress.extendedAddress()).contains("14th Floor")
        assertThat(userAddressesUserAddress.firstName()).contains("Alfred")
        assertThat(userAddressesUserAddress.lastName()).contains("Foster")
        assertThat(userAddressesUserAddress.locality()).contains("Austin")
        assertThat(userAddressesUserAddress.neighborhood()).contains("Ciudad de los deportes")
        assertThat(userAddressesUserAddress.phoneNumber()).contains("+12125559000")
        assertThat(userAddressesUserAddress.postalCode()).contains("78701")
        assertThat(userAddressesUserAddress.recordType()).contains("user_address")
        assertThat(userAddressesUserAddress.streetAddress()).contains("600 Congress Avenue")
        assertThat(userAddressesUserAddress.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userAddressesUserAddress =
            UserAddressesUserAddress.builder()
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

        val roundtrippedUserAddressesUserAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userAddressesUserAddress),
                jacksonTypeRef<UserAddressesUserAddress>(),
            )

        assertThat(roundtrippedUserAddressesUserAddress).isEqualTo(userAddressesUserAddress)
    }
}
