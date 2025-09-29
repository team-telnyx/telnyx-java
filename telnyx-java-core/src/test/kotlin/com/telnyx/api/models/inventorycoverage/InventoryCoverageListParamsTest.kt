// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.inventorycoverage

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InventoryCoverageListParamsTest {

    @Test
    fun create() {
        InventoryCoverageListParams.builder()
            .filter(
                InventoryCoverageListParams.Filter.builder()
                    .administrativeArea("administrative_area")
                    .count(true)
                    .countryCode(InventoryCoverageListParams.Filter.CountryCode.AT)
                    .addFeature(InventoryCoverageListParams.Filter.Feature.SMS)
                    .groupBy(InventoryCoverageListParams.Filter.GroupBy.LOCALITY)
                    .npa(0L)
                    .nxx(0L)
                    .phoneNumberType(InventoryCoverageListParams.Filter.PhoneNumberType.LOCAL)
                    .build()
            )
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            InventoryCoverageListParams.builder()
                .filter(
                    InventoryCoverageListParams.Filter.builder()
                        .administrativeArea("administrative_area")
                        .count(true)
                        .countryCode(InventoryCoverageListParams.Filter.CountryCode.AT)
                        .addFeature(InventoryCoverageListParams.Filter.Feature.SMS)
                        .groupBy(InventoryCoverageListParams.Filter.GroupBy.LOCALITY)
                        .npa(0L)
                        .nxx(0L)
                        .phoneNumberType(InventoryCoverageListParams.Filter.PhoneNumberType.LOCAL)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[administrative_area]", "administrative_area")
                    .put("filter[count]", "true")
                    .put("filter[country_code]", "AT")
                    .put("filter[features]", listOf("sms").joinToString(","))
                    .put("filter[groupBy]", "locality")
                    .put("filter[npa]", "0")
                    .put("filter[nxx]", "0")
                    .put("filter[phone_number_type]", "local")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = InventoryCoverageListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
