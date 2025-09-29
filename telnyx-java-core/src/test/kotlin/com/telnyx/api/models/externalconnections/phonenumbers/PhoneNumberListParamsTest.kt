// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.externalconnections.phonenumbers

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListParamsTest {

    @Test
    fun create() {
        PhoneNumberListParams.builder()
            .id("id")
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
            .page(PhoneNumberListParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params = PhoneNumberListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PhoneNumberListParams.builder()
                .id("id")
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
                .page(PhoneNumberListParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[civic_address_id][eq]", "19990261512338516954")
                    .put("filter[location_id][eq]", "19995665508264022121")
                    .put("filter[phone_number][contains]", "+1970")
                    .put("filter[phone_number][eq]", "+19705555098")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
