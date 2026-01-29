// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardpeers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardPeerListParamsTest {

    @Test
    fun create() {
        WireguardPeerListParams.builder()
            .filter(
                WireguardPeerListParams.Filter.builder()
                    .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WireguardPeerListParams.builder()
                .filter(
                    WireguardPeerListParams.Filter.builder()
                        .wireguardInterfaceId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[wireguard_interface_id]", "6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WireguardPeerListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
