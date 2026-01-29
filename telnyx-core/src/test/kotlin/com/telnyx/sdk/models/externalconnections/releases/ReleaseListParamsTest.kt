// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ReleaseListParamsTest {

    @Test
    fun create() {
        ReleaseListParams.builder()
            .id("id")
            .filter(
                ReleaseListParams.Filter.builder()
                    .civicAddressId(
                        ReleaseListParams.Filter.CivicAddressId.builder()
                            .eq("19990261512338516954")
                            .build()
                    )
                    .locationId(
                        ReleaseListParams.Filter.LocationId.builder()
                            .eq("19995665508264022121")
                            .build()
                    )
                    .phoneNumber(
                        ReleaseListParams.Filter.PhoneNumber.builder()
                            .contains("+123")
                            .eq("+1234567890")
                            .build()
                    )
                    .status(
                        ReleaseListParams.Filter.Status.builder()
                            .addEq(ReleaseListParams.Filter.Status.Eq.PENDING)
                            .addEq(ReleaseListParams.Filter.Status.Eq.IN_PROGRESS)
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
        val params = ReleaseListParams.builder().id("id").build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ReleaseListParams.builder()
                .id("id")
                .filter(
                    ReleaseListParams.Filter.builder()
                        .civicAddressId(
                            ReleaseListParams.Filter.CivicAddressId.builder()
                                .eq("19990261512338516954")
                                .build()
                        )
                        .locationId(
                            ReleaseListParams.Filter.LocationId.builder()
                                .eq("19995665508264022121")
                                .build()
                        )
                        .phoneNumber(
                            ReleaseListParams.Filter.PhoneNumber.builder()
                                .contains("+123")
                                .eq("+1234567890")
                                .build()
                        )
                        .status(
                            ReleaseListParams.Filter.Status.builder()
                                .addEq(ReleaseListParams.Filter.Status.Eq.PENDING)
                                .addEq(ReleaseListParams.Filter.Status.Eq.IN_PROGRESS)
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
                    .put("filter[phone_number][contains]", "+123")
                    .put("filter[phone_number][eq]", "+1234567890")
                    .put("filter[status][eq]", listOf("pending", "in_progress").joinToString(","))
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ReleaseListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
