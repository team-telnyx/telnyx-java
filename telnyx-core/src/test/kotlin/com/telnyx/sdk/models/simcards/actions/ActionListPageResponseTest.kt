// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionListPageResponseTest {

    @Test
    fun create() {
        val actionListPageResponse =
            ActionListPageResponse.builder()
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
                                .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
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

        assertThat(actionListPageResponse.data().getOrNull())
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
                            .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(actionListPageResponse.meta())
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
        val actionListPageResponse =
            ActionListPageResponse.builder()
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
                                .value(SimCardAction.Status.SimCardActionStatusValue.COMPLETED)
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

        val roundtrippedActionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionListPageResponse),
                jacksonTypeRef<ActionListPageResponse>(),
            )

        assertThat(roundtrippedActionListPageResponse).isEqualTo(actionListPageResponse)
    }
}
