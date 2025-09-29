// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wirelessblocklistvalues

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessBlocklistValueListResponseTest {

    @Test
    fun create() {
        val wirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse.builder()
                .dataOfCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.Country.builder()
                            .code("US")
                            .name("United States of America")
                            .build()
                    )
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

        assertThat(wirelessBlocklistValueListResponse.data())
            .contains(
                WirelessBlocklistValueListResponse.Data.ofCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.Country.builder()
                            .code("US")
                            .name("United States of America")
                            .build()
                    )
                )
            )
        assertThat(wirelessBlocklistValueListResponse.meta())
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
        val wirelessBlocklistValueListResponse =
            WirelessBlocklistValueListResponse.builder()
                .dataOfCountry(
                    listOf(
                        WirelessBlocklistValueListResponse.Data.Country.builder()
                            .code("US")
                            .name("United States of America")
                            .build()
                    )
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

        val roundtrippedWirelessBlocklistValueListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessBlocklistValueListResponse),
                jacksonTypeRef<WirelessBlocklistValueListResponse>(),
            )

        assertThat(roundtrippedWirelessBlocklistValueListResponse)
            .isEqualTo(wirelessBlocklistValueListResponse)
    }
}
