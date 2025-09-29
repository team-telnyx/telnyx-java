// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.partnercampaigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignRetrieveSharingStatusResponseTest {

    @Test
    fun create() {
        val partnerCampaignRetrieveSharingStatusResponse =
            PartnerCampaignRetrieveSharingStatusResponse.builder()
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
        val partnerCampaignRetrieveSharingStatusResponse =
            PartnerCampaignRetrieveSharingStatusResponse.builder()
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

        val roundtrippedPartnerCampaignRetrieveSharingStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(partnerCampaignRetrieveSharingStatusResponse),
                jacksonTypeRef<PartnerCampaignRetrieveSharingStatusResponse>(),
            )

        assertThat(roundtrippedPartnerCampaignRetrieveSharingStatusResponse)
            .isEqualTo(partnerCampaignRetrieveSharingStatusResponse)
    }
}
