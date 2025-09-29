// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.useraddresses

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserAddressListParamsTest {

    @Test
    fun create() {
        UserAddressListParams.builder()
            .filter(
                UserAddressListParams.Filter.builder()
                    .customerReference(
                        UserAddressListParams.Filter.CustomerReference.builder()
                            .contains("contains")
                            .eq("eq")
                            .build()
                    )
                    .streetAddress(
                        UserAddressListParams.Filter.StreetAddress.builder()
                            .contains("contains")
                            .build()
                    )
                    .build()
            )
            .page(UserAddressListParams.Page.builder().number(1L).size(1L).build())
            .sort(UserAddressListParams.Sort.STREET_ADDRESS)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UserAddressListParams.builder()
                .filter(
                    UserAddressListParams.Filter.builder()
                        .customerReference(
                            UserAddressListParams.Filter.CustomerReference.builder()
                                .contains("contains")
                                .eq("eq")
                                .build()
                        )
                        .streetAddress(
                            UserAddressListParams.Filter.StreetAddress.builder()
                                .contains("contains")
                                .build()
                        )
                        .build()
                )
                .page(UserAddressListParams.Page.builder().number(1L).size(1L).build())
                .sort(UserAddressListParams.Sort.STREET_ADDRESS)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[customer_reference][contains]", "contains")
                    .put("filter[customer_reference][eq]", "eq")
                    .put("filter[street_address][contains]", "contains")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort", "street_address")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserAddressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
