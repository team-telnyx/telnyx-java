// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireguardinterfaces

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireguardInterfaceListParamsTest {

    @Test
    fun create() {
        WireguardInterfaceListParams.builder()
            .filter(
                WireguardInterfaceListParams.Filter.builder()
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
            .page(WireguardInterfaceListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            WireguardInterfaceListParams.builder()
                .filter(
                    WireguardInterfaceListParams.Filter.builder()
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .page(WireguardInterfaceListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[network_id]", "6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = WireguardInterfaceListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
