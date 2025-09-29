// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifiednumbers

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberListParamsTest {

    @Test
    fun create() {
        VerifiedNumberListParams.builder()
            .page(VerifiedNumberListParams.Page.builder().number(0L).size(0L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerifiedNumberListParams.builder()
                .page(VerifiedNumberListParams.Page.builder().number(0L).size(0L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "0").put("page[size]", "0").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VerifiedNumberListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
