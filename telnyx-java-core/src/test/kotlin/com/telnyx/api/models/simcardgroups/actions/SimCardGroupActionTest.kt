// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupActionTest {

    @Test
    fun create() {
        val simCardGroupAction =
            SimCardGroupAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sim_card_group_action")
                .settings(
                    SimCardGroupAction.Settings.builder()
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(SimCardGroupAction.Status.IN_PROGRESS)
                .type(SimCardGroupAction.Type.SET_PRIVATE_WIRELESS_GATEWAY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(simCardGroupAction.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroupAction.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardGroupAction.recordType()).contains("sim_card_group_action")
        assertThat(simCardGroupAction.settings())
            .contains(
                SimCardGroupAction.Settings.builder()
                    .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
        assertThat(simCardGroupAction.simCardGroupId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardGroupAction.status()).contains(SimCardGroupAction.Status.IN_PROGRESS)
        assertThat(simCardGroupAction.type())
            .contains(SimCardGroupAction.Type.SET_PRIVATE_WIRELESS_GATEWAY)
        assertThat(simCardGroupAction.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardGroupAction =
            SimCardGroupAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sim_card_group_action")
                .settings(
                    SimCardGroupAction.Settings.builder()
                        .privateWirelessGatewayId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .simCardGroupId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(SimCardGroupAction.Status.IN_PROGRESS)
                .type(SimCardGroupAction.Type.SET_PRIVATE_WIRELESS_GATEWAY)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedSimCardGroupAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardGroupAction),
                jacksonTypeRef<SimCardGroupAction>(),
            )

        assertThat(roundtrippedSimCardGroupAction).isEqualTo(simCardGroupAction)
    }
}
