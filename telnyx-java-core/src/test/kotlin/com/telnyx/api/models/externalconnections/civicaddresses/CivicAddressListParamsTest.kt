// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.civicaddresses

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CivicAddressListParamsTest {

    @Test
    fun create() {
        CivicAddressListParams.builder()
            .id("id")
            .filter(
                CivicAddressListParams.Filter.builder()
                    .country(listOf("US", "CA", "MX", "BR"))
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params = CivicAddressListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            CivicAddressListParams.builder()
                .id("id")
                .filter(
                    CivicAddressListParams.Filter.builder()
                        .country(listOf("US", "CA", "MX", "BR"))
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country]", listOf("US", "CA", "MX", "BR").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = CivicAddressListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
