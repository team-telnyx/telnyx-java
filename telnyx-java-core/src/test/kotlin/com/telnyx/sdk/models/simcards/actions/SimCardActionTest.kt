// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardActionTest {

    @Test
    fun create() {
        val simCardAction =
            SimCardAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(SimCardAction.ActionType.ENABLE)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sim_card_action")
                .settings(SimCardAction.Settings.builder().build())
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(
                    SimCardAction.Status.builder()
                        .reason("The data limit was exceeded.")
                        .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(simCardAction.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardAction.actionType()).contains(SimCardAction.ActionType.ENABLE)
        assertThat(simCardAction.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(simCardAction.recordType()).contains("sim_card_action")
        assertThat(simCardAction.settings()).contains(SimCardAction.Settings.builder().build())
        assertThat(simCardAction.simCardId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(simCardAction.status())
            .contains(
                SimCardAction.Status.builder()
                    .reason("The data limit was exceeded.")
                    .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                    .build()
            )
        assertThat(simCardAction.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val simCardAction =
            SimCardAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(SimCardAction.ActionType.ENABLE)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sim_card_action")
                .settings(SimCardAction.Settings.builder().build())
                .simCardId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(
                    SimCardAction.Status.builder()
                        .reason("The data limit was exceeded.")
                        .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedSimCardAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(simCardAction),
                jacksonTypeRef<SimCardAction>(),
            )

        assertThat(roundtrippedSimCardAction).isEqualTo(simCardAction)
    }
}
