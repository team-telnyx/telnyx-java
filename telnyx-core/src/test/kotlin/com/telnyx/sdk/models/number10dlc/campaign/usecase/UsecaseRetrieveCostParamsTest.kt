// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaign.usecase

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsecaseRetrieveCostParamsTest {

    @Test
    fun create() {
        UsecaseRetrieveCostParams.builder().usecase("usecase").build()
    }

    @Test
    fun queryParams() {
        val params = UsecaseRetrieveCostParams.builder().usecase("usecase").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("usecase", "usecase").build())
    }
}
