// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessSimCardActionTest {

    @Test
    fun create() {
        val wirelessSimCardAction =
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
                        .value(WirelessSimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(wirelessSimCardAction.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessSimCardAction.actionType())
            .contains(WirelessSimCardAction.ActionType.ENABLE)
        assertThat(wirelessSimCardAction.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessSimCardAction.recordType()).contains("sim_card_action")
        assertThat(wirelessSimCardAction.settings())
            .contains(WirelessSimCardAction.Settings.builder().build())
        assertThat(wirelessSimCardAction.simCardId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessSimCardAction.status())
            .contains(
                WirelessSimCardAction.Status.builder()
                    .reason("The data limit was exceeded.")
                    .value(WirelessSimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                    .build()
            )
        assertThat(wirelessSimCardAction.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessSimCardAction =
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
                        .value(WirelessSimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedWirelessSimCardAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessSimCardAction),
                jacksonTypeRef<WirelessSimCardAction>(),
            )

        assertThat(roundtrippedWirelessSimCardAction).isEqualTo(wirelessSimCardAction)
    }
}
