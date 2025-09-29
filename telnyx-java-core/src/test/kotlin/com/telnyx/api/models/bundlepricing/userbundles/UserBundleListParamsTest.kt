// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleListParamsTest {

    @Test
    fun create() {
        UserBundleListParams.builder()
            .filter(
                UserBundleListParams.Filter.builder()
                    .addCountryIso("US")
                    .addResource("+15617819942")
                    .build()
            )
            .page(UserBundleListParams.Page.builder().number(1L).size(1L).build())
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun headers() {
        val params =
            UserBundleListParams.builder()
                .filter(
                    UserBundleListParams.Filter.builder()
                        .addCountryIso("US")
                        .addResource("+15617819942")
                        .build()
                )
                .page(UserBundleListParams.Page.builder().number(1L).size(1L).build())
                .authorizationBearer("authorization_bearer")
                .build()

        val headers = params._headers()

        assertThat(headers)
            .isEqualTo(
                Headers.builder().put("authorization_bearer", "authorization_bearer").build()
            )
    }

    @Test
    fun headersWithoutOptionalFields() {
        val params = UserBundleListParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            UserBundleListParams.builder()
                .filter(
                    UserBundleListParams.Filter.builder()
                        .addCountryIso("US")
                        .addResource("+15617819942")
                        .build()
                )
                .page(UserBundleListParams.Page.builder().number(1L).size(1L).build())
                .authorizationBearer("authorization_bearer")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_iso]", listOf("US").joinToString(","))
                    .put("filter[resource]", listOf("+15617819942").joinToString(","))
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserBundleListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
