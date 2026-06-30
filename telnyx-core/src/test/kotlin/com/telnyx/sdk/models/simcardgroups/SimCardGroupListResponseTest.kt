// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupListResponseTest {

    @Test
    fun create() {
        val simCardGroupListResponse =
            SimCardGroupListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                .createdAt("2018-02-02T22:25:27.521Z")
                .dataLimit(
                    SimCardGroupListResponse.DataLimit.builder().amount("2048.1").unit("MB").build()
                )
                .isDefault(true)
                .name("My Test Group")
                .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .recordType("sim_card_group")
                .simCardCount(10L)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .wirelessBlocklistId("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
                .build()

        assertThat(simCardGroupListResponse.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroupListResponse.consumedData())
            .contains(ConsumedData.builder().amount("2048.1").unit("MB").build())
        assertThat(simCardGroupListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardGroupListResponse.dataLimit())
            .contains(
                SimCardGroupListResponse.DataLimit.builder().amount("2048.1").unit("MB").build()
            )
        assertThat(simCardGroupListResponse.isDefault()).contains(true)
        assertThat(simCardGroupListResponse.name()).contains("My Test Group")
        assertThat(simCardGroupListResponse.privateWirelessGatewayId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroupListResponse.recordType()).contains("sim_card_group")
        assertThat(simCardGroupListResponse.simCardCount()).contains(10L)
        assertThat(simCardGroupListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardGroupListResponse.wirelessBlocklistId())
            .contains("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGroupListResponse =
            SimCardGroupListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                .createdAt("2018-02-02T22:25:27.521Z")
                .dataLimit(
                    SimCardGroupListResponse.DataLimit.builder().amount("2048.1").unit("MB").build()
                )
                .isDefault(true)
                .name("My Test Group")
                .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .recordType("sim_card_group")
                .simCardCount(10L)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .wirelessBlocklistId("5aa584f6-14b1-41b2-8e01-1c04d1ee77c1")
                .build()

        val roundtrippedSimCardGroupListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGroupListResponse),
                jacksonTypeRef<SimCardGroupListResponse>(),
            )

        assertThat(roundtrippedSimCardGroupListResponse).isEqualTo(simCardGroupListResponse)
    }
}
