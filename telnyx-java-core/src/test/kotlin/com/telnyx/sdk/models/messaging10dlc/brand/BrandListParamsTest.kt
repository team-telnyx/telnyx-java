// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandListParamsTest {

    @Test
    fun create() {
        BrandListParams.builder()
            .brandId("826ef77a-348c-445b-81a5-a9b13c68fbfe")
            .country("country")
            .displayName("displayName")
            .entityType("entityType")
            .page(1L)
            .recordsPerPage(0L)
            .sort(BrandListParams.Sort.ASSIGNED_CAMPAIGNS_COUNT)
            .state("state")
            .tcrBrandId("BBAND1")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            BrandListParams.builder()
                .brandId("826ef77a-348c-445b-81a5-a9b13c68fbfe")
                .country("country")
                .displayName("displayName")
                .entityType("entityType")
                .page(1L)
                .recordsPerPage(0L)
                .sort(BrandListParams.Sort.ASSIGNED_CAMPAIGNS_COUNT)
                .state("state")
                .tcrBrandId("BBAND1")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("brandId", "826ef77a-348c-445b-81a5-a9b13c68fbfe")
                    .put("country", "country")
                    .put("displayName", "displayName")
                    .put("entityType", "entityType")
                    .put("page", "1")
                    .put("recordsPerPage", "0")
                    .put("sort", "assignedCampaignsCount")
                    .put("state", "state")
                    .put("tcrBrandId", "BBAND1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = BrandListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
