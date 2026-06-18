// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderListParamsTest {

    @Test
    fun create() {
        AuthenticationProviderListParams.builder()
            .pageNumber(0L)
            .pageSize(0L)
            .sort(AuthenticationProviderListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuthenticationProviderListParams.builder()
                .pageNumber(0L)
                .pageSize(0L)
                .sort(AuthenticationProviderListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", "name")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = AuthenticationProviderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
