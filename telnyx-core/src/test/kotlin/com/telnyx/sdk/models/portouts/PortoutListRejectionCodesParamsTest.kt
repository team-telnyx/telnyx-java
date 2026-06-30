// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portouts

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortoutListRejectionCodesParamsTest {

    @Test
    fun create() {
        PortoutListRejectionCodesParams.builder()
            .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
            .filter(PortoutListRejectionCodesParams.Filter.builder().code(1002L).build())
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PortoutListRejectionCodesParams.builder()
                .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("329d6658-8f93-405d-862f-648776e8afd7")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            PortoutListRejectionCodesParams.builder()
                .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                .filter(PortoutListRejectionCodesParams.Filter.builder().code(1002L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("filter[code]", "1002").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            PortoutListRejectionCodesParams.builder()
                .portoutId("329d6658-8f93-405d-862f-648776e8afd7")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
