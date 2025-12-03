// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.useraddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddressListPageResponseTest {

    @Test
    fun create() {
        val userAddressListPageResponse =
            UserAddressListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(userAddressListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(userAddressListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val userAddressListPageResponse =
            UserAddressListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedUserAddressListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(userAddressListPageResponse),
                jacksonTypeRef<UserAddressListPageResponse>(),
            )

        assertThat(roundtrippedUserAddressListPageResponse).isEqualTo(userAddressListPageResponse)
    }
}
