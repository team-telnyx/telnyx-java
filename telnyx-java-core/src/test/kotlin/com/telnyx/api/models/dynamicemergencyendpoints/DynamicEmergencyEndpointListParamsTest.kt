// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyendpoints

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointListParamsTest {

    @Test
    fun create() {
        DynamicEmergencyEndpointListParams.builder()
            .filter(
                DynamicEmergencyEndpointListParams.Filter.builder()
                    .countryCode("country_code")
                    .status(DynamicEmergencyEndpointListParams.Filter.Status.PENDING)
                    .build()
            )
            .page(DynamicEmergencyEndpointListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DynamicEmergencyEndpointListParams.builder()
                .filter(
                    DynamicEmergencyEndpointListParams.Filter.builder()
                        .countryCode("country_code")
                        .status(DynamicEmergencyEndpointListParams.Filter.Status.PENDING)
                        .build()
                )
                .page(DynamicEmergencyEndpointListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_code]", "country_code")
                    .put("filter[status]", "pending")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DynamicEmergencyEndpointListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
