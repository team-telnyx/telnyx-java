// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBulkSetPublicIpsResponseTest {

    @Test
    fun create() {
        val actionBulkSetPublicIpsResponse =
            ActionBulkSetPublicIpsResponse.builder()
                .data(
                    ActionBulkSetPublicIpsResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkSetPublicIpsResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkSetPublicIpsResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(actionBulkSetPublicIpsResponse.data())
            .contains(
                ActionBulkSetPublicIpsResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(ActionBulkSetPublicIpsResponse.Data.ActionType.BULK_SET_PUBLIC_IPS)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("bulk_sim_card_action")
                    .settings(ActionBulkSetPublicIpsResponse.Data.Settings.builder().build())
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionBulkSetPublicIpsResponse =
            ActionBulkSetPublicIpsResponse.builder()
                .data(
                    ActionBulkSetPublicIpsResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkSetPublicIpsResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkSetPublicIpsResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedActionBulkSetPublicIpsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionBulkSetPublicIpsResponse),
                jacksonTypeRef<ActionBulkSetPublicIpsResponse>(),
            )

        assertThat(roundtrippedActionBulkSetPublicIpsResponse)
            .isEqualTo(actionBulkSetPublicIpsResponse)
    }
}
