// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bulksimcardactions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionDetailedTest {

    @Test
    fun create() {
        val bulkSimCardActionDetailed =
            BulkSimCardActionDetailed.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardActionDetailed.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardActionDetailed.Settings.builder().build())
                .addSimCardActionsSummary(
                    SimCardActionsSummary.builder()
                        .count(0L)
                        .status(SimCardActionsSummary.Status.IN_PROGRESS)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(bulkSimCardActionDetailed.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(bulkSimCardActionDetailed.actionType())
            .contains(BulkSimCardActionDetailed.ActionType.BULK_SET_PUBLIC_IPS)
        assertThat(bulkSimCardActionDetailed.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(bulkSimCardActionDetailed.recordType()).contains("bulk_sim_card_action")
        assertThat(bulkSimCardActionDetailed.settings())
            .contains(BulkSimCardActionDetailed.Settings.builder().build())
        assertThat(bulkSimCardActionDetailed.simCardActionsSummary().getOrNull())
            .containsExactly(
                SimCardActionsSummary.builder()
                    .count(0L)
                    .status(SimCardActionsSummary.Status.IN_PROGRESS)
                    .build()
            )
        assertThat(bulkSimCardActionDetailed.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkSimCardActionDetailed =
            BulkSimCardActionDetailed.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardActionDetailed.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardActionDetailed.Settings.builder().build())
                .addSimCardActionsSummary(
                    SimCardActionsSummary.builder()
                        .count(0L)
                        .status(SimCardActionsSummary.Status.IN_PROGRESS)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedBulkSimCardActionDetailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkSimCardActionDetailed),
                jacksonTypeRef<BulkSimCardActionDetailed>(),
            )

        assertThat(roundtrippedBulkSimCardActionDetailed).isEqualTo(bulkSimCardActionDetailed)
    }
}
