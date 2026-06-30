// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignGetOperationStatusResponseTest {

    @Test
    fun create() {
        val campaignGetOperationStatusResponse =
            CampaignGetOperationStatusResponse.builder()
                .putAdditionalProperty("10017", JsonValue.from("bar"))
                .putAdditionalProperty("10035", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignGetOperationStatusResponse =
            CampaignGetOperationStatusResponse.builder()
                .putAdditionalProperty("10017", JsonValue.from("bar"))
                .putAdditionalProperty("10035", JsonValue.from("bar"))
                .build()

        val roundtrippedCampaignGetOperationStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignGetOperationStatusResponse),
                jacksonTypeRef<CampaignGetOperationStatusResponse>(),
            )

        assertThat(roundtrippedCampaignGetOperationStatusResponse)
            .isEqualTo(campaignGetOperationStatusResponse)
    }
}
