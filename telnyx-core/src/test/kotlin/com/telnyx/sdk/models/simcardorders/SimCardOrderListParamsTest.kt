// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.simcardorders

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardOrderListParamsTest {

    @Test
    fun create() {
        SimCardOrderListParams.builder()
            .filter(
                SimCardOrderListParams.Filter.builder()
                    .addressAdministrativeArea("TX")
                    .addressCountryCode("US")
                    .addressExtendedAddress("14th Floor")
                    .addressId("1293384261075731499")
                    .addressLocality("Austin")
                    .addressPostalCode("78701")
                    .addressStreetAddress("600 Congress Avenue")
                    .costAmount("2.53")
                    .costCurrency("USD")
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .quantity(21L)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
            .page(SimCardOrderListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            SimCardOrderListParams.builder()
                .filter(
                    SimCardOrderListParams.Filter.builder()
                        .addressAdministrativeArea("TX")
                        .addressCountryCode("US")
                        .addressExtendedAddress("14th Floor")
                        .addressId("1293384261075731499")
                        .addressLocality("Austin")
                        .addressPostalCode("78701")
                        .addressStreetAddress("600 Congress Avenue")
                        .costAmount("2.53")
                        .costCurrency("USD")
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .quantity(21L)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .page(SimCardOrderListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[address.administrative_area]", "TX")
                    .put("filter[address.country_code]", "US")
                    .put("filter[address.extended_address]", "14th Floor")
                    .put("filter[address.id]", "1293384261075731499")
                    .put("filter[address.locality]", "Austin")
                    .put("filter[address.postal_code]", "78701")
                    .put("filter[address.street_address]", "600 Congress Avenue")
                    .put("filter[cost.amount]", "2.53")
                    .put("filter[cost.currency]", "USD")
                    .put("filter[created_at]", "2018-02-02T22:25:27.521Z")
                    .put("filter[quantity]", "21")
                    .put("filter[updated_at]", "2018-02-02T22:25:27.521Z")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = SimCardOrderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
