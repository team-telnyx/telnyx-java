// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.bundlepricing.billingbundles

import com.telnyx.sdk.core.http.Headers
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BillingBundleRetrieveParamsTest {

    @Test
    fun create() {
        BillingBundleRetrieveParams.builder()
            .bundleId("8661948c-a386-4385-837f-af00f40f111a")
            .authorizationBearer("authorization_bearer")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BillingBundleRetrieveParams.builder()
                .bundleId("8661948c-a386-4385-837f-af00f40f111a")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("8661948c-a386-4385-837f-af00f40f111a")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun headers() {
        val params =
            BillingBundleRetrieveParams.builder()
                .bundleId("8661948c-a386-4385-837f-af00f40f111a")
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
            BillingBundleRetrieveParams.builder()
                .bundleId("8661948c-a386-4385-837f-af00f40f111a")
                .build()

        val headers = params._headers()

        assertThat(headers).isEqualTo(Headers.builder().build())
    }
}
