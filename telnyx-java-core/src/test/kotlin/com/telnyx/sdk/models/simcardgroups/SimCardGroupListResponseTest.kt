// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupListResponseTest {

    @Test
    fun create() {
        val simCardGroupListResponse =
            SimCardGroupListResponse.builder()
                .addData(
                    SimCardGroupListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dataLimit(
                            SimCardGroupListResponse.Data.DataLimit.builder()
                                .amount("2048.1")
                                .unit("MB")
                                .build()
                        )
                        .default_(true)
                        .name("My Test Group")
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("sim_card_group")
                        .simCardCount(10L)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .wirelessBlocklistId("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
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

        assertThat(simCardGroupListResponse.data().getOrNull())
            .containsExactly(
                SimCardGroupListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .dataLimit(
                        SimCardGroupListResponse.Data.DataLimit.builder()
                            .amount("2048.1")
                            .unit("MB")
                            .build()
                    )
                    .default_(true)
                    .name("My Test Group")
                    .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .recordType("sim_card_group")
                    .simCardCount(10L)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .wirelessBlocklistId("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
                    .build()
            )
        assertThat(simCardGroupListResponse.meta())
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
        val simCardGroupListResponse =
            SimCardGroupListResponse.builder()
                .addData(
                    SimCardGroupListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dataLimit(
                            SimCardGroupListResponse.Data.DataLimit.builder()
                                .amount("2048.1")
                                .unit("MB")
                                .build()
                        )
                        .default_(true)
                        .name("My Test Group")
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("sim_card_group")
                        .simCardCount(10L)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .wirelessBlocklistId("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
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

        val roundtrippedSimCardGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGroupListResponse),
                jacksonTypeRef<SimCardGroupListResponse>(),
            )

        assertThat(roundtrippedSimCardGroupListResponse).isEqualTo(simCardGroupListResponse)
    }
}
