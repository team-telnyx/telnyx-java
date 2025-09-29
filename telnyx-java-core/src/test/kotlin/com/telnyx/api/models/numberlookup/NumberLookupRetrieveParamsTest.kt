// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.numberlookup

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupRetrieveParamsTest {

    @Test
    fun create() {
        NumberLookupRetrieveParams.builder()
            .phoneNumber("+18665552368")
            .type(NumberLookupRetrieveParams.Type.CARRIER)
            .build()
    }

    @Test
    fun pathParams() {
        val params = NumberLookupRetrieveParams.builder().phoneNumber("+18665552368").build()

        assertThat(params._pathParam(0)).isEqualTo("+18665552368")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NumberLookupRetrieveParams.builder()
                .phoneNumber("+18665552368")
                .type(NumberLookupRetrieveParams.Type.CARRIER)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("type", "carrier").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberLookupRetrieveParams.builder().phoneNumber("+18665552368").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
