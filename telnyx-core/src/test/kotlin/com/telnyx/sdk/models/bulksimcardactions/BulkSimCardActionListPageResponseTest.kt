// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionListPageResponseTest {

    @Test
    fun create() {
        val bulkSimCardActionListPageResponse =
            BulkSimCardActionListPageResponse.builder()
                .addData(
                    BulkSimCardActionListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(BulkSimCardActionListResponse.Settings.builder().build())
                        .addSimCardActionsSummary(
                            SimCardActionsSummary.builder()
                                .count(0L)
                                .status(SimCardActionsSummary.Status.IN_PROGRESS)
                                .build()
                        )
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

        assertThat(bulkSimCardActionListPageResponse.data().getOrNull())
            .containsExactly(
                BulkSimCardActionListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("bulk_sim_card_action")
                    .settings(BulkSimCardActionListResponse.Settings.builder().build())
                    .addSimCardActionsSummary(
                        SimCardActionsSummary.builder()
                            .count(0L)
                            .status(SimCardActionsSummary.Status.IN_PROGRESS)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(bulkSimCardActionListPageResponse.meta())
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
        val bulkSimCardActionListPageResponse =
            BulkSimCardActionListPageResponse.builder()
                .addData(
                    BulkSimCardActionListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(BulkSimCardActionListResponse.Settings.builder().build())
                        .addSimCardActionsSummary(
                            SimCardActionsSummary.builder()
                                .count(0L)
                                .status(SimCardActionsSummary.Status.IN_PROGRESS)
                                .build()
                        )
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

        val roundtrippedBulkSimCardActionListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkSimCardActionListPageResponse),
                jacksonTypeRef<BulkSimCardActionListPageResponse>(),
            )

        assertThat(roundtrippedBulkSimCardActionListPageResponse)
            .isEqualTo(bulkSimCardActionListPageResponse)
    }
}
