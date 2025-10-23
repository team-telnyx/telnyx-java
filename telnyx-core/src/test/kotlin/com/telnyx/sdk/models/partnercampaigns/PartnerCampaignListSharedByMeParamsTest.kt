// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.partnercampaigns

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignListSharedByMeParamsTest {

    @Test
    fun create() {
        PartnerCampaignListSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            PartnerCampaignListSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "0").put("recordsPerPage", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PartnerCampaignListSharedByMeParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
