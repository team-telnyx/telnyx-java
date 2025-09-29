// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupTest {

    @Test
    fun create() {
        val simCardGroup =
            SimCardGroup.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                .createdAt("2018-02-02T22:25:27.521Z")
                .dataLimit(SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build())
                .default_(true)
                .name("My Test Group")
                .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .recordType("sim_card_group")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .wirelessBlocklistId("a13bc415-7966-43bf-90d4-63cc76275289")
                .build()

        assertThat(simCardGroup.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroup.consumedData())
            .contains(ConsumedData.builder().amount("2048.1").unit("MB").build())
        assertThat(simCardGroup.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardGroup.dataLimit())
            .contains(SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build())
        assertThat(simCardGroup.default_()).contains(true)
        assertThat(simCardGroup.name()).contains("My Test Group")
        assertThat(simCardGroup.privateWirelessGatewayId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroup.recordType()).contains("sim_card_group")
        assertThat(simCardGroup.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardGroup.wirelessBlocklistId())
            .contains("a13bc415-7966-43bf-90d4-63cc76275289")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGroup =
            SimCardGroup.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                .createdAt("2018-02-02T22:25:27.521Z")
                .dataLimit(SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build())
                .default_(true)
                .name("My Test Group")
                .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .recordType("sim_card_group")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .wirelessBlocklistId("a13bc415-7966-43bf-90d4-63cc76275289")
                .build()

        val roundtrippedSimCardGroup =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGroup),
                jacksonTypeRef<SimCardGroup>(),
            )

        assertThat(roundtrippedSimCardGroup).isEqualTo(simCardGroup)
    }
}
