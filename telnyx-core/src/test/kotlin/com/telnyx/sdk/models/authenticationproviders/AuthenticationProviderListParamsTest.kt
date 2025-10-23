// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.authenticationproviders

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AuthenticationProviderListParamsTest {

    @Test
    fun create() {
        AuthenticationProviderListParams.builder()
            .page(AuthenticationProviderListParams.Page.builder().number(1L).size(1L).build())
            .sort(AuthenticationProviderListParams.Sort.NAME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            AuthenticationProviderListParams.builder()
                .page(AuthenticationProviderListParams.Page.builder().number(1L).size(1L).build())
                .sort(AuthenticationProviderListParams.Sort.NAME)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
