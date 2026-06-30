// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkListInterfacesParamsTest {

    @Test
    fun create() {
        NetworkListInterfacesParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .filter(
                NetworkListInterfacesParams.Filter.builder()
                    .name("test interface")
                    .status(InterfaceStatus.PROVISIONED)
                    .type("wireguard_interface")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NetworkListInterfacesParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NetworkListInterfacesParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .filter(
                    NetworkListInterfacesParams.Filter.builder()
                        .name("test interface")
                        .status(InterfaceStatus.PROVISIONED)
                        .type("wireguard_interface")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "test interface")
                    .put("filter[status]", "provisioned")
                    .put("filter[type]", "wireguard_interface")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NetworkListInterfacesParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
