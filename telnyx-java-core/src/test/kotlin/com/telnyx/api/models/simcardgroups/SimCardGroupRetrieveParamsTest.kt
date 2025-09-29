// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.simcardgroups

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SimCardGroupRetrieveParamsTest {

    @Test
    fun create() {
        SimCardGroupRetrieveParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .includeIccids(true)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            SimCardGroupRetrieveParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            SimCardGroupRetrieveParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .includeIccids(true)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("include_iccids", "true").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            SimCardGroupRetrieveParams.builder().id("6a09cdc3-8948-47f0-aa62-74ac943d6c58").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
