// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignSubmitAppealResponseTest {

    @Test
    fun create() {
        val campaignSubmitAppealResponse =
            CampaignSubmitAppealResponse.builder()
                .appealedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(campaignSubmitAppealResponse.appealedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val campaignSubmitAppealResponse =
            CampaignSubmitAppealResponse.builder()
                .appealedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedCampaignSubmitAppealResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(campaignSubmitAppealResponse),
                jacksonTypeRef<CampaignSubmitAppealResponse>(),
            )

        assertThat(roundtrippedCampaignSubmitAppealResponse).isEqualTo(campaignSubmitAppealResponse)
    }
}
