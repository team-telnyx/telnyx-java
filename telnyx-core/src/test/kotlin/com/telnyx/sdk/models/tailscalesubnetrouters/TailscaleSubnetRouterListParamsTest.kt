// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tailscalesubnetrouters

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TailscaleSubnetRouterListParamsTest {

    @Test
    fun create() {
        TailscaleSubnetRouterListParams.builder()
            .filter(
                TailscaleSubnetRouterListParams.Filter.builder()
                    .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TailscaleSubnetRouterListParams.builder()
                .filter(
                    TailscaleSubnetRouterListParams.Filter.builder()
                        .networkId("0de011ae-ee53-4df4-ba96-754728eb5aad")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[network_id]", "0de011ae-ee53-4df4-ba96-754728eb5aad")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TailscaleSubnetRouterListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
