// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.tunnels

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TunnelListParamsTest {

    @Test
    fun create() {
        TunnelListParams.builder()
            .filter(
                TunnelListParams.Filter.builder()
                    .name("chicago-dc")
                    .status(TunnelListParams.Filter.Status.HEALTHY)
                    .build()
            )
            .page(TunnelListParams.Page.builder().after("after").limit(1L).build())
            .sort(TunnelListParams.Sort.CREATED_AT_DESC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            TunnelListParams.builder()
                .filter(
                    TunnelListParams.Filter.builder()
                        .name("chicago-dc")
                        .status(TunnelListParams.Filter.Status.HEALTHY)
                        .build()
                )
                .page(TunnelListParams.Page.builder().after("after").limit(1L).build())
                .sort(TunnelListParams.Sort.CREATED_AT_DESC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "chicago-dc")
                    .put("filter[status]", "healthy")
                    .put("page[after]", "after")
                    .put("page[limit]", "1")
                    .put("sort", "-created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = TunnelListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
