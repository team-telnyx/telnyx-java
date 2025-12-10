// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifyprofiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifyProfileListParamsTest {

    @Test
    fun create() {
        VerifyProfileListParams.builder()
            .filter(VerifyProfileListParams.Filter.builder().name("name").build())
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerifyProfileListParams.builder()
                .filter(VerifyProfileListParams.Filter.builder().name("name").build())
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[name]", "name")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VerifyProfileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
