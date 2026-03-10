// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcards.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBulkEnableVoiceResponseTest {

    @Test
    fun create() {
        val actionBulkEnableVoiceResponse =
            ActionBulkEnableVoiceResponse.builder()
                .data(
                    ActionBulkEnableVoiceResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkEnableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkEnableVoiceResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(actionBulkEnableVoiceResponse.data())
            .contains(
                ActionBulkEnableVoiceResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .actionType(ActionBulkEnableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS)
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("bulk_sim_card_action")
                    .settings(ActionBulkEnableVoiceResponse.Data.Settings.builder().build())
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionBulkEnableVoiceResponse =
            ActionBulkEnableVoiceResponse.builder()
                .data(
                    ActionBulkEnableVoiceResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .actionType(
                            ActionBulkEnableVoiceResponse.Data.ActionType.BULK_SET_PUBLIC_IPS
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("bulk_sim_card_action")
                        .settings(ActionBulkEnableVoiceResponse.Data.Settings.builder().build())
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedActionBulkEnableVoiceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionBulkEnableVoiceResponse),
                jacksonTypeRef<ActionBulkEnableVoiceResponse>(),
            )

        assertThat(roundtrippedActionBulkEnableVoiceResponse)
            .isEqualTo(actionBulkEnableVoiceResponse)
    }
}
