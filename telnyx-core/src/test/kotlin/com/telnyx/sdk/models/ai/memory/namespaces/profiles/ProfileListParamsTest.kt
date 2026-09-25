// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.memory.namespaces.profiles

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProfileListParamsTest {

    @Test
    fun create() {
        ProfileListParams.builder().namespace("namespace").pageNumber(1L).pageSize(1L).build()
    }

    @Test
    fun pathParams() {
        val params = ProfileListParams.builder().namespace("namespace").build()

        assertThat(params._pathParam(0)).isEqualTo("namespace")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            ProfileListParams.builder().namespace("namespace").pageNumber(1L).pageSize(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder().put("page[number]", "1").put("page[size]", "1").build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ProfileListParams.builder().namespace("namespace").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
