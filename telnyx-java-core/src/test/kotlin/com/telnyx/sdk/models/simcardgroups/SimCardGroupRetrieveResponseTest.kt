// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupRetrieveResponseTest {

    @Test
    fun create() {
        val simCardGroupRetrieveResponse =
            SimCardGroupRetrieveResponse.builder()
                .data(
                    SimCardGroup.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dataLimit(
                            SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build()
                        )
                        .isDefault(true)
                        .name("My Test Group")
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("sim_card_group")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .wirelessBlocklistId("a13bc415-7966-43bf-90d4-63cc76275289")
                        .build()
                )
                .build()

        assertThat(simCardGroupRetrieveResponse.data())
            .contains(
                SimCardGroup.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .dataLimit(SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build())
                    .isDefault(true)
                    .name("My Test Group")
                    .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .recordType("sim_card_group")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .wirelessBlocklistId("a13bc415-7966-43bf-90d4-63cc76275289")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGroupRetrieveResponse =
            SimCardGroupRetrieveResponse.builder()
                .data(
                    SimCardGroup.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .consumedData(ConsumedData.builder().amount("2048.1").unit("MB").build())
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .dataLimit(
                            SimCardGroup.DataLimit.builder().amount("2048.1").unit("MB").build()
                        )
                        .isDefault(true)
                        .name("My Test Group")
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("sim_card_group")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .wirelessBlocklistId("a13bc415-7966-43bf-90d4-63cc76275289")
                        .build()
                )
                .build()

        val roundtrippedSimCardGroupRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGroupRetrieveResponse),
                jacksonTypeRef<SimCardGroupRetrieveResponse>(),
            )

        assertThat(roundtrippedSimCardGroupRetrieveResponse).isEqualTo(simCardGroupRetrieveResponse)
    }
}
