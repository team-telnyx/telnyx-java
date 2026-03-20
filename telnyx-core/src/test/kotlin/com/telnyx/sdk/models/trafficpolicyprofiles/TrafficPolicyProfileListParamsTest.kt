// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileListParamsTest {

    @Test
    fun create() {
        TrafficPolicyProfileListParams.builder()
            .filterService("filter[service]")
            .filterType(TrafficPolicyProfileListParams.FilterType.WHITELIST)
            .pageNumber(1L)
            .pageSize(1L)
            .sort(TrafficPolicyProfileListParams.Sort.SERVICE)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TrafficPolicyProfileListParams.builder()
                .filterService("filter[service]")
                .filterType(TrafficPolicyProfileListParams.FilterType.WHITELIST)
                .pageNumber(1L)
                .pageSize(1L)
                .sort(TrafficPolicyProfileListParams.Sort.SERVICE)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[service]", "filter[service]")
                    .put("filter[type]", "whitelist")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "service")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TrafficPolicyProfileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
