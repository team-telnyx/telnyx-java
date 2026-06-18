// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BulkSimCardActionTest {

    @Test
    fun create() {
        val bulkSimCardAction =
            BulkSimCardAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardAction.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardAction.Settings.builder().build())
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(bulkSimCardAction.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(bulkSimCardAction.actionType())
            .contains(BulkSimCardAction.ActionType.BULK_SET_PUBLIC_IPS)
        assertThat(bulkSimCardAction.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(bulkSimCardAction.recordType()).contains("bulk_sim_card_action")
        assertThat(bulkSimCardAction.settings())
            .contains(BulkSimCardAction.Settings.builder().build())
        assertThat(bulkSimCardAction.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bulkSimCardAction =
            BulkSimCardAction.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .actionType(BulkSimCardAction.ActionType.BULK_SET_PUBLIC_IPS)
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("bulk_sim_card_action")
                .settings(BulkSimCardAction.Settings.builder().build())
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedBulkSimCardAction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bulkSimCardAction),
                jacksonTypeRef<BulkSimCardAction>(),
            )

        assertThat(roundtrippedBulkSimCardAction).isEqualTo(bulkSimCardAction)
    }
}
