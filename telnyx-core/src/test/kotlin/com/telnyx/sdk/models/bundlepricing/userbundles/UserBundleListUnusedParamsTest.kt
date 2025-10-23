// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.userbundles

import com.telnyx.sdk.core.http.Headers
import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleListUnusedParamsTest {

    @Test
    fun create() {
        UserBundleListUnusedParams.builder()
            .filter(
                UserBundleListUnusedParams.Filter.builder()
                    .addCountryIso("US")
                    .addResource("+15617819942")
                    .build()
            )
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun headers() {
        val params =
            UserBundleListUnusedParams.builder()
                .filter(
                    UserBundleListUnusedParams.Filter.builder()
                        .addCountryIso("US")
                        .addResource("+15617819942")
                        .build()
                )
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
        val params = UserBundleListUnusedParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            UserBundleListUnusedParams.builder()
                .filter(
                    UserBundleListUnusedParams.Filter.builder()
                        .addCountryIso("US")
                        .addResource("+15617819942")
                        .build()
                )
                .authorizationBearer("authorization_bearer")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[country_iso]", listOf("US").joinToString(","))
                    .put("filter[resource]", listOf("+15617819942").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UserBundleListUnusedParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
