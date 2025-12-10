// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionListResponseTest {

    @Test
    fun create() {
        val actionListResponse =
            ActionListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(actionListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(actionListResponse.meta())
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
        val actionListResponse =
            ActionListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedActionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionListResponse),
                jacksonTypeRef<ActionListResponse>(),
            )

        assertThat(roundtrippedActionListResponse).isEqualTo(actionListResponse)
    }
}
