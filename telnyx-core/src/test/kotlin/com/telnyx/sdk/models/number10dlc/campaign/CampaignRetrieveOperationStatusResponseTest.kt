// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignRetrieveOperationStatusResponseTest {

    @Test
    fun create() {
        val campaignRetrieveOperationStatusResponse =
            CampaignRetrieveOperationStatusResponse.builder()
                .putAdditionalProperty("10017", JsonValue.from("bar"))
                .putAdditionalProperty("10035", JsonValue.from("bar"))
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignRetrieveOperationStatusResponse =
            CampaignRetrieveOperationStatusResponse.builder()
                .putAdditionalProperty("10017", JsonValue.from("bar"))
                .putAdditionalProperty("10035", JsonValue.from("bar"))
                .build()

        val roundtrippedCampaignRetrieveOperationStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignRetrieveOperationStatusResponse),
                jacksonTypeRef<CampaignRetrieveOperationStatusResponse>(),
            )

        assertThat(roundtrippedCampaignRetrieveOperationStatusResponse)
            .isEqualTo(campaignRetrieveOperationStatusResponse)
    }
}
