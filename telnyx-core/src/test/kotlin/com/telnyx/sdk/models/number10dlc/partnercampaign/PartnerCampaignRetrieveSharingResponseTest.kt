// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaign

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignRetrieveSharingResponseTest {

    @Test
    fun create() {
        val partnerCampaignRetrieveSharingResponse =
            PartnerCampaignRetrieveSharingResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "downstreamCnpId" to "downstreamCnpId",
                            "sharedDate" to "sharedDate",
                            "sharingStatus" to "sharingStatus",
                            "statusDate" to "statusDate",
                            "upstreamCnpId" to "upstreamCnpId",
                        )
                    ),
                )
                .build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val partnerCampaignRetrieveSharingResponse =
            PartnerCampaignRetrieveSharingResponse.builder()
                .putAdditionalProperty(
                    "foo",
                    JsonValue.from(
                        mapOf(
                            "downstreamCnpId" to "downstreamCnpId",
                            "sharedDate" to "sharedDate",
                            "sharingStatus" to "sharingStatus",
                            "statusDate" to "statusDate",
                            "upstreamCnpId" to "upstreamCnpId",
                        )
                    ),
                )
                .build()

        val roundtrippedPartnerCampaignRetrieveSharingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignRetrieveSharingResponse),
                jacksonTypeRef<PartnerCampaignRetrieveSharingResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignRetrieveSharingResponse)
            .isEqualTo(partnerCampaignRetrieveSharingResponse)
    }
}
