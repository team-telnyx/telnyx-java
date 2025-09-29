// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.partnercampaigns

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListParamsTest {

    @Test
    fun create() {
        PartnerCampaignListParams.builder()
            .page(0L)
            .recordsPerPage(0L)
            .sort(PartnerCampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            PartnerCampaignListParams.builder()
                .page(0L)
                .recordsPerPage(0L)
                .sort(PartnerCampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page", "0")
                    .put("recordsPerPage", "0")
                    .put("sort", "assignedPhoneNumbersCount")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PartnerCampaignListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
