// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionDisableResponseTest {

    @Test
    fun create() {
        val actionDisableResponse =
            ActionDisableResponse.builder()
                .data(
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
                                .value(SimCardAction.Status.Value_.COMPLETED)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(actionDisableResponse.data())
            .contains(
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
                            .value(SimCardAction.Status.Value_.COMPLETED)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionDisableResponse =
            ActionDisableResponse.builder()
                .data(
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
                                .value(SimCardAction.Status.Value_.COMPLETED)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedActionDisableResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionDisableResponse),
                jacksonTypeRef<ActionDisableResponse>(),
            )

        assertThat(roundtrippedActionDisableResponse).isEqualTo(actionDisableResponse)
    }
}
