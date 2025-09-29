// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRetrieveResponseTest {

    @Test
    fun create() {
        val actionRetrieveResponse =
            ActionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(actionRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRetrieveResponse =
            ActionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedActionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRetrieveResponse),
                jacksonTypeRef<ActionRetrieveResponse>(),
            )

        assertThat(roundtrippedActionRetrieveResponse).isEqualTo(actionRetrieveResponse)
    }
}
