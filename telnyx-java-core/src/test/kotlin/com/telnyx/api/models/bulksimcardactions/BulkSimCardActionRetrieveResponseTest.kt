// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bulksimcardactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionRetrieveResponseTest {

    @Test
    fun create() {
        val bulkSimCardActionRetrieveResponse =
            BulkSimCardActionRetrieveResponse.builder()
                .data(
                    BulkSimCardActionRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            BulkSimCardActionRetrieveResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(BulkSimCardActionRetrieveResponse.Data.Settings.builder().build())
                        .addSimCardActionsSummary(
                            BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary.builder()
                                .count(0L)
                                .status(
                                    BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary
                                        .Status
                                        .IN_PROGRESS
                                )
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(bulkSimCardActionRetrieveResponse.data())
            .contains(
                BulkSimCardActionRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(
                        BulkSimCardActionRetrieveResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                    )
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("bulk_sim_card_action")
                    .settings(BulkSimCardActionRetrieveResponse.Data.Settings.builder().build())
                    .addSimCardActionsSummary(
                        BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary.builder()
                            .count(0L)
                            .status(
                                BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary.Status
                                    .IN_PROGRESS
                            )
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkSimCardActionRetrieveResponse =
            BulkSimCardActionRetrieveResponse.builder()
                .data(
                    BulkSimCardActionRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            BulkSimCardActionRetrieveResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(BulkSimCardActionRetrieveResponse.Data.Settings.builder().build())
                        .addSimCardActionsSummary(
                            BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary.builder()
                                .count(0L)
                                .status(
                                    BulkSimCardActionRetrieveResponse.Data.SimCardActionsSummary
                                        .Status
                                        .IN_PROGRESS
                                )
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedBulkSimCardActionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkSimCardActionRetrieveResponse),
                jacksonTypeRef<BulkSimCardActionRetrieveResponse>(),
            )

        assertThat(roundtrippedBulkSimCardActionRetrieveResponse)
            .isEqualTo(bulkSimCardActionRetrieveResponse)
    }
}
