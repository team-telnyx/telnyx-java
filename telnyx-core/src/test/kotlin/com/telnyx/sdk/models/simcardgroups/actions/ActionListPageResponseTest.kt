// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardgroups.actions

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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(actionListPageResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(actionListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
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
