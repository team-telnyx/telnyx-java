// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.addresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AddressListPageResponseTest {

    @Test
    fun create() {
        val addressListPageResponse =
            AddressListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(addressListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(addressListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val addressListPageResponse =
            AddressListPageResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedAddressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(addressListPageResponse),
                jacksonTypeRef<AddressListPageResponse>(),
            )

        assertThat(roundtrippedAddressListPageResponse).isEqualTo(addressListPageResponse)
    }
}
