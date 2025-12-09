// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionListResponseTest {

    @Test
    fun create() {
        val bulkSimCardActionListResponse =
            BulkSimCardActionListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardActionListResponse.Settings.builder().build())
                .addSimCardActionsSummary(
                    BulkSimCardActionListResponse.SimCardActionsSummary.builder()
                        .count(0L)
                        .status(
                            BulkSimCardActionListResponse.SimCardActionsSummary.Status.IN_PROGRESS
                        )
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(bulkSimCardActionListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(bulkSimCardActionListResponse.actionType())
            .contains(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
        assertThat(bulkSimCardActionListResponse.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(bulkSimCardActionListResponse.recordType()).contains("bulk_sim_card_action")
        assertThat(bulkSimCardActionListResponse.settings())
            .contains(BulkSimCardActionListResponse.Settings.builder().build())
        assertThat(bulkSimCardActionListResponse.simCardActionsSummary().getOrNull())
            .containsExactly(
                BulkSimCardActionListResponse.SimCardActionsSummary.builder()
                    .count(0L)
                    .status(BulkSimCardActionListResponse.SimCardActionsSummary.Status.IN_PROGRESS)
                    .build()
            )
        assertThat(bulkSimCardActionListResponse.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkSimCardActionListResponse =
            BulkSimCardActionListResponse.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardActionListResponse.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardActionListResponse.Settings.builder().build())
                .addSimCardActionsSummary(
                    BulkSimCardActionListResponse.SimCardActionsSummary.builder()
                        .count(0L)
                        .status(
                            BulkSimCardActionListResponse.SimCardActionsSummary.Status.IN_PROGRESS
                        )
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedBulkSimCardActionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkSimCardActionListResponse),
                jacksonTypeRef<BulkSimCardActionListResponse>(),
            )

        assertThat(roundtrippedBulkSimCardActionListResponse)
            .isEqualTo(bulkSimCardActionListResponse)
    }
}
