// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.numberlookup

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberLookupListParamsTest {

    @Test
    fun create() {
        NumberLookupListParams.builder().page(0).perPage(0).build()
    }

    @Test
    fun queryParams() {
        val params = NumberLookupListParams.builder().page(0).perPage(0).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("page", "0").put("per_page", "0").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NumberLookupListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
