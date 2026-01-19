// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.mobilenetworkoperators

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileNetworkOperatorListPageResponseTest {

    @Test
    fun create() {
        val mobileNetworkOperatorListPageResponse =
            MobileNetworkOperatorListPageResponse.builder()
                .addData(
                    MobileNetworkOperatorListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .countryCode("US")
                        .mcc("310")
                        .mnc("410")
                        .name("AT&T Mobility (USACG)")
                        .networkPreferencesEnabled(true)
                        .recordType("mobile_network_operator")
                        .tadig("USACG")
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

        assertThat(mobileNetworkOperatorListPageResponse.data().getOrNull())
            .containsExactly(
                MobileNetworkOperatorListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .countryCode("US")
                    .mcc("310")
                    .mnc("410")
                    .name("AT&T Mobility (USACG)")
                    .networkPreferencesEnabled(true)
                    .recordType("mobile_network_operator")
                    .tadig("USACG")
                    .build()
            )
        assertThat(mobileNetworkOperatorListPageResponse.meta())
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
        val mobileNetworkOperatorListPageResponse =
            MobileNetworkOperatorListPageResponse.builder()
                .addData(
                    MobileNetworkOperatorListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .countryCode("US")
                        .mcc("310")
                        .mnc("410")
                        .name("AT&T Mobility (USACG)")
                        .networkPreferencesEnabled(true)
                        .recordType("mobile_network_operator")
                        .tadig("USACG")
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

        val roundtrippedMobileNetworkOperatorListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mobileNetworkOperatorListPageResponse),
                jacksonTypeRef<MobileNetworkOperatorListPageResponse>(),
            )

        assertThat(roundtrippedMobileNetworkOperatorListPageResponse)
            .isEqualTo(mobileNetworkOperatorListPageResponse)
    }
}
