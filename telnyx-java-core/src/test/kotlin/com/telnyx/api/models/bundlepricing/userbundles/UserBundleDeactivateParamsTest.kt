// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.bundlepricing.userbundles

import com.telnyx.api.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UserBundleDeactivateParamsTest {

    @Test
    fun create() {
        UserBundleDeactivateParams.builder()
            .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UserBundleDeactivateParams.builder()
                .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            UserBundleDeactivateParams.builder()
                .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
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
        val params =
            UserBundleDeactivateParams.builder()
                .userBundleId("ca1d2263-d1f1-43ac-ba53-248e7a4bb26a")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
