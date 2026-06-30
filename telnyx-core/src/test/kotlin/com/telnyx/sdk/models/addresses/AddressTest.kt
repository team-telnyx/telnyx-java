// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressTest {

    @Test
    fun create() {
        val address =
            Address.builder()
                .id("1293384261075731499")
                .addressBook(false)
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
                .recordType("address")
                .streetAddress("600 Congress Avenue")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .validateAddress(true)
                .build()

        assertThat(address.id()).contains("1293384261075731499")
        assertThat(address.addressBook()).contains(false)
        assertThat(address.administrativeArea()).contains("TX")
        assertThat(address.borough()).contains("Guadalajara")
        assertThat(address.businessName()).contains("Toy-O'Kon")
        assertThat(address.countryCode()).contains("US")
        assertThat(address.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(address.customerReference()).contains("MY REF 001")
        assertThat(address.extendedAddress()).contains("14th Floor")
        assertThat(address.firstName()).contains("Alfred")
        assertThat(address.lastName()).contains("Foster")
        assertThat(address.locality()).contains("Austin")
        assertThat(address.neighborhood()).contains("Ciudad de los deportes")
        assertThat(address.phoneNumber()).contains("+12125559000")
        assertThat(address.postalCode()).contains("78701")
        assertThat(address.recordType()).contains("address")
        assertThat(address.streetAddress()).contains("600 Congress Avenue")
        assertThat(address.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(address.validateAddress()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val address =
            Address.builder()
                .id("1293384261075731499")
                .addressBook(false)
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
                .recordType("address")
                .streetAddress("600 Congress Avenue")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .validateAddress(true)
                .build()

        val roundtrippedAddress =
            jsonMapper.readValue(jsonMapper.writeValueAsString(address), jacksonTypeRef<Address>())

        assertThat(roundtrippedAddress).isEqualTo(address)
    }
}
