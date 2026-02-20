// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.phonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListParamsTest {

    @Test
    fun create() {
        PhoneNumberListParams.builder()
            .id("1293384261075731499")
            .filter(
                PhoneNumberListParams.Filter.builder()
                    .civicAddressId(
                        PhoneNumberListParams.Filter.CivicAddressId.builder()
                            .eq("19990261512338516954")
                            .build()
                    )
                    .locationId(
                        PhoneNumberListParams.Filter.LocationId.builder()
                            .eq("19995665508264022121")
                            .build()
                    )
                    .phoneNumber(
                        PhoneNumberListParams.Filter.PhoneNumber.builder()
                            .contains("+1970")
                            .eq("+19705555098")
                            .build()
                    )
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberListParams.builder().id("1293384261075731499").build()

        assertThat(params._pathParam(0)).isEqualTo("1293384261075731499")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberListParams.builder()
                .id("1293384261075731499")
                .filter(
                    PhoneNumberListParams.Filter.builder()
                        .civicAddressId(
                            PhoneNumberListParams.Filter.CivicAddressId.builder()
                                .eq("19990261512338516954")
                                .build()
                        )
                        .locationId(
                            PhoneNumberListParams.Filter.LocationId.builder()
                                .eq("19995665508264022121")
                                .build()
                        )
                        .phoneNumber(
                            PhoneNumberListParams.Filter.PhoneNumber.builder()
                                .contains("+1970")
                                .eq("+19705555098")
                                .build()
                        )
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[civic_address_id][eq]", "19990261512338516954")
                    .put("filter[location_id][eq]", "19995665508264022121")
                    .put("filter[phone_number][contains]", "+1970")
                    .put("filter[phone_number][eq]", "+19705555098")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberListParams.builder().id("1293384261075731499").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
