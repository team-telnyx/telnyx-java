// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.usagereports

import com.telnyx.api.core.http.Headers
import com.telnyx.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UsageReportGetOptionsParamsTest {

    @Test
    fun create() {
        UsageReportGetOptionsParams.builder()
            .product("product")
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun headers() {
        val params =
            UsageReportGetOptionsParams.builder()
                .product("product")
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
        val params = UsageReportGetOptionsParams.builder().build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }

    @Test
    fun queryParams() {
        val params =
            UsageReportGetOptionsParams.builder()
                .product("product")
                .authorizationBearer("authorization_bearer")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().put("product", "product").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = UsageReportGetOptionsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
