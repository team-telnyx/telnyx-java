// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.associatedphonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssociatedPhoneNumberListParamsTest {

    @Test
    fun create() {
        AssociatedPhoneNumberListParams.builder()
            .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .filter(
                AssociatedPhoneNumberListParams.Filter.builder()
                    .action(AssociatedPhoneNumberListParams.Filter.Action.KEEP)
                    .phoneNumber("+441234567890")
                    .build()
            )
            .page(AssociatedPhoneNumberListParams.Page.builder().number(1L).size(1L).build())
            .sort(
                AssociatedPhoneNumberListParams.Sort.builder()
                    .value(AssociatedPhoneNumberListParams.Sort.Value.CREATED_AT_DESC)
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AssociatedPhoneNumberListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            AssociatedPhoneNumberListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .filter(
                    AssociatedPhoneNumberListParams.Filter.builder()
                        .action(AssociatedPhoneNumberListParams.Filter.Action.KEEP)
                        .phoneNumber("+441234567890")
                        .build()
                )
                .page(AssociatedPhoneNumberListParams.Page.builder().number(1L).size(1L).build())
                .sort(
                    AssociatedPhoneNumberListParams.Sort.builder()
                        .value(AssociatedPhoneNumberListParams.Sort.Value.CREATED_AT_DESC)
                        .build()
                )
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[action]", "keep")
                    .put("filter[phone_number]", "+441234567890")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .put("sort[value]", "-created_at")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            AssociatedPhoneNumberListParams.builder()
                .portingOrderId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
