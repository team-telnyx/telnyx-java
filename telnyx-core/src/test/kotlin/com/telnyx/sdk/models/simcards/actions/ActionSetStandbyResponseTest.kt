// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSetStandbyResponseTest {

    @Test
    fun create() {
        val actionSetStandbyResponse =
            ActionSetStandbyResponse.builder()
                .data(
                    WirelessSimCardAction.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(WirelessSimCardAction.ActionType.ENABLE)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sim_card_action")
                        .settings(WirelessSimCardAction.Settings.builder().build())
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            WirelessSimCardAction.Status.builder()
                                .reason("The data limit was exceeded.")
                                .value(WirelessSimCardAction.Status.Value_.COMPLETED)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(actionSetStandbyResponse.data())
            .contains(
                WirelessSimCardAction.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(WirelessSimCardAction.ActionType.ENABLE)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sim_card_action")
                    .settings(WirelessSimCardAction.Settings.builder().build())
                    .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(
                        WirelessSimCardAction.Status.builder()
                            .reason("The data limit was exceeded.")
                            .value(WirelessSimCardAction.Status.Value_.COMPLETED)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionSetStandbyResponse =
            ActionSetStandbyResponse.builder()
                .data(
                    WirelessSimCardAction.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(WirelessSimCardAction.ActionType.ENABLE)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sim_card_action")
                        .settings(WirelessSimCardAction.Settings.builder().build())
                        .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(
                            WirelessSimCardAction.Status.builder()
                                .reason("The data limit was exceeded.")
                                .value(WirelessSimCardAction.Status.Value_.COMPLETED)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedActionSetStandbyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionSetStandbyResponse),
                jacksonTypeRef<ActionSetStandbyResponse>(),
            )

        assertThat(roundtrippedActionSetStandbyResponse).isEqualTo(actionSetStandbyResponse)
    }
}
