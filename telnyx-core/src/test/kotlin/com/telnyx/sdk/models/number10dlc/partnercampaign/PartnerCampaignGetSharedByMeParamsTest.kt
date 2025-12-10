// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.partnercampaign

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PartnerCampaignGetSharedByMeParamsTest {

    @Test
    fun create() {
        PartnerCampaignGetSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()
    }

    @Test
    fun queryParams() {
        val params =
            PartnerCampaignGetSharedByMeParams.builder().page(0L).recordsPerPage(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "0").put("recordsPerPage", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PartnerCampaignGetSharedByMeParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
