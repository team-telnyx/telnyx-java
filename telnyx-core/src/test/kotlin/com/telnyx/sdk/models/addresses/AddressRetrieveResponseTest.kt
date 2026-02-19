// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressRetrieveResponseTest {

    @Test
    fun create() {
        val addressRetrieveResponse =
            AddressRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(addressRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressRetrieveResponse =
            AddressRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedAddressRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressRetrieveResponse),
                jacksonTypeRef<AddressRetrieveResponse>(),
            )

        assertThat(roundtrippedAddressRetrieveResponse).isEqualTo(addressRetrieveResponse)
    }
}
