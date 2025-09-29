// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.mobilenetworkoperators

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MobileNetworkOperatorListParamsTest {

    @Test
    fun create() {
        MobileNetworkOperatorListParams.builder()
            .filter(
                MobileNetworkOperatorListParams.Filter.builder()
                    .countryCode("US")
                    .mcc("310")
                    .mnc("410")
                    .name(
                        MobileNetworkOperatorListParams.Filter.Name.builder()
                            .contains("T&T")
                            .endsWith("T")
                            .startsWith("AT")
                            .build()
                    )
                    .networkPreferencesEnabled(true)
                    .tadig("USACG")
                    .build()
            )
            .page(MobileNetworkOperatorListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MobileNetworkOperatorListParams.builder()
                .filter(
                    MobileNetworkOperatorListParams.Filter.builder()
                        .countryCode("US")
                        .mcc("310")
                        .mnc("410")
                        .name(
                            MobileNetworkOperatorListParams.Filter.Name.builder()
                                .contains("T&T")
                                .endsWith("T")
                                .startsWith("AT")
                                .build()
                        )
                        .networkPreferencesEnabled(true)
                        .tadig("USACG")
                        .build()
                )
                .page(MobileNetworkOperatorListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_code]", "US")
                    .put("filter[mcc]", "310")
                    .put("filter[mnc]", "410")
                    .put("filter[name][contains]", "T&T")
                    .put("filter[name][ends_with]", "T")
                    .put("filter[name][starts_with]", "AT")
                    .put("filter[network_preferences_enabled]", "true")
                    .put("filter[tadig]", "USACG")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = MobileNetworkOperatorListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
