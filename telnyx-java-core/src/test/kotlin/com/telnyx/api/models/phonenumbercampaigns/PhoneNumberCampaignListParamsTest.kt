// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.phonenumbercampaigns

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberCampaignListParamsTest {

    @Test
    fun create() {
        PhoneNumberCampaignListParams.builder()
            .filter(
                PhoneNumberCampaignListParams.Filter.builder()
                    .tcrBrandId("BRANDID")
                    .tcrCampaignId("CAMPID3")
                    .telnyxBrandId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                    .telnyxCampaignId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                    .build()
            )
            .page(0L)
            .recordsPerPage(0L)
            .sort(PhoneNumberCampaignListParams.Sort.ASSIGNMENT_STATUS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberCampaignListParams.builder()
                .filter(
                    PhoneNumberCampaignListParams.Filter.builder()
                        .tcrBrandId("BRANDID")
                        .tcrCampaignId("CAMPID3")
                        .telnyxBrandId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                        .telnyxCampaignId("f3575e15-32ce-400e-a4c0-dd78800c20b0")
                        .build()
                )
                .page(0L)
                .recordsPerPage(0L)
                .sort(PhoneNumberCampaignListParams.Sort.ASSIGNMENT_STATUS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[tcr_brand_id]", "BRANDID")
                    .put("filter[tcr_campaign_id]", "CAMPID3")
                    .put("filter[telnyx_brand_id]", "f3575e15-32ce-400e-a4c0-dd78800c20b0")
                    .put("filter[telnyx_campaign_id]", "f3575e15-32ce-400e-a4c0-dd78800c20b0")
                    .put("page", "0")
                    .put("recordsPerPage", "0")
                    .put("sort", "assignmentStatus")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberCampaignListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
