// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.usertags

import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserTagListParamsTest {

    @Test
    fun create() {
        UserTagListParams.builder()
            .filter(UserTagListParams.Filter.builder().startsWith("my-tag").build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            UserTagListParams.builder()
                .filter(UserTagListParams.Filter.builder().startsWith("my-tag").build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("filter[starts_with]", "my-tag").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserTagListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
