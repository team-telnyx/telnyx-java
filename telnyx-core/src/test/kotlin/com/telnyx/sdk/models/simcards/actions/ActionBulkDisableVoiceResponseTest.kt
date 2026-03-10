// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBulkDisableVoiceResponseTest {

    @Test
    fun create() {
        val actionBulkDisableVoiceResponse =
            ActionBulkDisableVoiceResponse.builder()
                .data(
                    ActionBulkDisableVoiceResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkDisableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkDisableVoiceResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(actionBulkDisableVoiceResponse.data())
            .contains(
                ActionBulkDisableVoiceResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(ActionBulkDisableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("bulk_sim_card_action")
                    .settings(ActionBulkDisableVoiceResponse.Data.Settings.builder().build())
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionBulkDisableVoiceResponse =
            ActionBulkDisableVoiceResponse.builder()
                .data(
                    ActionBulkDisableVoiceResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkDisableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkDisableVoiceResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedActionBulkDisableVoiceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionBulkDisableVoiceResponse),
                jacksonTypeRef<ActionBulkDisableVoiceResponse>(),
            )

        assertThat(roundtrippedActionBulkDisableVoiceResponse)
            .isEqualTo(actionBulkDisableVoiceResponse)
    }
}
