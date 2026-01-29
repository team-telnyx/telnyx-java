// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyaddresses

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyAddressListParamsTest {

    @Test
    fun create() {
        DynamicEmergencyAddressListParams.builder()
            .filter(
                DynamicEmergencyAddressListParams.Filter.builder()
                    .countryCode("country_code")
                    .status(DynamicEmergencyAddressListParams.Filter.Status.PENDING)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DynamicEmergencyAddressListParams.builder()
                .filter(
                    DynamicEmergencyAddressListParams.Filter.builder()
                        .countryCode("country_code")
                        .status(DynamicEmergencyAddressListParams.Filter.Status.PENDING)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_code]", "country_code")
                    .put("filter[status]", "pending")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DynamicEmergencyAddressListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
