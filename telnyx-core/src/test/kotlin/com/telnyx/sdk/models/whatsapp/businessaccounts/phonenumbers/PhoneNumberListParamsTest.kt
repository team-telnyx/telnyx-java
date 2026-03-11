// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PhoneNumberListParamsTest {

    @Test
    fun create() {
        PhoneNumberListParams.builder().id("id").pageNumber(0L).pageSize(0L).build()
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
        val params = PhoneNumberListParams.builder().id("id").pageNumber(0L).pageSize(0L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "0").put("page[size]", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = PhoneNumberListParams.builder().id("id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
