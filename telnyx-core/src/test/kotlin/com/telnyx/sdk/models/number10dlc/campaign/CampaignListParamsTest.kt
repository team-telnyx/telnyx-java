// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CampaignListParamsTest {

    @Test
    fun create() {
        CampaignListParams.builder()
            .brandId("brandId")
            .page(0L)
            .recordsPerPage(0L)
            .sort(CampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CampaignListParams.builder()
                .brandId("brandId")
                .page(0L)
                .recordsPerPage(0L)
                .sort(CampaignListParams.Sort.ASSIGNED_PHONE_NUMBERS_COUNT)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("brandId", "brandId")
                    .put("page", "0")
                    .put("recordsPerPage", "0")
                    .put("sort", "assignedPhoneNumbersCount")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CampaignListParams.builder().brandId("brandId").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("brandId", "brandId").build())
    }
}
