// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reputation.numbers

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberRetrieveParamsTest {

    @Test
    fun create() {
        NumberRetrieveParams.builder().phoneNumber("+19493253498").fresh(true).build()
    }

    @Test
    fun pathParams() {
        val params = NumberRetrieveParams.builder().phoneNumber("+19493253498").build()

        assertThat(params._pathParam(0)).isEqualTo("+19493253498")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params = NumberRetrieveParams.builder().phoneNumber("+19493253498").fresh(true).build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("fresh", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberRetrieveParams.builder().phoneNumber("+19493253498").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
